/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl.parser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import org.openmuc.jeebus.spine.utils.SpineXsdClassRegistry;
import org.openmuc.jeebus.spine.utils.datatypes.Pair;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.DatagramType;
import org.openmuc.jeebus.spine.xsd.v1.SpecificationVersionDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MessageParser {
    public static final ObjectMapper objectMapper = JsonMapper
        .builder()
        .serializationInclusion(JsonInclude.Include.NON_EMPTY)
        .addModule(new JakartaXmlBindAnnotationModule())
        .addModule(new ArrayObjectFixupModule(SpineXsdClassRegistry::isSpineDataClass))
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
        .build();

    private static final List<Pair<String, Predicate<CmdType>>> functionFields;

    static {
        // This fixes XML propOrders being ignored.
        objectMapper.setAnnotationIntrospector(
            new AnnotationIntrospectorPair(
                new MergingJakartaXmlBindAnnotationIntrospector(objectMapper.getTypeFactory()),
                new JacksonAnnotationIntrospector()
            )
        );
        /* This fixes an @XmlValue annotation being ignored.
         * Issue: https://github.com/FasterXML/jackson-dataformat-xml/issues/559 */
        objectMapper.addMixIn(
            SpecificationVersionDataType.class,
            SpecificationVersionDataTypeMixIn.class
        );

        // setup for getFunctionName()
        functionFields = Arrays.stream(CmdType.class.getDeclaredFields())
            .filter(fld -> {
                String fieldName = fld.getName();
                return !fieldName.equals("function")
                    && !fieldName.equals("lastUpdateAt")
                    && !fieldName.equals(
                    "manufacturerSpecificExtension")
                    && !fieldName.equals("filter");
            })
            .map(fld -> {
                fld.setAccessible(true);
                return Pair.<String, Predicate<CmdType>>of(fld.getName(), cmd -> {
                    try {
                        Object val = fld.get(cmd);
                        return val != null && (!(val instanceof List) || !((List<?>) val).isEmpty());
                    }
                    catch (IllegalAccessException e) {
                        // should never happen!
                        throw new RuntimeException(e);
                    }
                });
            })
            .collect(Collectors.toList());
    }

    private static final Logger LOGGER
        = LoggerFactory.getLogger(MessageParser.class);

    private MessageParser() {
        throw new IllegalStateException("Utility class");
    }

    public static void enablePrettyPrint() {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static byte[] toJson(DatagramType datagram) {
        try {
            MessageWrapper wrapper = new MessageWrapper(datagram);
            if (LOGGER.isTraceEnabled()) {
                LOGGER.trace(objectMapper.writeValueAsString(wrapper));
            }
            return objectMapper.writeValueAsBytes(wrapper);
        }
        catch (JsonProcessingException e) {
            LOGGER.error("Error while parsing datagram to json: {}", e.getMessage());
            LOGGER.trace("Stacktrace: ", e);
            return null;
        }
    }

    public static String getFunctionName(CmdType cmd) {
        String functionName = null;
        for (Pair<String, Predicate<CmdType>> functionField : functionFields) {
            if (functionField.getRight().test(cmd)) {
                functionName = functionField.getLeft();
            }
        }
        if (functionName == null) {
            String functionField = cmd.getFunction();
            if (functionField != null) {
                LOGGER.warn(
                    "SPINE function `{}` is missing in datagram, but field `function` is set to {}."
                        + " This probably indicates an implementation error from the client!",
                    functionField,
                    functionField
                );
                functionName = functionField;
            }
        }
        return functionName;
    }

    public static DatagramType fromJson(byte[] json) {
        try {
            return objectMapper.readValue(json, MessageWrapper.class).getDatagram();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
