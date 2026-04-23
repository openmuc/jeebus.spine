/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.demo;

import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.spi.AllowedEntityTypes;
import org.openmuc.jeebus.spine.spi.FeatureRequirement;
import org.openmuc.jeebus.spine.spi.Inject;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.utils.features.devicediagnosis.HeartbeatDataFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@AllowedEntityTypes({ EntityTypeEnumType.GENERIC })
public class ExampleUseCase implements UseCase {
    private EntityAddressType address;
    private Device device;
    @Inject
    private Entity entity;

    @Override
    public String getActor() {
        return "ExampleActor";
    }

    @Override
    public String getName() {
        return "ExampleUseCase";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public List<Long> getScenarioSupport() {
        return List.of(1L);
    }

    @Override
    public FeatureAddressType getAddress() {
        return new FeatureAddressType()
            .withDevice(address.getDevice())
            .withEntity(address.getEntity());
    }

    @Override
    public void setup() {
        this.device = entity.getDevice();
        this.address = entity.getStaticAddress();

        /* Basically, we are listening for a remote device supporting our
         * use case as the "OtherExampleActor".*/
        this.device
            .getNodeManagement()
            .addUseCaseListener(
                this::startUseCase,
                this.getName(),
                "OtherExampleActor",
                // They SHALL support scenario 1 of our use case
                Map.of(
                    1L, PresenceIndication.MANDATORY
                ),
                /* Scenario 1 requires a DeviceDiagnosis server feature with a
                 * deviceDiagnosisHeartbeatData function. */
                Set.of(new CommunicationPartnerFeatureRequirement(
                    FeatureTypeEnumType.DEVICE_DIAGNOSIS,
                    Map.of(
                        FunctionEnumType.DEVICE_DIAGNOSIS_HEARTBEAT_DATA,
                        Map.of(1L, PresenceIndication.MANDATORY)
                    )
                ))
            );
    }

    @Override
    public Set<FeatureRequirement> getFeatureRequirements(EntityTypeEnumType entityType) {
        return Set.of(
            FeatureRequirement.GENERIC_CLIENT,
            new FeatureRequirement(
                FeatureTypeEnumType.DEVICE_DIAGNOSIS,
                RoleType.SERVER,
                HeartbeatDataFunction.class
            )
        );
    }

    private void startUseCase(List<UseCasePartner> partners) {
        // Assuming there is exactly one partner entity for simplicity
        UseCasePartner firstPartner = partners.get(0);

        /* This is where you would implement the Pre- Initial- and
         * RuntimeScenarioCommunication as described in the EEBus use case
         * specifications. */

        /* As an example, this is how you would subscribe to their
         * DeviceDiagnosisFeature.
         * Binding, read or write requests work like this as well. */
        CompletableFuture<RequestResult> request = device
            .getNodeManagement()
            .requestSubscription(
                firstPartner.getCompleteFeatureAddress(
                    FeatureTypeEnumType.DEVICE_DIAGNOSIS
                ),
                FeatureTypeEnumType.DEVICE_DIAGNOSIS,
                this::handleHeartbeat
            );

        // This is how you can wait for and evaluate request results.
        try {
            RequestResult result = request.get();
        }
        catch (InterruptedException | ExecutionException e) {
            // Handle exceptions here
            throw new RuntimeException(e);
        }
    }

    private void handleHeartbeat(RequestResult notification) {
        // This method will be called on every heartbeat notification.
    }

    @Override
    public void close() {
        /* If this use case has any associated long-running threads or other network
         * connections, this method is where you would shut them down. As there are
         * none in this example, the method does not need to do anything and can be
         * left empty. */

        // exampleNetworkSocket.close()
    }
}
