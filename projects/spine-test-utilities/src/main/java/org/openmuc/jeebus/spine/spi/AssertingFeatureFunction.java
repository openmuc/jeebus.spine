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

import org.junit.jupiter.api.Assertions;
import org.openmuc.jeebus.spine.api.Error;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

public class AssertingFeatureFunction extends FeatureFunction {
    private boolean active = false;

    public AssertingFeatureFunction() {
        super(FunctionEnumType.ACTUATOR_SWITCH_DATA.value());
        requireBinding();
    }

    public static CmdType getReadCmd() {
        CmdType cmd = new CmdType();
        cmd.setActuatorSwitchData(new ActuatorSwitchDataType());
        return cmd;
    }

    public static CmdType getWriteCmd() {
        CmdType cmd = new CmdType();
        ActuatorSwitchDataType switchData = new ActuatorSwitchDataType();
        switchData.setFunction(ActuatorSwitchFctEnumType.ON.value());
        cmd.setActuatorSwitchData(switchData);
        return cmd;
    }

    public void reset() {
        active = false;
        enable();
    }

    public void enable() {
        setWritable(true, false);
        setReadable(true, false);
        setCallable(true);
    }

    public void assertActiveAndReset(boolean compare) {
        if (compare) {
            Assertions.assertTrue(active);
        }
        else {
            Assertions.assertFalse(active);
        }
        active = false;
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType cmd = new CmdType();
        ActuatorSwitchDataType switchData = new ActuatorSwitchDataType();
        if (active) {
            switchData.setFunction(ActuatorSwitchFctEnumType.ON.value());
        }
        else {
            switchData.setFunction(ActuatorSwitchFctEnumType.OFF.value());
        }
        cmd.setActuatorSwitchData(switchData);
        return cmd;
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        if (cmd.getActuatorSwitchData() != null
            && cmd.getActuatorSwitchData().getFunction() != null) {
            ActuatorSwitchFctEnumType function = ActuatorSwitchFctEnumType.fromValue(
                cmd.getActuatorSwitchData().getFunction());
            boolean oldStatus = active;
            switch (function) {
                case ON:
                    active = true;
                    break;
                case OFF:
                    active = false;
                    break;
                case TOGGLE:
                    active = !active;
                    break;
            }
            if (oldStatus != active) {
                feature.notifySubscribers(
                    FunctionEnumType.ACTUATOR_SWITCH_DATA,
                    null
                );
            }
            return new SpineAcknowledgment(Error.NO_ERROR);
        }
        return new SpineAcknowledgment(
            Error.COMMAND_REJECTED,
            "Invalid WRITE command"
        );
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    public void disable() {
        setWritable(false, false);
        setReadable(false, false);
        setCallable(false);
    }

    @Override
    public void close() {
        // do nothing - fine for ordinary data functions
    }
}
