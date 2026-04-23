/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.api;

import org.openmuc.jeebus.spine.impl.DeviceBuilder;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Map;

public interface Device extends EntityParent, Shutdownable {
    /**
     * @return a new <code>DeviceBuilder</code> object to create a new SPINE device
     */
    static DeviceBuilder getBuilder() {
        return new DeviceBuilder();
    }

    /**
     * Returns the node management feature instance associated to this device.
     *
     * @return the node management feature instance
     */
    NodeManagement getNodeManagement();

    /**
     * @return the connection handler instance
     */
    ConnectionHandler getConnectionHandler();

    /**
     * @return the device address
     */
    DeviceAddressType getAddress();

    // TODO: better name (for connection start)

    /**
     * Starts the detailed discovery process if enabled
     *
     * @param address
     *     The address on which the new device was detected
     */
    void deviceDetected(String address);

    /**
     * Forwards the given datagram to the receiving feature for processing
     *
     * @param datagram
     *     filled SPINE datagram
     */
    void parseDatagram(DatagramType datagram);

    /**
     * @return the latest SPINE specification version this device supports
     */
    SpecificationVersionDataType getSpecificationVersion();

    /**
     * @return the type of this device
     */
    DeviceTypeEnumType getType();

    /**
     * @return true if this device has a description set and false otherwise
     */
    boolean hasDescription();

    /**
     * @return true if this device has a label set and false otherwise
     */
    boolean hasLabel();

    /**
     * Returns the feature with the address given or throws a SpineException if the
     * requested feature does not exist.
     *
     * @param featureAddress
     *     the address of the requested feature including the entity address parts
     * @return the feature with the given address
     * @throws SpineException
     *     when no feature at the given address exists
     */
    Feature getFeature(FeatureAddressType featureAddress) throws SpineException;

    /**
     * @return the label set or the empty string if no label was set
     */
    String getLabel();

    /**
     * @return the description set or the empty string if no label was set
     */
    String getDescription();

    /**
     * @return the communication mode this device supports (every value other than
     * SIMPLE means enhanced communication mode)
     */
    NetworkManagementFeatureSetType getCommunicationMode();


    /**
     * @return a collection of use cases active on the device
     */
    Map<UseCase, Entity> getUseCases();
}
