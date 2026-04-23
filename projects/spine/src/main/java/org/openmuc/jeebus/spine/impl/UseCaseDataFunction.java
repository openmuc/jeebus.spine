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

import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Objects;

class UseCaseDataFunction extends FeatureFunction {
    private final NodeManagementUseCaseDataType content
        = new NodeManagementUseCaseDataType();

    protected UseCaseDataFunction() {
        super(FunctionEnumType.NODE_MANAGEMENT_USE_CASE_DATA.value());
        setReadable(true, false);
    }

    @Override
    public CmdType read(FilterType filter, FeatureAddressType sourceAddress) {
        CmdType cmd = new CmdType();
        cmd.setNodeManagementUseCaseData(getUseCaseData());
        return cmd;
    }

    @Override
    public SpineAcknowledgment write(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SpineAcknowledgment call(CmdType cmd, FeatureAddressType sourceAddress) {
        throw new UnsupportedOperationException();
    }

    public void addUseCase(UseCase useCase) {
        if (useCase.getAddress().getDevice() == null) {
            throw new NullPointerException(
                "Device field of the given Use Case Address was null. Use Case "
                    + "Addresses must be static and therefore need the device "
                    + "field:\n"
                    + useCase
            );
        }

        NodeManagementUseCaseDataType.UseCaseInformation existingInfo = content
            .getUseCaseInformation()
            .stream()
            .filter(info ->
                Objects.equals(info.getAddress(), useCase.getAddress())
                    && Objects.equals(info.getActor(), useCase.getActor())
            )
            .findFirst()
            .orElseGet(() -> {
                NodeManagementUseCaseDataType.UseCaseInformation newInfo
                    = new NodeManagementUseCaseDataType.UseCaseInformation()
                    .withActor(useCase.getActor())
                    .withAddress(useCase.getAddress());

                content.getUseCaseInformation().add(newInfo);

                return newInfo;
            });

        existingInfo.getUseCaseSupport().add(new UseCaseSupportType()
            .withUseCaseName(useCase.getName())
            .withUseCaseVersion(useCase.getVersion())
            .withScenarioSupport(useCase.getScenarioSupport())
        /* TODO: The "useCaseAvailable" flag is meant for runtime changes in use case
            availability, but ONLY for the client functionality of a use case.
            See SPINE Protocol Specification Table 20.
            We have to make this dynamic if we ever have to deal with such cases.
            For now it is safest to set it to true.*/
            .withUseCaseAvailable(true)
            .withUseCaseDocumentSubRevision("release")
        );
    }

    @Override
    public void close() {
        // do nothing
    }

    NodeManagementUseCaseDataType getUseCaseData() {
        NodeManagementUseCaseDataType result
            = new NodeManagementUseCaseDataType();
        content.copyTo(result);
        return result;
    }
}
