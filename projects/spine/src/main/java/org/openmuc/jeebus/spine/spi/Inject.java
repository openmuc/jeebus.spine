/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi;

import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.RoleType;

import java.lang.annotation.*;

/**
 * Indicate that this field of a {@link UseCase} should be injected with specific data once the use case is added to a device.
 * <p>
 * Supports four kinds of fields:
 * <ul>
 *     <li>One (1) field with type {@link org.openmuc.jeebus.spine.api.Entity}.
 *     This field will hold the entity that the use case is running on.</li>
 *     <li>Fields with type {@link org.openmuc.jeebus.spine.api.Feature} and at least one of {@link #value()} or {@link #role()} set.
 *     These fields will hold a feature of the host entity with the given type and/or role.
 *     <p>
 *     In typical usage, either only {@code value} will be specified (because most features only have significant functionality
 *     as server), e.g.:
 *     <pre>
 *       &#64;Inject(DEVICE_DIAGNOSIS) private Feature deviceDiagnosisFeature;
 *     </pre>
 *     or, only {@code role = CLIENT} will be specified, to capture the {@link FeatureRequirement#GENERIC_CLIENT} feature:
 *     <pre>
 *         &#64;Inject(role = CLIENT) private Feature clientFeature;
 *     </pre>
 *     </li>
 *     <li>Fields with a type that implements {@link org.openmuc.jeebus.spine.api.FeatureWrapper}. These fields
 *     will hold a feature wrapper of the appropriate type.</li>
 *     <li>Fields with a type that extends {@link org.openmuc.jeebus.spine.spi.function.FeatureFunction} and
 *     has a {@link org.openmuc.jeebus.spine.spi.function.StandardFunctionType}
 *     annotation. These fields will hold the feature function of the appropriate type.</li>
 * </ul>
 *
 * A use case may rely on {@code @Inject} fields being filled so long as it requested the corresponding feature or
 * feature function via {@link UseCase#getFeatureRequirements(EntityTypeEnumType)}.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Inject {
    /**
     * The SPINE feature type that the annotated field should be injected with. Only used for fields with type {@link org.openmuc.jeebus.spine.api.Feature}.
     */
    FeatureTypeEnumType value() default FeatureTypeEnumType.GENERIC;
    /**
     * The SPINE feature role that the annotated field should be injected with. Only used for fields with type {@link org.openmuc.jeebus.spine.api.Feature}.
     */
    RoleType role() default RoleType.SERVER;

}
