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

import org.openmuc.jeebus.spine.xsd.v1.EntityAddressType;

import java.util.Collection;

public interface EntityParent {
    /**
     * Adds an entity with all its sub-entities and features to this device/entity at
     * runtime. After the entity was added the {@link NodeManagement} instance
     * notifies subscribers about the change.
     *
     * @param entity
     *     the entity built with {@link Entity#getBuilder()}
     * @return the entity address part of the added entity
     */
    int addEntity(Entity entity);

    /**
     * @param address
     *     the entity address part of the entity address
     *     {@link EntityAddressType#getEntity()}. Note that this implementation
     *     limits entity addresses to {@link Integer#MAX_VALUE}
     * @return the entity with the given address
     * @throws SpineException
     *     when no entity with the given address exists
     */
    Entity getEntity(int address) throws SpineException;

    /**
     * @param address
     *     the entity address part of the entity address
     *     {@link EntityAddressType#getEntity()}. Note that this implementation
     *     limits entity addresses to {@link Integer#MAX_VALUE}
     * @throws SpineException
     *     when no entity with the given address exists
     */
    void deleteEntity(int address) throws SpineException;

    /**
     * @return the parent of this entity or <code>null</code> if this is a device
     */
    EntityParent getParent();

    /**
     * @return all sub-entities of this entity excluding sub-entities of sub-entities
     */
    Collection<Entity> getEntities();

    /**
     * @return true if this is a <code>Device</code>, false if this is an
     * <code>Entity</code>
     */
    boolean isDevice();

    /**
     * @return the device this entity belongs to or this instance itself if this a
     * device
     */
    Device getDevice();
}
