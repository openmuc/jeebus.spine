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

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import org.openmuc.jeebus.spine.xsd.v1.CmdType;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

public class ArrayObjectFixupModule extends SimpleModule {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayObjectFixupModule.class);

    private final Predicate<Class<?>> classFilter;

    private final BeanDeserializerModifier beanDeserializer
        = new BeanDeserializerModifier() {
        @Override
        public JsonDeserializer<?> modifyDeserializer(
            DeserializationConfig config,
            BeanDescription beanDesc,
            JsonDeserializer<?> deserializer
        ) {

            Class<?> cls = beanDesc.getBeanClass();

            if (classFilter.test(cls)) {
                LOGGER.trace("registering deserializer for {}", cls);
                return new ArrayObjectDeserializer<>(beanDesc);
            }
            return super.modifyDeserializer(config, beanDesc, deserializer);
        }
    };
    private final BeanSerializerModifier beanSerializer = new BeanSerializerModifier() {
        @Override
        public JsonSerializer<?> modifySerializer(
            SerializationConfig config,
            BeanDescription beanDesc,
            JsonSerializer<?> serializer
        ) {
            Class<?> cls = beanDesc.getBeanClass();
            if (cls == CmdType.class) {
                return new CmdTypeSerializer(beanDesc);
            }
            else if (cls == FilterType.class) {
                return new FilterTypeSerializer(beanDesc);
            }
            if (classFilter.test(cls)) {
                LOGGER.trace("registering serializer for {}", cls);
                return new ArrayObjectSerializer(beanDesc);
            }
            return super.modifySerializer(config, beanDesc, serializer);
        }
    };

    public ArrayObjectFixupModule(Predicate<Class<?>> classFilter) {
        this.classFilter = classFilter;
    }

    @Override
    public void setupModule(SetupContext context) {
        super.setupModule(context);
        LOGGER.trace("setupModule");
        context.addBeanDeserializerModifier(beanDeserializer);
        context.addBeanSerializerModifier(beanSerializer);
    }

}
