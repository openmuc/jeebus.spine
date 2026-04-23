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

import org.openmuc.jeebus.spine.api.*;
import org.openmuc.jeebus.spine.spi.Communication;
import org.openmuc.jeebus.spine.spi.DeviceListener;
import org.openmuc.jeebus.spine.spi.UseCase;
import org.openmuc.jeebus.spine.xsd.v1.DeviceTypeEnumType;
import org.openmuc.jeebus.spine.xsd.v1.EntityAddressType;
import org.openmuc.jeebus.spine.xsd.v1.NetworkManagementFeatureSetType;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DeviceBuilder {

    private final DeviceImpl device = new DeviceImpl();
    private final Map<UseCase, Entity> useCases = new HashMap<>();

    /**
     * Builds the SPINE device and connects it to the communication network. After
     * this operation the device is available for communication.
     * <br>
     * If mandatory information was not set ({@link #withId(String)},
     * {@link #withCommunication(Communication)},
     * {@link #withDeviceType(DeviceTypeEnumType)}) this operation throws an
     * <code>IncompleteBuildException</code>.
     *
     * @return the built SPINE device
     * @throws IncompleteBuildException
     *     when id, device type and/or communication was not set
     */
    public Device build() throws IncompleteBuildException {
        buildWithoutConnecting();
        device.connect();
        return device;
    }

    /**
     * Builds the SPINE device, but does not connect it to the communication network.
     * After this operation the device may be further modified if desired, and may be
     * connected to the communication network with {@link Communication#connect()}.
     * <br>
     * If mandatory information was not set ({@link #withId(String)},
     * {@link #withCommunication(Communication)},
     * {@link #withDeviceType(DeviceTypeEnumType)}) this operation throws an
     * <code>IncompleteBuildException</code>.
     *
     * @return the built SPINE device
     * @throws IncompleteBuildException
     *     when id, device type and/or communication was not set
     */
    public Device buildWithoutConnecting() throws IncompleteBuildException {
        if (!device.isCompleted()) {
            throw new IncompleteBuildException(
                "Device could not be built due to missing required information");
        }
        for (UseCase useCase : useCases.keySet()) {
            useCase.setup();
        }
        for (Map.Entry<UseCase, Entity> entry : useCases.entrySet()) {
            ((NodeManagementImpl) device.getNodeManagement()).addUseCase(entry.getKey());
            device.registerUseCase((EntityImpl) entry.getValue(), entry.getKey());
        }
        return device;
    }

    /**
     * Sets the device address of the new SPINE device. This must be a unique address
     * with the following pattern:
     * <code>d:_(i:[1-9][0-9]*|n:[a-zA-Z0-9-]+)_[^\p{Cc}\p{Cf}\p{Z}]+</code> see
     * Chapter 7.1.1.1 in the Protocol
     * Specification for more details.
     * <br>
     * This method must be called before calling {@link #build()}!
     *
     * @param id
     *     the device address identifying this unique SPINE device
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withId(String id) {
        device.setId(id);
        return this;
    }

    /**
     * @return the device address of the new SPINE device.
     */
    public String getId() {
        return device.getAddress().getDevice();
    }

    /**
     * This method must be called before calling {@link #build()}!
     *
     * @param deviceType
     *     the type of the SPINE device
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withDeviceType(DeviceTypeEnumType deviceType) {
        device.setType(deviceType);
        return this;
    }

    /**
     * This method must be called before calling {@link #build()}!
     *
     * @param communication
     *     the communication protocol to use
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withCommunication(Communication communication) {
        device.setCommunication(communication);
        return this;
    }

    /**
     * Enables or disables the automatic DetailedDiscovery of newly discovered SPINE
     * devices. If disabled the DetailedDiscovery must be executed manually via
     * {@link NodeManagement}. {@code true} by default.
     *
     * @param discoverDevices
     *     true if DetailedDiscovery should be started automatically, false
     *     otherwise
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withDiscoverDevices(boolean discoverDevices) {
        device.setDiscoverDevices(discoverDevices);
        return this;
    }

    /**
     * Adds the given {@link DeviceListener} to the device.
     *
     * @param listener
     *     the DeviceListener to add
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder addDeviceListener(DeviceListener listener) {
        device.getNodeManagement().addDeviceListener(listener);
        return this;
    }

    /**
     * Creates a new EntityBuilder instance. The entity can then be fluently added to
     * this device with {@link EntityBuilder#applyToDevice()}.
     *
     * @return a new EntityBuilder instance
     */
    public EntityBuilder addEntity() {
        return new EntityBuilder(this);
    }

    /**
     * @param description
     *     a string describing the new SPINE device
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withDescription(String description) {
        device.setDescription(description);
        return this;
    }

    /**
     * @param label
     *     a human-readable alias of the new SPINE device
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withLabel(String label) {
        device.setLabel(label);
        return this;
    }

    /**
     * @param acknowledgmentEnabled
     *     true if acknowledgment messages shall be requested, false otherwise
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withAcknowledgmentEnabled(boolean acknowledgmentEnabled) {
        device.setAcknowledgment(acknowledgmentEnabled);
        return this;
    }

    /**
     * Controls if the device should support the enhanced communication mode, i.e.
     * can forward messages.{@link NetworkManagementFeatureSetType#SIMPLE} means no
     * forwarding is possible and is the default. With every other value this device
     * maintains a list with known SPINE devices and is able to forward messages to
     * them.
     *
     * @param mode
     *     the NetworkFeatureSet as which the device acts
     * @return the updated <code>DeviceBuilder</code>
     */
    public DeviceBuilder withCommunicationMode(NetworkManagementFeatureSetType mode) {
        device.setCommunicationMode(mode);
        return this;
    }

    public DeviceBuilder withAutomaticDestinationListDetection(boolean enabled) {
        device.setAutomaticDestinationListDetection(enabled);
        return this;
    }

    void addEntity(Entity entity) {
        device.addEntity(entity);
    }

    /**
     * For internal use by {@link EntityBuilder} - register a use case with the parent device.
     * @param useCase the use case to register
     * @param entity the entity on which the use case will run
     */
    void addEntityUseCase(UseCase useCase, Entity entity) {
        useCases.put(useCase, entity);
    }

    /**
     * Enable logging of detailed discovery and use case discovery data.
     * @param enabled whether logging should be enabled
     * @return the updated {@code DeviceBuilder}
     * @see #withDiscoveryLogPath(File) to set the path where these logs are stored
     */
    DeviceBuilder withDiscoveryLogging(boolean enabled) {
        device.setDiscoveryLogging(enabled);
        return this;
    }

    /**
     * Set the path where detailed discovery and use case discovery data should be logged.
     * @param path parent directory for these logs
     * @return the updated {@code DeviceBuilder}
     * @see #withDiscoveryLogging(boolean) to enable logging
     */
    DeviceBuilder withDiscoveryLogPath(File path) {
        device.setDiscoveryLogPath(path);
        return this;
    }

    /**
     * @return the entity address of the last added entity
     */
    public EntityAddressType getLastAddedEntityAddress() {
        try {
            return device.getEntity(device.getEntities().size() - 1).getAddress();
        }
        catch (SpineException e) {
            throw new IllegalStateException(e);
        }
    }
}
