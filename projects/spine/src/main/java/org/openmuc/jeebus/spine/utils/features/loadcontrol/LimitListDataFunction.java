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

import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.api.options.ReadListCmdOption;
import org.openmuc.jeebus.spine.api.options.WriteListCmdOption;
import org.openmuc.jeebus.spine.impl.DataIdDescription;
import org.openmuc.jeebus.spine.spi.function.ListFeatureFunctionTypeInfo;
import org.openmuc.jeebus.spine.spi.function.StandardFunctionType;
import org.openmuc.jeebus.spine.utils.SpineObjects;
import org.openmuc.jeebus.spine.utils.SpineUtilities;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

// TODO: send current endtime instead of initial
@StandardFunctionType(
        type = FunctionEnumType.LOAD_CONTROL_LIMIT_LIST_DATA,
        featureType = FeatureTypeEnumType.LOAD_CONTROL)
public class LimitListDataFunction extends LoadControlFeatureFunction<
    LoadControlLimitDataType,
    LoadControlLimitListDataType,
    LoadControlLimitListDataSelectorsType,
    LoadControlLimitDataElementsType
> {

    public static final ListFeatureFunctionTypeInfo<
        LoadControlLimitDataType,
        LoadControlLimitListDataType,
        LoadControlLimitListDataSelectorsType,
        LoadControlLimitDataElementsType
    > TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
        new DataIdDescription<>(
            LoadControlLimitDataType.class,
            List.of("limitId")
        ),
        LoadControlLimitListDataType.class,
        LoadControlLimitListDataSelectorsType.class,
        LoadControlLimitDataElementsType.class
    );
    private final ScheduledExecutorService executor;

    private final Map<Integer, ScheduledFuture<?>> startScheduleMap
        = new HashMap<>();
    private final Map<Integer, ScheduledFuture<?>> endScheduleMap = new HashMap<>();

    public LimitListDataFunction() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public LimitListDataFunction(
        ScheduledExecutorService executor
    ) {
        super(
            FunctionEnumType.LOAD_CONTROL_LIMIT_LIST_DATA.value(),
            TYPE_INFO
        );
        this.executor = executor;
        setReadable(true, true);
        setWritable(true, true);
    }

    /**
     * updates given data at given index and schedules start if timePeriod startTime
     * is not null and expiration if endTime is not null.
     *
     * @param idx
     *     index of data to update
     * @param update
     *     the update
     * @throws DataValidationException
     *     if update is invalid
     */
    public void updateAndScheduleStartAndExpiration(
        int idx,
        LoadControlLimitDataType update
    ) throws DataValidationException {
        updateData(idx, update);
        scheduleStartAndExpiration(idx, update);
    }

    void scheduleStartAndExpiration(int idx, LoadControlLimitDataType update) {
        LoadControlLimitDataType updateCopy = SpineObjects.dataCopy(update);
        if (updateCopy.getTimePeriod() != null) {

            if (updateCopy.getTimePeriod().getStartTime() != null) {
                if (startScheduleMap.containsKey(idx)) {
                    startScheduleMap.get(idx).cancel(false);
                }
                startScheduleMap.put(
                    idx, executor.schedule(
                        () -> {
                            updateCopy.setIsLimitActive(true);
                            try {
                                updateData(idx, updateCopy);
                                useCaseWriteDataListListeners.forEach(l -> l.writeData(
                                    updateCopy,
                                    DataUpdateType.UPDATE_DATA,
                                    idx
                                ));
                            }
                            catch (DataValidationException e) {
                                logger.error(
                                    "Failed to update LoadControlLimitData after start.");
                            }
                        },
                        SpineUtilities.toRelativeMilliseconds(
                            updateCopy.getTimePeriod().getStartTime()
                        ),
                        MILLISECONDS
                    )
                );
            }

            if (updateCopy.getTimePeriod().getEndTime() != null) {
                if (endScheduleMap.containsKey(idx)) {
                    endScheduleMap.get(idx).cancel(false);
                }
                endScheduleMap.put(
                    idx, executor.schedule(
                        () -> {
                            updateCopy.setIsLimitActive(false);
                            updateCopy.setTimePeriod(null);
                            try {
                                updateData(idx, updateCopy);
                                useCaseWriteDataListListeners.forEach(l -> l.writeData(
                                    updateCopy,
                                    DataUpdateType.UPDATE_DATA,
                                    idx
                                ));
                            }
                            catch (DataValidationException e) {
                                logger.error(
                                    "Failed to update LoadControlLimitData after expiration.");
                            }
                        },
                        SpineUtilities.toRelativeMilliseconds(
                            updateCopy.getTimePeriod().getEndTime()
                        ),
                        MILLISECONDS
                    )
                );
            }

        }
    }

    @Override
    protected void validateData(LoadControlLimitDataType data)
        throws DataValidationException {

        Optional<LimitConstraintsDataFunction> constraintsFunction = feature.getFunction(
            LimitConstraintsDataFunction.class
        );
        if (constraintsFunction.isPresent()) {
            constraintsFunction.get().validateLimitFitsConstraints(
                data,
                constraintsFunction.get().getDataCopyForFirst(
                    d -> Objects.equals(d.getLimitId(), data.getLimitId()
            )));
        }

        if (data.getIsLimitChangeable() == null) {
            logger.warn("isLimitChangeable is not set");
        }
        if (data.getIsLimitActive() == null) {
            logger.warn("isLimitActive should be set");
        }
        if (Objects.equals(data.getIsLimitActive(), true)
            && data.getValue() == null) {
            throw new DataValidationException(
                "isLimitActive is true but value is not set"
            );
        }
        // TODO implement rules for measurementId set in description
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        return null;
    }

    @Override
    public void writeData(
        LoadControlLimitDataType update,
        DataUpdateType dataUpdateType,
        Integer idx
    ) {
        if (dataUpdateType != DataUpdateType.DELETE_DATA
            && update.getTimePeriod() != null) {
            scheduleStartAndExpiration(idx, update);
        }
    }

    @Override
    protected void validateUpdateForMatchingData(
        LoadControlLimitDataType update,
        List<LoadControlLimitDataType> matchingData,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {
        for (LoadControlLimitDataType data : matchingData) {
            if (data.getIsLimitChangeable() != null
                && !data.getIsLimitChangeable()) {
                if (update.getTimePeriod() != null
                    || update.getValue() != null
                    || update.getIsLimitActive() != null) {
                    throw new SpineException(
                        Error.COMMAND_REJECTED,
                        "May not write 'timePeriod', 'value' or 'isLimitActive'"
                    );
                }
            }
        }
        // TODO check this also for delete, possibly add a new validation method to ReadAndWriteListFeatureFunction
    }

    @Override
    protected void validateWriteCmdFull(
        List<LoadControlLimitDataType> updateList,
        List<LoadControlLimitListDataSelectorsType> loadControlLimitListDataSelectorsTypes,
        LoadControlLimitDataElementsType loadControlLimitDataElementsType,
        WriteListCmdOption writeListCmdOption
    ) throws SpineException {

    }

    @Override
    protected void validateReadCmd(
        List<LoadControlLimitListDataSelectorsType> loadControlLimitListDataSelectorsTypes,
        LoadControlLimitDataElementsType loadControlLimitDataElementsType,
        ReadListCmdOption readListCmdOption
    ) throws SpineException {

    }
}
