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
import org.junit.jupiter.api.*;
import org.openmuc.jeebus.spine.TestUtilities;
import org.openmuc.jeebus.spine.xsd.v1.FeatureAddressType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataType;
import org.openmuc.jeebus.spine.xsd.v1.UseCaseSupportType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class UseCaseDataFunctionTest {

    public static final String BUD = "bud-spencer";
    public static final String TERENCE = "terence-hill";
    public static final FeatureAddressType ENTITY_1
        = new FeatureAddressType().withDevice("any").withEntity(1L);
    public static final FeatureAddressType ENTITY_2
        = new FeatureAddressType().withDevice("any").withEntity(2L);
    public static final String UC_1 = "useCase1";
    public static final String UC_2 = "useCase2";

    @Test
    public void testIllegalUseCaseAddress() {
        Assertions.assertThrows(
            NullPointerException.class,
            () -> new UseCaseDataFunction().addUseCase(new TestUtilities.TestUseCase(
                "any",
                new FeatureAddressType().withEntity(1L),
                "any"
            ))
        );
    }

    @Test
    public void test() {
        UseCaseDataFunction dut = new UseCaseDataFunction();

        dut.addUseCase(new TestUtilities.TestUseCase(
            BUD,
            ENTITY_1,
            UC_1
        ));
        dut.addUseCase(new TestUtilities.TestUseCase(
            TERENCE,
            ENTITY_1,
            UC_1
        ));
        dut.addUseCase(new TestUtilities.TestUseCase(
            TERENCE,
            ENTITY_1,
            UC_2
        ));

        dut.addUseCase(new TestUtilities.TestUseCase(
            TERENCE,
            ENTITY_2,
            UC_1
        ));

        assertThat(
            dut.getUseCaseData(),
            is(
                new NodeManagementUseCaseDataType()
                    .withUseCaseInformation(
                        new NodeManagementUseCaseDataType.UseCaseInformation()
                            .withActor(BUD)
                            .withAddress(ENTITY_1)
                            .withUseCaseSupport(getSupport().withUseCaseName(UC_1)),
                        new NodeManagementUseCaseDataType.UseCaseInformation()
                            .withActor(TERENCE)
                            .withAddress(ENTITY_1)
                            .withUseCaseSupport(
                                getSupport().withUseCaseName(UC_1),
                                getSupport().withUseCaseName(UC_2)
                            ),
                        new NodeManagementUseCaseDataType.UseCaseInformation()
                            .withActor(TERENCE)
                            .withAddress(ENTITY_2)
                            .withUseCaseSupport(getSupport().withUseCaseName(UC_1))
                    )
            )
        );
    }

    private static UseCaseSupportType getSupport() {
        return new UseCaseSupportType()
            .withScenarioSupport(0L)
            .withUseCaseVersion("1.0.0")
            .withUseCaseAvailable(true)
            .withUseCaseDocumentSubRevision("release");
    }

}