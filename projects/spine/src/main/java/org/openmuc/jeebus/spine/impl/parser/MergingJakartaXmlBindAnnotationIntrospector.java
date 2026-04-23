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

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationIntrospector;
import jakarta.xml.bind.annotation.XmlType;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Stream;

public class MergingJakartaXmlBindAnnotationIntrospector
    extends JakartaXmlBindAnnotationIntrospector {
    public MergingJakartaXmlBindAnnotationIntrospector(TypeFactory typeFactory) {
        super(typeFactory);
    }

    @Override
    public Version version() {
        return Version.unknownVersion();
    }

    @Override
    public String[] findSerializationPropertyOrder(AnnotatedClass ac) {
        Stream<Type> supertypes = Stream
            .iterate(
                ac.getAnnotated(),
                supertype -> !Objects.equals(supertype, Object.class)
                    && supertype instanceof Class<?>,
                supertype -> ((Class<?>) supertype)
                    .getAnnotatedSuperclass()
                    .getType()
            );

        String[] result = supertypes
            .filter(AnnotatedElement.class::isInstance)
            .map(supertype -> ((AnnotatedElement) supertype).getAnnotation(XmlType.class))
            .filter(Objects::nonNull)
            .map(XmlType::propOrder)
            .filter(propOrder -> !Arrays.equals(propOrder, new String[] { "" }))
            .collect(
                LinkedList<String[]>::new,
                LinkedList::addFirst,
                LinkedList::addAll
            )
            .stream()
            .flatMap(Arrays::stream)
            .toArray(String[]::new);

        if (result.length == 0) {
            return null;
        }

        return result;
    }
}
