/********************************************************************************
 * Copyright (c) 2026 Fraunhofer ISE
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openmuc.jeebus.spine.xsd.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for NetworkManagementJoiningModeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementJoiningModeDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setup" type="{http://docs.eebus.org/spine/xsd/v1}NetworkManagementSetupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementJoiningModeDataType", propOrder = {
    "setup"
})
public class NetworkManagementJoiningModeDataType implements Cloneable, CopyTo, ToString
{

    protected String setup;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementJoiningModeDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementJoiningModeDataType(final String setup) {
        this.setup = setup;
    }

    /**
     * Gets the value of the setup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetup() {
        return setup;
    }

    /**
     * Sets the value of the setup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetup(String value) {
        this.setup = value;
    }

    /**
     * Sets the value of the setup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public NetworkManagementJoiningModeDataType withSetup(String value) {
        setSetup(value);
        return this;
    }

    @Override
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof NetworkManagementJoiningModeDataType) {
            final NetworkManagementJoiningModeDataType copy = ((NetworkManagementJoiningModeDataType) draftCopy);
            {
                Boolean setupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setup!= null));
                if (setupShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSetup;
                    sourceSetup = this.getSetup();
                    String copySetup = ((String) strategy.copy(LocatorUtils.property(locator, "setup", sourceSetup), sourceSetup, (this.setup!= null)));
                    copy.setSetup(copySetup);
                } else {
                    if (setupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setup = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementJoiningModeDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementJoiningModeDataType that = ((NetworkManagementJoiningModeDataType) object);
        {
            String leftSetup;
            leftSetup = this.getSetup();
            String rightSetup;
            rightSetup = that.getSetup();
            if (this.setup!= null) {
                if (that.setup!= null) {
                    if (!leftSetup.equals(rightSetup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setup!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            String theSetup;
            theSetup = this.getSetup();
            if (this.setup!= null) {
                currentHashCode += theSetup.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new CustomToStringStrategy();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theSetup;
            theSetup = this.getSetup();
            strategy.appendField(locator, this, "setup", buffer, theSetup, (this.setup!= null));
        }
        return buffer;
    }

}
