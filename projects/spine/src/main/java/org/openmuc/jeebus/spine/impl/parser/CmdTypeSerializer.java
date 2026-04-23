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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.io.IOException;
import java.util.List;

public class CmdTypeSerializer extends ArrayObjectSerializer {
    public CmdTypeSerializer(BeanDescription beanDesc) {
        super(beanDesc);
        assert beanDesc.getBeanClass() == CmdType.class;
    }

    @Override
    public void serialize(
        Object value,
        JsonGenerator gen,
        SerializerProvider serializers
    ) throws IOException {
        if (!(value instanceof CmdType)) {
            // takes care of nulls and wrong types
            super.serialize(value, gen, serializers);
            return;
        }
        CmdType cmd = (CmdType) value;
        JsonSerializer<Object> filterSerializer
            = serializers.findValueSerializer(FilterType.class);
        gen.writeStartArray(value);
        {
            for (PropertyInfo property : properties) {
                if (property.definition.getName().equals("filter")) {
                    List<FilterType> filters = cmd.getFilter();
                    if (!filters.isEmpty()) {
                        gen.writeStartObject(cmd);
                        gen.writeFieldName("filter");
                        gen.writeStartArray(cmd);
                        for (FilterType filter : filters) {
                            // for some reason selectors SHOULDN'T be arrayobjects?
                            filterSerializer.serialize(filter, gen, serializers);
                        }
                        gen.writeEndArray();
                        gen.writeEndObject();
                    }
                }
                else {
                    serializeProperty(cmd, gen, serializers, property);
                }
            }
        }
        gen.writeEndArray();
    }
}
