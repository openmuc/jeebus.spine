/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.loadcontrol;

import org.openmuc.jeebus.spine.xsd.v1.LoadControlLimitDataType;
import org.openmuc.jeebus.spine.xsd.v1.ScaledNumberType;
import org.openmuc.jeebus.spine.xsd.v1.TimePeriodType;

import java.util.Objects;

public final class LoadControlLimitDataTypeBuilder {
    private Long limitId;
    private Boolean isLimitChangeable;
    private Boolean isLimitActive;
    private Short scale;
    private Long number;
    private String startTime;
    private String endTime;

    private LoadControlLimitDataTypeBuilder() {
    }

    public static LoadControlLimitDataTypeBuilder aLoadControlLimitDataType() {
        return new LoadControlLimitDataTypeBuilder();
    }

    public LoadControlLimitDataTypeBuilder withLimitId(Long limitId) {
        this.limitId = limitId;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withIsLimitChangeable(Boolean isLimitChangeable) {
        this.isLimitChangeable = isLimitChangeable;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withIsLimitActive(Boolean isLimitActive) {
        this.isLimitActive = isLimitActive;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withTimePeriodStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withTimePeriodEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withValueScale(Short scale) {
        this.scale = scale;
        return this;
    }

    public LoadControlLimitDataTypeBuilder withValueNumber(Long number) {
        this.number = number;
        return this;
    }

    public LoadControlLimitDataTypeBuilder but() {
        return aLoadControlLimitDataType()
            .withLimitId(limitId)
            .withIsLimitChangeable(isLimitChangeable)
            .withIsLimitActive(isLimitActive)
            .withTimePeriodStartTime(startTime)
            .withTimePeriodEndTime(endTime)
            .withValueNumber(number)
            .withValueScale(scale);
    }

    public LoadControlLimitDataType build() {
        LoadControlLimitDataType loadControlLimitDataType
            = new LoadControlLimitDataType();
        loadControlLimitDataType.setLimitId(limitId);
        loadControlLimitDataType.setIsLimitChangeable(isLimitChangeable);
        loadControlLimitDataType.setIsLimitActive(isLimitActive);

        if (Objects.nonNull(startTime) || Objects.nonNull(endTime)) {
            TimePeriodType timePeriod = new TimePeriodType();
            timePeriod.setStartTime(startTime);
            timePeriod.setEndTime(endTime);
            loadControlLimitDataType.setTimePeriod(timePeriod);
        }

        ScaledNumberType value = new ScaledNumberType();
        value.setScale(scale);
        value.setNumber(number);
        loadControlLimitDataType.setValue(value);

        return loadControlLimitDataType;
    }
}
