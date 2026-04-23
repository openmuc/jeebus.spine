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
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for UseCaseInformationListDataSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseInformationListDataSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportSelectorsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseInformationListDataSelectorsType", propOrder = {
    "address",
    "actor",
    "useCaseSupport"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataSelectorsType.UseCaseInformation.class
})
public class UseCaseInformationListDataSelectorsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType address;
    protected String actor;
    protected UseCaseSupportSelectorsType useCaseSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseInformationListDataSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseInformationListDataSelectorsType(final FeatureAddressType address, final String actor, final UseCaseSupportSelectorsType useCaseSupport) {
        this.address = address;
        this.actor = actor;
        this.useCaseSupport = useCaseSupport;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressType }
     *     
     */
    public FeatureAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     *     
     */
    public void setAddress(FeatureAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActor(String value) {
        this.actor = value;
    }

    /**
     * Gets the value of the useCaseSupport property.
     * 
     * @return
     *     possible object is
     *     {@link UseCaseSupportSelectorsType }
     *     
     */
    public UseCaseSupportSelectorsType getUseCaseSupport() {
        return useCaseSupport;
    }

    /**
     * Sets the value of the useCaseSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseSupportSelectorsType }
     *     
     */
    public void setUseCaseSupport(UseCaseSupportSelectorsType value) {
        this.useCaseSupport = value;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressType }
     * @return
     *     The class instance
     */
    public UseCaseInformationListDataSelectorsType withAddress(FeatureAddressType value) {
        setAddress(value);
        return this;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public UseCaseInformationListDataSelectorsType withActor(String value) {
        setActor(value);
        return this;
    }

    /**
     * Sets the value of the useCaseSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseSupportSelectorsType }
     * @return
     *     The class instance
     */
    public UseCaseInformationListDataSelectorsType withUseCaseSupport(UseCaseSupportSelectorsType value) {
        setUseCaseSupport(value);
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
        if (draftCopy instanceof UseCaseInformationListDataSelectorsType) {
            final UseCaseInformationListDataSelectorsType copy = ((UseCaseInformationListDataSelectorsType) draftCopy);
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressType sourceAddress;
                    sourceAddress = this.getAddress();
                    FeatureAddressType copyAddress = ((FeatureAddressType) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean actorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actor!= null));
                if (actorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceActor;
                    sourceActor = this.getActor();
                    String copyActor = ((String) strategy.copy(LocatorUtils.property(locator, "actor", sourceActor), sourceActor, (this.actor!= null)));
                    copy.setActor(copyActor);
                } else {
                    if (actorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actor = null;
                    }
                }
            }
            {
                Boolean useCaseSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseSupport!= null));
                if (useCaseSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    UseCaseSupportSelectorsType sourceUseCaseSupport;
                    sourceUseCaseSupport = this.getUseCaseSupport();
                    UseCaseSupportSelectorsType copyUseCaseSupport = ((UseCaseSupportSelectorsType) strategy.copy(LocatorUtils.property(locator, "useCaseSupport", sourceUseCaseSupport), sourceUseCaseSupport, (this.useCaseSupport!= null)));
                    copy.setUseCaseSupport(copyUseCaseSupport);
                } else {
                    if (useCaseSupportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseSupport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new UseCaseInformationListDataSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseInformationListDataSelectorsType that = ((UseCaseInformationListDataSelectorsType) object);
        {
            FeatureAddressType leftAddress;
            leftAddress = this.getAddress();
            FeatureAddressType rightAddress;
            rightAddress = that.getAddress();
            if (this.address!= null) {
                if (that.address!= null) {
                    if (!leftAddress.equals(rightAddress)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.address!= null) {
                    return false;
                }
            }
        }
        {
            String leftActor;
            leftActor = this.getActor();
            String rightActor;
            rightActor = that.getActor();
            if (this.actor!= null) {
                if (that.actor!= null) {
                    if (!leftActor.equals(rightActor)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.actor!= null) {
                    return false;
                }
            }
        }
        {
            UseCaseSupportSelectorsType leftUseCaseSupport;
            leftUseCaseSupport = this.getUseCaseSupport();
            UseCaseSupportSelectorsType rightUseCaseSupport;
            rightUseCaseSupport = that.getUseCaseSupport();
            if (this.useCaseSupport!= null) {
                if (that.useCaseSupport!= null) {
                    if (!leftUseCaseSupport.equals(rightUseCaseSupport)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseSupport!= null) {
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
            FeatureAddressType theAddress;
            theAddress = this.getAddress();
            if (this.address!= null) {
                currentHashCode += theAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theActor;
            theActor = this.getActor();
            if (this.actor!= null) {
                currentHashCode += theActor.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            UseCaseSupportSelectorsType theUseCaseSupport;
            theUseCaseSupport = this.getUseCaseSupport();
            if (this.useCaseSupport!= null) {
                currentHashCode += theUseCaseSupport.hashCode();
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
            FeatureAddressType theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            String theActor;
            theActor = this.getActor();
            strategy.appendField(locator, this, "actor", buffer, theActor, (this.actor!= null));
        }
        {
            UseCaseSupportSelectorsType theUseCaseSupport;
            theUseCaseSupport = this.getUseCaseSupport();
            strategy.appendField(locator, this, "useCaseSupport", buffer, theUseCaseSupport, (this.useCaseSupport!= null));
        }
        return buffer;
    }

}
