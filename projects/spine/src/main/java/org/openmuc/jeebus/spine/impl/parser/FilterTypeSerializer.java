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
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.openmuc.jeebus.spine.xsd.v1.FilterType;

import java.io.IOException;
import java.util.List;

public class FilterTypeSerializer extends ArrayObjectSerializer {
    public FilterTypeSerializer(BeanDescription beanDesc) {
        super(beanDesc);
        assert beanDesc.getBeanClass() == FilterType.class;
    }

    @Override
    protected void serializeProperty(
        Object value,
        JsonGenerator gen,
        SerializerProvider serializers,
        PropertyInfo propInfo
    ) throws IOException {
        if (propInfo.definition.getPrimaryType().isTypeOrSubTypeOf(List.class)) {
            // what the hell
            JavaType elementType = propInfo.definition
                .getPrimaryType()
                .containedType(0);
            JsonSerializer<Object> elementSerializer
                = serializers.findValueSerializer(elementType);
            List<?> propValue = (List<?>) propInfo.definition
                .getAccessor()
                .getValue(value);

            if (propValue != null && !propValue.isEmpty()) {
                for (Object element : propValue) {
                    gen.writeStartObject(propValue);
                    gen.writeFieldName(propInfo.definition.getName());
                    elementSerializer.serialize(element, gen, serializers);
                    gen.writeEndObject();
                }
            }
        }
        else {
            super.serializeProperty(value, gen, serializers, propInfo);
        }
    }
}
