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

import org.openmuc.jeebus.spine.api.Shutdownable;
import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.xsd.v1.EntityTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;

import java.util.List;
import java.util.Set;

public interface UseCase extends Shutdownable {
    /**
     * @return the actor string as specified in the UseCase
     */
    String getActor();

    /**
     * @return the UseCase name as specified in the UseCase
     */
    String getName();

    /**
     * @return the UseCase version as specified in the UseCase
     */
    String getVersion();

    /**
     * @return a list containing the numbers of the supported scenarios in the
     * UseCase
     */
    List<Long> getScenarioSupport();

    /**
     * @return the top-level address under which all scenarios of the UseCase can be
     * accessed
     * @implSpec it is MANDATORY for this to be a static address. That means the
     * device part of the address SHALL be set and the address SHALL NOT change
     * during runtime.
     */
    FeatureAddressType getAddress();

    /**
     * After building the Device ({@link DeviceBuilder#build()}) this method is
     * invoked on all added UseCases. Do <b>NOT</b> call this method manually.
     * <p>
     * By this time, all the {@link Inject} annotations will have been populated.
     */
    void setup();

    /**
     * Specify which features this use case needs to be present on its entity, and which feature functions
     * must be present on those features.
     * @param entityType the entity type that this use case is being hosted on
     * @return a set of feature requirements.
     */
    Set<FeatureRequirement> getFeatureRequirements(EntityTypeEnumType entityType);
}
