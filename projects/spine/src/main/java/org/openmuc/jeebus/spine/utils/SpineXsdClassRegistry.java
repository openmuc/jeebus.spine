/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils;

import org.openmuc.jeebus.spine.xsd.v1.DatagramType;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for queries like "is this class a SPINE XSD datatype".
 */
public class SpineXsdClassRegistry {
    // holder class for lazy initialization
    private static class Holder {
        private static final Set<Class<?>> SPINE_CLASSES
            = Collections.unmodifiableSet(findSpineClasses());
    }

    /**
     * @return the set of all discovered SPINE classes
     */
    public static Set<Class<?>> getSpineClasses() {
        return Holder.SPINE_CLASSES;
    }

    /**
     * @param cls class to check
     * @return whether the given class is a SPINE XSD class
     */
    public static boolean isSpineClass(Class<?> cls) {
        return !cls.isPrimitive()
            && !Iterable.class.isAssignableFrom(cls)
            && (getSpineClasses().contains(cls)
                || cls != Object.class
                    && isSpineClass(cls.getSuperclass())
            );
    }

    /**
     * @param cls class to check
     * @return whether the given class is a SPINE XSD data class, i.e. not an enum
     */
    public static boolean isSpineDataClass(Class<?> cls) {
        return !cls.isEnum() && isSpineClass(cls);
    }


    private static Set<Class<?>> findSpineClasses() {
        HashSet<Class<?>> result = new HashSet<>();
        findAccessibleClasses(
            DatagramType.class,
            result,
            "org.openmuc.jeebus.spine.xsd.v1"
        );
        return result;
    }

    private static void findAccessibleClasses(
        Type current,
        Set<Class<?>> found,
        String boundary
    ) {
        if (current instanceof Class) {
            Class<?> cls = (Class<?>) current;
            if (!cls.getPackageName().startsWith(boundary)) return;
            if (found.contains(cls)) return;
            found.add(cls);
            for (Field fld : cls.getDeclaredFields()) {
                findAccessibleClasses(fld.getGenericType(), found, boundary);
            }
        } else if (current instanceof ParameterizedType) {
            ParameterizedType typ = (ParameterizedType) current;
            findAccessibleClasses(typ.getOwnerType(), found, boundary);
            for (Type arg : typ.getActualTypeArguments()) {
                findAccessibleClasses(arg, found, boundary);
            }
        }
    }
}
