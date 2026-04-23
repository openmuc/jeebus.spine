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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ArrayObjectDeserializer<T> extends JsonDeserializer<T> implements
    ContextualDeserializer, ResolvableDeserializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        ArrayObjectDeserializer.class);

    private final BeanDescription beanDesc;
    // collection of properties is used for deserializing most objects
    private final Map<String, BeanPropertyDefinition> properties = new HashMap<>();
    private final Map<String, JsonDeserializer<?>> propertyDeserializers = new HashMap<>();
    // some types (for example, SpecificationVersionDataType ) actually have just one
    // field which is already the whole value, not wrapped in an object.
    // if valueAccessor is not null, that deserialization method is used.
    private final AnnotatedMember valueAccessor;
    private JsonDeserializer<?> valueDeserializer;

    public ArrayObjectDeserializer(
        BeanDescription beanDesc
    ) {
        this.beanDesc = beanDesc;

        valueAccessor = beanDesc.findJsonValueAccessor();
        if (valueAccessor != null) valueAccessor.fixAccess(true);
        for (BeanPropertyDefinition def : beanDesc.findProperties()) {
            properties.put(def.getName(), def);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<Object> getKnownPropertyNames() {
        return (Collection<Object>) ((Collection<?>) properties.keySet());
    }

    @Override
    @SuppressWarnings("unchecked")
    public T deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
        LOGGER.trace("deserializing {} from json", beanDesc.getBeanClass().getSimpleName());
        T result;
        try {
            result = (T) beanDesc.findDefaultConstructor().call();
        }
        catch (Exception e) {
            throw ValueInstantiationException.from(
                p,
                "couldn't instantiate",
                beanDesc.getType(),
                e
            );
        }
        if (valueAccessor != null) {
            // if we are in the SpecificationVersionDataType situation,
            // just jump directly to the deserializer for the value
            Object value = valueDeserializer.deserialize(p, ctxt);
            valueAccessor.setValue(result, value);
            return result;
        }
        JsonToken token;
        // we are flexible here: in addition to the
        // [{key: val}, {key: val}] format used by SPINE, we also accept the usual
        // {key: val, key: val} format.
        // we even accept a mix, e.g. [{key: val, key: val}, {key: val}]
        //
        // this is really just because it was easier to write that way though ;)
        switch (token = p.currentToken()) {
            case START_ARRAY:
                assignPropertiesArray(p, ctxt, result);
                break;
            case START_OBJECT:
                assignPropertiesObject(p, ctxt, result, false);
                break;
            default:
                throw badtoken(p, token);
        }
        return result;
    }

    private void assignPropertiesArray(
        JsonParser p,
        DeserializationContext ctxt,
        T result
    ) throws
        IOException {
        while (true) {
            JsonToken token = p.nextToken();
            switch (token) {
                case END_ARRAY:
                    return;
                case START_OBJECT:
                    assignPropertiesObject(p, ctxt, result, true);
                    break;
                default:
                    throw badtoken(p, token);
            }
        }
    }

    /**
     *
     * @param p current json parser
     * @param ctxt context
     * @param result the partially-initialized POJO we're modifying
     * @param mergeLists whether to merge lists. See {@link #setParsedValue(JsonParser, Object, boolean, BeanPropertyDefinition, Object)}.
     * @throws IOException if there is an I/O or parsing error
     */
    private void assignPropertiesObject(
        JsonParser p,
        DeserializationContext ctxt,
        T result,
        boolean mergeLists
    ) throws
        IOException {
        while (true) {

            JsonToken token = p.nextToken();
            String fieldName;
            switch (token) {
                case END_OBJECT:
                    return;
                case FIELD_NAME:
                    fieldName = p.currentName();
                    break;
                default:
                    throw badtoken(p, token);
            }

            // Find the property corresponding to this field
            BeanPropertyDefinition propDef = properties.get(fieldName);
            if (propDef == null) {
                // this means we ran into some unknown property.
                // SPINE allows this, so we just skip the property.
                ctxt.handleUnknownProperty(p, this, result, fieldName);
                LOGGER.debug("Skipping unknown property {}", fieldName);
                switch (p.nextToken()) {
                    case START_ARRAY:
                    case START_OBJECT:
                        p.skipChildren();
                }
                continue;
            }

            // Now find the deserializer for that property's value.
            // This should always exist, so we throw an AssertionError if it doesn'.
            JsonDeserializer<?> fieldDeserializer = propertyDeserializers.get(fieldName);
            if (fieldDeserializer == null) {
                throw new AssertionError("found propDef but no deserializer for property " + propDef);
            }

            // advance the parser to point to the value, and call the deserializer
            // for the value.
            p.nextToken();
            Object val = fieldDeserializer.deserialize(p, ctxt);

            // actually set the value returned by the deserializer
            setParsedValue(p, result, mergeLists, propDef, val);
        }
    }

    /**
     * Actually set the given property of {@code result} to the value parsed from the
     * JSON input.
     *
     * @param p
     *     the current json parser
     * @param result
     *     the partially-initialized POJO we're modifying
     * @param mergeLists
     *     whether to merge lists This is true when called from
     *     {@link #assignPropertiesArray(JsonParser, DeserializationContext,
     *     Object)}, and causes duplicate list properties to be merged together
     *     rather than replacing the existing value.
     * @param propDef the property to set
     * @param value the value to assign
     * @throws JsonMappingException if there is an error setting the property
     */
    private void setParsedValue(
        JsonParser p,
        T result,
        boolean mergeLists,
        BeanPropertyDefinition propDef,
        Object value
    ) throws JsonMappingException {
        try {
            // first, check the "mergeLists" special case, only for list fields
            Object oldVal;
            if (mergeLists
                && propDef.getPrimaryType().isTypeOrSubTypeOf(List.class)
                && (oldVal = propDef.getField().getValue(result)) instanceof List
                && value instanceof List) {
                // these casts are safe, the type information simply isn't
                // propagated well enough to convince the compiler of this
                @SuppressWarnings("unchecked")
                List<Object> oldList = (List<Object>) oldVal;
                @SuppressWarnings("unchecked")
                Collection<Object> vals = ((List<Object>) value);
                oldList.addAll(vals);
            } else {
                // otherwise, just set the value normally
                propDef.getAccessor().setValue(result, value);
            }
        }
        catch (Exception e) {
            throw new JsonMappingException(
                p,
                "exception while setting property " + propDef.getName(),
                e
            );
        }
    }

    private JsonParseException badtoken(JsonParser p, JsonToken bad) {
        return new JsonParseException(p, "unexpected token: " + bad);
    }

    @Override
    public JsonDeserializer<?> createContextual(
        DeserializationContext ctxt,
        BeanProperty property
    ) {
        return this;
    }

    @Override
    public void resolve(DeserializationContext ctxt) throws
        JsonMappingException {
        // Look up deserializers for properties...
        for (Map.Entry<String, BeanPropertyDefinition> entry : properties.entrySet()) {
            BeanPropertyDefinition def = entry.getValue();
            JavaType propType = def.getPrimaryType();
            JsonDeserializer<?> deserializer
                = ctxt.findContextualValueDeserializer(propType, null);
            propertyDeserializers.put(entry.getKey(), deserializer);
        }

        // ... or for the (singular) value, if there is an @JsonValue annotation
        if (valueAccessor != null) {
            valueDeserializer = ctxt.findNonContextualValueDeserializer(valueAccessor.getType());
        }
    }

}
