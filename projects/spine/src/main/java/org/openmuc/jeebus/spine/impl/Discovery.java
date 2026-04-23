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

import org.openmuc.jeebus.spine.api.RequestResult;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementDetailedDiscoveryDataType;
import org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.TimeUnit.MINUTES;

public class Discovery implements Runnable {
    private static final Logger LOGGER
        = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private final String communicationAddress;
    private String deviceAddress;
    private final NodeManagementImpl nodeManagement;
    private NodeManagementDetailedDiscoveryDataType detailedDiscoveryData;
    private NodeManagementUseCaseDataType useCaseData;

    public Discovery(
        String communicationAddress,
        @SuppressWarnings("ClassEscapesDefinedScope")
        NodeManagementImpl nodeManagement
    ) {
        this.communicationAddress = communicationAddress;
        this.nodeManagement = nodeManagement;
    }

    @Override
    public void run() {
        /* A full DetailedDiscovery happens first because every SPINE device
         * is supposed to support it, and we need one successful SPINE message
         * to get their device name. */
        CompletableFuture<RequestResult> detailedDiscoveryRequest
            = nodeManagement.getFullDeviceInformationRequest(
            communicationAddress
        );

        try {
            handleDetailedDiscovery(detailedDiscoveryRequest);
        }
        catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(
                "There was an error in the DetailedDiscovery of "
                    + communicationAddress
                    + ". Aborting the discovery process.",
                e
            );
        }

        CompletableFuture<RequestResult> useCaseDiscoveryRequest
            = nodeManagement.getFullUseCaseInformationRequest(
                communicationAddress,
                deviceAddress
        );

        try {
            handleUseCaseDiscovery(useCaseDiscoveryRequest);
        }
        catch (ExecutionException |
               InterruptedException |
               NullPointerException |
               TimeoutException e) {
            LOGGER.warn(
                "There was an error in the UseCaseDiscovery of {}. "
                    + "Trying to filter DetailedDiscoveryData for valid use case partners.",
                communicationAddress,
                e
            );
        }
        finally {
            boolean anyResults = notifyDiscoveryListeners();

            if (!anyResults) {
                LOGGER.info(
                    "No common use cases with {} at {} were found. "
                        + "Awaiting NodeManagement updates.",
                    deviceAddress,
                    communicationAddress
                );
            }
        }

        /* NodeManagement Subscription happens last because updates
         * during the discovery would be quite confusing. */
        CompletableFuture<RequestResult> subscriptionRequest
            = nodeManagement.getNodeManagementSubscriptionRequest(
                communicationAddress,
                deviceAddress,
                this::handleNodeManagementNotification
        );

        subscriptionRequest.whenComplete(this::handleNodeManagementSubscription);
    }

    private boolean notifyDiscoveryListeners() {
        return nodeManagement
            .getCurrentUseCaseListeners()
            .stream()
            .map(listener -> listener.handleDiscovery(
                communicationAddress,
                useCaseData,
                detailedDiscoveryData
            ))
            .reduce(false, Boolean::logicalOr);
    }

    private void handleUseCaseDiscovery(CompletableFuture<RequestResult> useCaseDiscoveryRequest) throws
        InterruptedException, ExecutionException, TimeoutException {
        RequestResult requestResult
            = useCaseDiscoveryRequest.get(2, MINUTES);

        useCaseData = requestResult
            .getCmd()
            .getNodeManagementUseCaseData();

        nodeManagement
            .getDiscoveryLogger()
            .enqueueUseCaseDiscovery(deviceAddress, useCaseData);
    }

    private void handleDetailedDiscovery(CompletableFuture<RequestResult> request) throws
        ExecutionException, InterruptedException, TimeoutException {

        RequestResult result = request.get(2, MINUTES);

        deviceAddress = result.getSenderAddress().getDevice();

        detailedDiscoveryData = result
            .getCmd()
            .getNodeManagementDetailedDiscoveryData();

        String theirVersion = result
            .getDatagram()
            .getHeader()
            .getSpecificationVersion();

        if (!isSameVersion(theirVersion)) {
            LOGGER.warn(
                "SPINE version mismatch found at {}: {}",
                deviceAddress,
                theirVersion
            );
        }
        nodeManagement
            .getDiscoveryLogger()
            .enqueueDetailedDiscovery(deviceAddress, detailedDiscoveryData);
    }

    private void handleNodeManagementSubscription(
        RequestResult result,
        Throwable error
    ) {
        if (Objects.nonNull(error)) {
            LOGGER.warn(
                "There was an error subscribing to the NodeManagement of {}: {}",
                communicationAddress,
                error.getMessage()
            );
        }
        else {
            LOGGER.info(
                "Successfully subscribed to the NodeManagement of {}",
                communicationAddress
            );
        }
    }

    private void handleNodeManagementNotification(RequestResult notification) {
        LOGGER.warn("NodeManagementNotifications are currently ignored.");
        // TODO
    }

    private boolean isSameVersion(String theirVersion) {
        return Objects.equals(
            nodeManagement.getDevice().getSpecificationVersion().getValue(),
            theirVersion
        );
    }

}
