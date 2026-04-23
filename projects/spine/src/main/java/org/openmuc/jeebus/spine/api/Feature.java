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

import org.openmuc.jeebus.spine.impl.EntityBuilder;
import org.openmuc.jeebus.spine.impl.FeatureBuilder;
import org.openmuc.jeebus.spine.spi.BindingListener;
import org.openmuc.jeebus.spine.spi.SpineSubscription;
import org.openmuc.jeebus.spine.spi.function.FeatureFunction;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface Feature {
    /**
     * The returned builder builds a SPINE feature which can be added to an existing
     * SPINE entity at runtime with {@link Entity#addFeature(Feature)}.
     * <br>
     * This method shall not be used to set up an entity which was not added to a
     * device yet. For this purpose {@link EntityBuilder#addFeature()} shall be
     * used.
     *
     * @return a new <code>FeatureBuilder</code> object to create a new SPINE feature
     */
    static FeatureBuilder getBuilder() {
        return new FeatureBuilder();
    }

    /**
     * @return the role of this feature
     */
    RoleType getRole();

    /**
     * @return the label set or the empty string if no label was set
     */
    String getLabel();

    /**
     * @return true if this feature has a label set and false otherwise
     */
    boolean hasLabel();

    /**
     * @return the description set or the empty string if no description was set
     */
    String getDescription();

    /**
     * @return true if this feature has a description set and false otherwise
     */
    boolean hasDescription();

    /**
     * Adds the passed SPINE function to the feature. After the function was added
     * the {@link NodeManagement} instance notifies subscribers about the change.
     *
     * @param function
     *     the SPINE function to add
     */
    void addFunction(FeatureFunction function);

    /**
     * Look up the function with the given type, or add it if not present.
     *
     * @param functionType
     *     the function type to look for or create
     * @param <T>
     *     the function type to look for or create
     * @return the function with the given type that is now present on this feature
     */
    <T extends FeatureFunction> T getOrAddFunction(Class<? extends T> functionType);

    /**
     * Looks up a previously added function by its type.
     *
     * @param functionClass
     *     the class of the feature function to look up
     * @param <T>
     *     the function type to look for or create
     * @return the function of that type, if present
     */
    <T extends FeatureFunction> Optional<T> getFunction(Class<? extends T> functionClass);

    /**
     * Looks up a previously added function by its SPINE type
     *
     * @param functionEnumType
     *     the function type to look for
     * @return the function of that type, if present
     */
    FeatureFunction getFunction(FunctionEnumType functionEnumType);

    /**
     * Looks up a previously added function by its function name
     *
     * @param function
     *     the function name to look for
     * @return the function with that name, if present
     */
    FeatureFunction getFunction(String function);

    /**
     * @return the device this feature belongs to
     */
    Device getDevice();

    /**
     * Get the {@link FeatureWrapper} for this feature, if present. May be null if
     * using a nonstandard feature type or a feature type for which we don't have an
     * implementation.
     *
     * @return A wrapper around this feature, if present.
     * @see #getFeatureWrapper(Class)
     */
    FeatureWrapper getFeatureWrapper();

    /**
     * Get the {@link FeatureWrapper} for this feature, if present and of the
     * expected type. May be null if using a nonstandard feature type, a feature type
     * for which we don't have an implementation, or if the feature type doesn't
     * match.
     *
     * @param <T>
     *     the type of the expected feature wrapper
     * @param wrapperClass
     *     the class of the expected feature wrapper
     * @return A wrapper around this feature, if present.
     * @see #getFeatureWrapper(Class)
     */
    <T extends FeatureWrapper> T getFeatureWrapper(Class<T> wrapperClass);

    /**
     * Shut down the feature, stopping any associated threads and releasing any other
     * held resources.
     */
    default void shutdown() {}

    /**
     * Sends a read request to the remote feature located at the given address. The
     * returned
     * <code>CompletableFuture</code> is completed with the replied datagram on
     * success and completed with a {@link SpineException} on failure.
     *
     * @param address
     *     the address of the remote feature which shall be read
     * @param cmd
     *     the command containing the to be read function and optional filter
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> requestRead(
        FeatureAddressType address,
        CmdType cmd
    );

    /**
     * Sends a write request to the remote feature located at the given address. The
     * returned
     * <code>CompletableFuture</code> is completed with the replied acknowledgment
     * datagram on success and completed with a {@link SpineException} on failure.
     *
     * @param address
     *     the address of the remote feature which shall be written to
     * @param cmd
     *     the command containing the to be written information and optional filter
     * @return a <code>CompletableFuture</code> which is completed with the answer
     */
    CompletableFuture<RequestResult> requestWrite(
        FeatureAddressType address,
        CmdType cmd
    );

    /**
     * Sends a subscription request to the remote feature located at the given
     * address. The returned
     * <code>CompletableFuture</code> is completed with the replied acknowledgment
     * datagram on success and completed with a {@link SpineException} on failure.
     *
     * @param address
     *     the address of the remote feature which shall be subscribed to
     * @param featureType
     *     the type of the remote feature
     * @param subscription
     *     the subscription which will be called with notifications
     * @return a <code>CompletableFuture</code> which is completed with the
     * acknowledgment
     */
    CompletableFuture<RequestResult> requestSubscription(
        FeatureAddressType address,
        FeatureTypeEnumType featureType,
        SpineSubscription subscription
    );

    /**
     * Sends a binding request to the remote feature located at the given address.
     * The returned
     * <code>CompletableFuture</code> is completed with the replied acknowledgment
     * datagram on success and completed with a {@link SpineException} on failure.
     *
     * @param address
     *     the address of the remote feature which shall be bound
     * @param featureType
     *     the type of the remote feature
     * @return a <code>CompletableFuture</code> which is completed with the
     * acknowledgment
     */
    CompletableFuture<RequestResult> requestBind(
        FeatureAddressType address,
        FeatureTypeEnumType featureType
    );

    /**
     * Releases the subscription of this feature to the server feature located at the
     * given address.
     *
     * @param serverAddress
     *     the address of the server feature which this client is subscribed to
     */
    void releaseSubscription(FeatureAddressType serverAddress);

    /**
     * Releases the subscription of the client feature located at the given address
     * to this feature.
     *
     * @param clientAddress
     *     the address of the client feature which is subscribed to this feature
     */
    void releaseSubscriber(FeatureAddressType clientAddress);

    /**
     * Releases the binding of the client feature located at the given address to
     * this feature.
     *
     * @param clientAddress
     *     the address of the client feature which is bound to this feature
     */
    void releaseBoundClient(FeatureAddressType clientAddress);

    /**
     * Releases the binding of this feature to the server feature located at the
     * given address.
     *
     * @param serverAddress
     *     the address of the server feature which this client is bound to
     */
    void releaseBoundServer(FeatureAddressType serverAddress);

    /**
     * Notifies subscribers of this SPINE feature that data contained in the given
     * SPINE function has changed.
     * <br>
     * The passed filter should be equivalent to a filter of a partial read on the
     * function, which would return only the changed data. If the filter is
     * <code>null</code> the notification sends all function data.
     *
     * @param function
     *     the SPINE function on which a change occurred
     * @param filter
     *     the filter with which a partial read on the feature returns the changed
     *     data
     */
    void notifySubscribers(FunctionEnumType function, FilterType filter);

    /**
     * Notifies subscribers of this SPINE feature that data contained in the given
     * command has changed. This method should be used, if partial notifications
     * should be possible but partial read is not implemented at the related
     * FeatureFunction or if data was deleted.
     *
     * @param cmd
     *     the complete notification command including the filter on restricted
     *     function exchange
     */
    void notifySubscribers(CmdType cmd);

    /**
     * Returns the address of this feature relative to the parent device.
     * <br>
     * The list returned by {@link FeatureAddressType#getEntity()} contains the
     * address parts of all entity parents in order
     *
     * @return the feature address
     */
    FeatureAddressType getAddress();

    /**
     * @return the type of this feature
     */
    FeatureTypeEnumType getType();

    /**
     * @param listener
     *     is called when a successful binding is established on this Feature
     */
    void addBindingListener(BindingListener listener);

}
