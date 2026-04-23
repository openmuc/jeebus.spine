/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.electricalconnection;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.spi.FeaturePermission;
import org.openmuc.jeebus.spine.spi.FeatureType;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;

@FeatureType(FeatureTypeEnumType.ELECTRICAL_CONNECTION)
public class ElectricalConnectionFeature implements FeatureWrapper {
    private ParameterDescriptionListDataFunction parameterDescriptionListDataFunction;
    private PermittedValueSetListDataFunction permittedValueSetListDataFunction;

    private CharacteristicListDataFunction characteristicListDataFunction;
    private StateListDataFunction stateListDataFunction;
    private DescriptionListDataFunction descriptionListDataFunction;
    private final Feature feature;

    public ElectricalConnectionFeature(Feature feature) {
        this.feature = feature;
    }

    public ParameterDescriptionListDataFunction getParameterDescriptionListDataFunction() {
        return parameterDescriptionListDataFunction;
    }

    public PermittedValueSetListDataFunction getPermittedValueSetListDataFunction() {
        return permittedValueSetListDataFunction;
    }

    public CharacteristicListDataFunction getCharacteristicListDataFunction() {
        return characteristicListDataFunction;
    }

    public StateListDataFunction getConnectionStateListDataFunction() {
        return stateListDataFunction;
    }

    public DescriptionListDataFunction getDescriptionListDataFunction() {
        return descriptionListDataFunction;
    }

    public ParameterDescriptionListDataFunction addParameterDescriptionListDataFunction() {
        return feature.getOrAddFunction(ParameterDescriptionListDataFunction.class);
    }

    public PermittedValueSetListDataFunction addPermittedValueSetListDataFunction() {
        return feature.getOrAddFunction(PermittedValueSetListDataFunction.class);
    }

    public CharacteristicListDataFunction addCharacteristicListDataFunction() {
        return feature.getOrAddFunction(CharacteristicListDataFunction.class);
    }

    public StateListDataFunction addConnectionStateListDataFunction() {
        return feature.getOrAddFunction(StateListDataFunction.class);
    }

    public DescriptionListDataFunction addDescriptionListDataFunction() {
        return feature.getOrAddFunction(DescriptionListDataFunction.class);
    }

    @Override
    public void updateFunction(FeatureFunction newFunction) {
        if (newFunction instanceof CharacteristicListDataFunction) {
            characteristicListDataFunction = (CharacteristicListDataFunction) newFunction;
        } else if (newFunction instanceof DescriptionListDataFunction) {
            descriptionListDataFunction = (DescriptionListDataFunction) newFunction;
        } else if (newFunction instanceof ParameterDescriptionListDataFunction) {
            parameterDescriptionListDataFunction = (ParameterDescriptionListDataFunction) newFunction;
        } else if (newFunction instanceof PermittedValueSetListDataFunction) {
            permittedValueSetListDataFunction = (PermittedValueSetListDataFunction) newFunction;
        } else if (newFunction instanceof StateListDataFunction) {
            stateListDataFunction = (StateListDataFunction) newFunction;
        }
    }

    @Override
    public Feature getFeature() {
        return feature;
    }

    public static class MetaInformation implements KnownFeatureInformation {
        @Override
        public FeatureWrapper create(Feature feature) {
            return feature.getType() == FeatureTypeEnumType.ELECTRICAL_CONNECTION
                    ? new ElectricalConnectionFeature(feature)
                    : null;
        }

        @Override
        public FeatureTypeEnumType getFeatureType() {
            return FeatureTypeEnumType.ELECTRICAL_CONNECTION;
        }

        @Override
        public FeaturePermission defaultFeaturePermission() {
            return FeaturePermission.ALLOW_ALL;
        }
    }
}
