/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.impl;

import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.FeatureWrapper;
import org.openmuc.jeebus.spine.spi.KnownFeatureInformation;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.utils.features.deviceclassification.DeviceClassificationFeature;
import org.openmuc.jeebus.spine.utils.features.deviceconfiguration.DeviceConfigurationFeature;
import org.openmuc.jeebus.spine.utils.features.devicediagnosis.DeviceDiagnosisFeature;
import org.openmuc.jeebus.spine.utils.features.electricalconnection.ElectricalConnectionFeature;
import org.openmuc.jeebus.spine.utils.features.loadcontrol.LoadControlFeature;
import org.openmuc.jeebus.spine.utils.features.measurement.MeasurementFeature;
import org.openmuc.jeebus.spine.utils.features.timeseries.TimeSeriesFeature;
import org.openmuc.jeebus.spine.xsd.v1.FeatureTypeEnumType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.ServiceLoader;

/**
 * Service to look up information about a specific known feature type.
 */
public class FeatureInformationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeatureInformationService.class);
    private static FeatureInformationService INSTANCE;
    private final ServiceLoader<KnownFeatureInformation> loader;

    /**
     * A cache so we don't have to iterate through the service loader repeatedly. We also store the implementations
     * from this software package in here (because the service loader mechanism for some reason cannot find them).
     */
    private final EnumMap<FeatureTypeEnumType, KnownFeatureInformation> cache = new EnumMap<>(FeatureTypeEnumType.class);
    {
        cache.put(FeatureTypeEnumType.GENERIC, new KnownFeatureInformation.Generic());
        cache.put(FeatureTypeEnumType.NODE_MANAGEMENT, new NodeManagementImpl.MetaInformation());

        cache.put(FeatureTypeEnumType.DEVICE_CONFIGURATION, new DeviceConfigurationFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.DEVICE_DIAGNOSIS, new DeviceDiagnosisFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.ELECTRICAL_CONNECTION, new ElectricalConnectionFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.LOAD_CONTROL, new LoadControlFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.MEASUREMENT, new MeasurementFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.DEVICE_CLASSIFICATION, new DeviceClassificationFeature.MetaInformation());
        cache.put(FeatureTypeEnumType.TIME_SERIES, new TimeSeriesFeature.MetaInformation());
    }

    private FeatureInformationService() {
        loader = ServiceLoader.load(KnownFeatureInformation.class, SpineUtilities.class.getClassLoader());
    }

    public static synchronized FeatureInformationService getInstance() {
        if (INSTANCE == null) INSTANCE = new FeatureInformationService();
        return INSTANCE;
    }

    /**
     * Get the information for the given feature type
     * @param featureType the feature type to find information for
     * @return meta-information about that feature type, if found.
     */
    public KnownFeatureInformation getFeatureInformation(FeatureTypeEnumType featureType) {
        KnownFeatureInformation cached = cache.get(featureType);
        if (cached != null) {
            return cached;
        }
        for (KnownFeatureInformation info : loader) {
            if (info.getFeatureType() == featureType) {
                cache.put(featureType, info);
                return info;
            }
        }
        LOGGER.warn("No KnownFeatureInformation found for feature type {}", featureType);
        return null;
    }

    /**
     * Create a wrapper for the given feature, selecting the wrapper based on the feature type.
     * @param feature the feature to create a wrapper for
     * @return a wrapper around that feature, or null if the feature type has no known information.
     */
    public FeatureWrapper createFeatureWrapper(Feature feature) {
        KnownFeatureInformation info = getFeatureInformation(feature.getType());
        return info != null ? info.create(feature) : null;
    }
}
