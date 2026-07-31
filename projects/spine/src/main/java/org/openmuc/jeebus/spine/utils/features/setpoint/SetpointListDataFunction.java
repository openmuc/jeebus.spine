/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.utils.features.setpoint;

import org.openmuc.jeebus.spine.api.DataUpdateType;
import org.openmuc.jeebus.spine.api.DataValidationException;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
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
import java.util.concurrent.TimeUnit;

@StandardFunctionType(
    type=FunctionEnumType.SETPOINT_LIST_DATA,
    featureType = FeatureTypeEnumType.SETPOINT
)

public class SetpointListDataFunction extends SetpointFeatureFunction<
    SetpointDataType,
    SetpointListDataType,
    SetpointListDataSelectorsType,
    SetpointDataElementsType
    > {
        public static final ListFeatureFunctionTypeInfo<
            SetpointDataType,
            SetpointListDataType,
            SetpointListDataSelectorsType,
            SetpointDataElementsType>
        TYPE_INFO = new ListFeatureFunctionTypeInfo<>(
            new DataIdDescription<> (SetpointDataType.class,
                List.of("setpointId")),
            SetpointListDataType.class,
            SetpointListDataSelectorsType.class,
            SetpointDataElementsType.class
        );

        private final ScheduledExecutorService executor;

        private final Map<Integer, ScheduledFuture<?>> startScheduleMap
            = new HashMap<>();
        private final Map<Integer, ScheduledFuture<?>> endScheduleMap
            = new HashMap<>();

        public SetpointListDataFunction(
            ScheduledExecutorService executor
        ) {
            super(FunctionEnumType.SETPOINT_LIST_DATA.value(), TYPE_INFO);
            this.executor = executor;
            setWritable(true, true);
        }

        public SetpointListDataFunction() {
            this(Executors.newSingleThreadScheduledExecutor());
        }

        @Override
        public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress){
            throw new UnsupportedOperationException();
        }

        @Override
        protected void validateReadCmd(
            List<SetpointListDataSelectorsType> setpointListDataSelectorTypes,
            SetpointDataElementsType setpointDataElementsType,
            ReadListCmdOption readListCmdOption
        ) throws SpineException {

        }

        @Override
        public void writeData(
        SetpointDataType setpointDataType,
        DataUpdateType dataUpdateType,
        Integer idx
        ) {

        }

        @Override
        protected void validateUpdateForMatchingData(
            SetpointDataType update,
            List<SetpointDataType> matchingData,
            WriteListCmdOption writeListCmdOption
        ) throws SpineException {

        }

        @Override
        protected void validateWriteCmdFull(
            List<SetpointDataType> updateList,
            List<SetpointListDataSelectorsType> setpointListDataSelectorsTypes,
            SetpointDataElementsType setpointDataElementsType,
            WriteListCmdOption writeListCmdOption
        )  throws SpineException {

        }
        @Override
        protected void validateData(SetpointDataType data)
            throws DataValidationException {
            Optional<SetpointConstraintsListDataFunction> constraintsListDataFunction =
                feature.getFunction(SetpointConstraintsListDataFunction.class);
            if (constraintsListDataFunction.isEmpty()){
                throw new DataValidationException("Constraints List is not set");
            }
            // TODO: Look at what needs to be implemented.

            if (data.getIsSetpointChangeable() == null){
                logger.warn("isSetpointChangeable is not set");
            }
            if (data.getIsSetpointActive() == null){
                logger.warn("isSetpointActive should be set");
            }
            if (Objects.equals(data.getIsSetpointActive(), true)
            && data.getValue() == null){
                throw new DataValidationException(
                    "isSetpointActive is true but value is not set"
                );
            }
        }

        public void updateAndScheduleStartAndExpiration(
            int idx,
            SetpointDataType update
        ) throws DataValidationException {
            updateData(idx, update);
            scheduleStartAndExpiration(idx, update);
        }

        void scheduleStartAndExpiration(
            int idx,
            SetpointDataType update
        ) {
            SetpointDataType updateCopy = SpineObjects.dataCopy(update);
            if (updateCopy.getTimePeriod() != null){
                if (updateCopy.getTimePeriod().getStartTime() != null) {
                    if (startScheduleMap.containsKey(idx)) {
                        startScheduleMap.get(idx).cancel(false);
                    }
                    startScheduleMap.put(
                        idx, executor.schedule(
                            () -> {
                                updateCopy.setIsSetpointActive(true);
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
                                        "Failed to update SetpointData after start."
                                    );
                                }
                            },
                            SpineUtilities.toRelativeMilliseconds(
                                updateCopy.getTimePeriod().getStartTime()
                            ),
                            TimeUnit.MILLISECONDS
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
                                updateCopy.setIsSetpointActive(false);
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
                                        "Failed to update SetpointData after expiration."
                                    );
                                }
                            },
                            SpineUtilities.toRelativeMilliseconds(
                                updateCopy.getTimePeriod().getEndTime()
                            ),
                            TimeUnit.MILLISECONDS
                        )
                    );
                }
            }
        }

    }
