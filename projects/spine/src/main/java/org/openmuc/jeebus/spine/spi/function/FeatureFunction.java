/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.spi.function;

import org.openmuc.jeebus.spine.api.Shutdownable;
import org.openmuc.jeebus.spine.api.Feature;
import org.openmuc.jeebus.spine.api.SpineAcknowledgment;
import org.openmuc.jeebus.spine.api.SpineException;
import org.openmuc.jeebus.spine.xsd.v1.*;

import java.util.Objects;

public abstract class FeatureFunction implements Shutdownable {
    private final FunctionPropertyType functionProperty;
    private final String functionName;
    protected Feature feature;
    private boolean writable;
    private boolean requireBinding;
    private boolean readable;
    private boolean callable;

    protected FeatureFunction(String functionName) {
        this.functionName = functionName;
        functionProperty = new FunctionPropertyType();
        functionProperty.setFunction(functionName);
        functionProperty.setPossibleOperations(new PossibleOperationsType());
    }

    /**
     * This method is automatically called by
     * {@link Feature#addFunction(FeatureFunction)}.
     *
     * @param feature
     *     the SPINE feature this function belongs to
     */
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public boolean isWritable() {
        return writable;
    }

    /**
     * Makes this function writable for other features. Without setting writable to
     * <code>true</code> this function will deny all write requests.
     *
     * @param writable
     *     true if this function provides write functionality
     * @param partial
     *     true if the write function supports restricted function exchange
     */
    public void setWritable(boolean writable, boolean partial) {
        this.writable = writable;
        if (writable) {
            PossibleOperationsWriteType write = new PossibleOperationsWriteType();
            if (partial) {
                write.setPartial(new ElementTagType());
            }
            functionProperty.getPossibleOperations().setWrite(write);
        }
        else {
            functionProperty.getPossibleOperations().setWrite(null);
        }
    }

    /**
     * Call this if the function requires binding before write requests are accepted
     */
    public void requireBinding() {
        requireBinding = true;
    }

    public boolean bindingRequired() {
        return requireBinding;
    }

    public boolean isReadable() {
        return readable;
    }

    /**
     * Makes this function readable for other features. Without setting readable to
     * <code>true</code> this function will deny all read requests.
     *
     * @param readable
     *     true if this function provides read functionality
     * @param partial
     *     true if the read function supports restricted function exchange
     */
    public void setReadable(boolean readable, boolean partial) {
        this.readable = readable;
        if (readable) {
            PossibleOperationsReadType read = new PossibleOperationsReadType();
            if (partial) {
                read.setPartial(new ElementTagType());
            }
            functionProperty.getPossibleOperations().setRead(read);
        }
        else {
            functionProperty.getPossibleOperations().setRead(null);
        }
    }

    public boolean isCallable() {
        return callable;
    }

    /**
     * Makes this function callable from other features. Without setting callable to
     * <code>true</code> this function will deny all call requests.
     *
     * @param callable
     *     true if this function provides call functionality
     */
    public void setCallable(boolean callable) {
        this.callable = callable;
    }

    public FunctionPropertyType getFunctionProperty() {
        return functionProperty;
    }

    public String getFunctionName() {
        return functionName;
    }

    /**
     * @param filter
     *     filter for partial read otherwise null
     * @param sourceAddress
     *     the feature address of the client feature
     * @return an <code>CmdType</code> instance filled with the requested information
     * @throws SpineException
     *     on invalid filter
     */
    public abstract CmdType read(
        FilterType filter,
        FeatureAddressType sourceAddress
    ) throws SpineException;

    /**
     * @param cmd
     *     to be written data including optional filters for restricted function
     *     exchange
     * @param sourceAddress
     *     the feature address of the client feature
     * @return an acknowledgment stating the result of the operation
     * @throws SpineException
     *     if the write command encounters an exception
     */
    public abstract SpineAcknowledgment write(
        CmdType cmd,
        FeatureAddressType sourceAddress
    ) throws SpineException;

    /**
     * @param cmd
     *     the command data belonging to this function call
     * @param sourceAddress
     *     the feature address of the client feature
     * @return an acknowledgment stating the result of the operation
     */
    public abstract SpineAcknowledgment call(
        CmdType cmd,
        FeatureAddressType sourceAddress
    );

    protected boolean matchAddress(
        FeatureAddressType address,
        FeatureAddressType addressFilter
    ) {
        if (!Objects.equals(address.getDevice(), addressFilter.getDevice())) {
            // Device does not match filter
            return false;
        }
        if (address.getEntity().size() >= addressFilter.getEntity().size()) {
            for (int entityIndex = 0;
                 entityIndex < addressFilter.getEntity().size();
                 entityIndex++) {
                if (!address
                    .getEntity()
                    .get(entityIndex)
                    .equals(addressFilter.getEntity().get(entityIndex))) {
                    // (Sub)Entity does not match filter
                    return false;
                }
            }
        }
        else {
            // Address has less sub entities than filter
            return false;
        }
        if (addressFilter.getFeature() == null) {
            // Device and entity address does match, no feature match requested
            return true;
        }
        return address.getFeature().equals(addressFilter.getFeature());
    }
}
