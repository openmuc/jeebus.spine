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
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayObjectSerializer extends JsonSerializer<Object> {

    protected final BeanDescription beanDesc;
    protected final List<PropertyInfo> properties;
    protected final AnnotatedMember valueAccessor;

    protected static class PropertyInfo {
        final BeanPropertyDefinition definition;
        final AnnotatedField field;
        final AnnotatedMethod getter;

        PropertyInfo(BeanPropertyDefinition definition, AnnotatedField field, AnnotatedMethod getter) {
            this.definition = definition;
            this.field = field;
            this.getter = getter;
        }

        Object get(Object target) throws Exception {
            if (target == null) return null;
            if (field != null) {
                return field.getValue(target);
            } else {
                return getter.callOn(target);
            }
        }
    }

    public ArrayObjectSerializer(BeanDescription beanDesc) {
        this.beanDesc = beanDesc;
        properties = new ArrayList<>(beanDesc.findProperties().size());
        for (BeanPropertyDefinition def : beanDesc.findProperties()) {
            properties.add(new PropertyInfo(def, def.getField(), def.getGetter()));
        }
        valueAccessor = beanDesc.findJsonValueAccessor();
    }

    @Override
    public void serialize(
        Object value,
        JsonGenerator gen,
        SerializerProvider serializers
    ) throws IOException {
        if (valueAccessor != null) {
            serializers
                .findValueSerializer(valueAccessor.getType())
                .serialize(valueAccessor.getValue(value), gen, serializers);
        }
        else if (value == null && !gen.canOmitFields()) {
            gen.writeStartArray();
            gen.writeEndArray();
        }
        else {
            if (!beanDesc.getBeanClass().isInstance(value)) {
                assert value != null; // covered by isinstance check
                throw new IllegalArgumentException("Serializer for "
                    + beanDesc.getBeanClass()
                    + " cannot serialize value of wrong type: "
                    + value.getClass());
            }
            gen.writeStartArray(value);
            for (PropertyInfo entry : properties) {
                serializeProperty(value, gen, serializers, entry);
            }
            gen.writeEndArray();
        }
    }

    protected void serializeProperty(
        Object value,
        JsonGenerator gen,
        SerializerProvider serializers, PropertyInfo entry
    ) throws IOException {
        String fieldName = entry.definition.getName();
        Object fieldValue;
        try {
            fieldValue = entry.get(value);
        }
        catch (Exception e) {
            throw InvalidDefinitionException.from(gen, "couldn't get value from object", beanDesc, entry.definition);
        }
        if (fieldValue == null)
            return;
        gen.writeStartObject(value);
        gen.writeObjectField(fieldName, fieldValue);
        gen.writeEndObject();
    }
}
