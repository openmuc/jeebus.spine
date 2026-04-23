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
 * <p>Java class for UseCaseInformationDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseInformationDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressElementsType" minOccurs="0"/&gt;
 *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseInformationDataElementsType", propOrder = {
    "address",
    "actor",
    "useCaseSupport"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataElementsType.UseCaseInformation.class
})
public class UseCaseInformationDataElementsType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressElementsType address;
    protected ElementTagType actor;
    protected UseCaseSupportElementsType useCaseSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseInformationDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseInformationDataElementsType(final FeatureAddressElementsType address, final ElementTagType actor, final UseCaseSupportElementsType useCaseSupport) {
        this.address = address;
        this.actor = actor;
        this.useCaseSupport = useCaseSupport;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public FeatureAddressElementsType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     *     
     */
    public void setAddress(FeatureAddressElementsType value) {
        this.address = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setActor(ElementTagType value) {
        this.actor = value;
    }

    /**
     * Gets the value of the useCaseSupport property.
     * 
     * @return
     *     possible object is
     *     {@link UseCaseSupportElementsType }
     *     
     */
    public UseCaseSupportElementsType getUseCaseSupport() {
        return useCaseSupport;
    }

    /**
     * Sets the value of the useCaseSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseSupportElementsType }
     *     
     */
    public void setUseCaseSupport(UseCaseSupportElementsType value) {
        this.useCaseSupport = value;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureAddressElementsType }
     * @return
     *     The class instance
     */
    public UseCaseInformationDataElementsType withAddress(FeatureAddressElementsType value) {
        setAddress(value);
        return this;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseInformationDataElementsType withActor(ElementTagType value) {
        setActor(value);
        return this;
    }

    /**
     * Sets the value of the useCaseSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCaseSupportElementsType }
     * @return
     *     The class instance
     */
    public UseCaseInformationDataElementsType withUseCaseSupport(UseCaseSupportElementsType value) {
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
        if (draftCopy instanceof UseCaseInformationDataElementsType) {
            final UseCaseInformationDataElementsType copy = ((UseCaseInformationDataElementsType) draftCopy);
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeatureAddressElementsType sourceAddress;
                    sourceAddress = this.getAddress();
                    FeatureAddressElementsType copyAddress = ((FeatureAddressElementsType) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
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
                    ElementTagType sourceActor;
                    sourceActor = this.getActor();
                    ElementTagType copyActor = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "actor", sourceActor), sourceActor, (this.actor!= null)));
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
                    UseCaseSupportElementsType sourceUseCaseSupport;
                    sourceUseCaseSupport = this.getUseCaseSupport();
                    UseCaseSupportElementsType copyUseCaseSupport = ((UseCaseSupportElementsType) strategy.copy(LocatorUtils.property(locator, "useCaseSupport", sourceUseCaseSupport), sourceUseCaseSupport, (this.useCaseSupport!= null)));
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
        return new UseCaseInformationDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseInformationDataElementsType that = ((UseCaseInformationDataElementsType) object);
        {
            FeatureAddressElementsType leftAddress;
            leftAddress = this.getAddress();
            FeatureAddressElementsType rightAddress;
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
            ElementTagType leftActor;
            leftActor = this.getActor();
            ElementTagType rightActor;
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
            UseCaseSupportElementsType leftUseCaseSupport;
            leftUseCaseSupport = this.getUseCaseSupport();
            UseCaseSupportElementsType rightUseCaseSupport;
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
            FeatureAddressElementsType theAddress;
            theAddress = this.getAddress();
            if (this.address!= null) {
                currentHashCode += theAddress.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theActor;
            theActor = this.getActor();
            if (this.actor!= null) {
                currentHashCode += theActor.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            UseCaseSupportElementsType theUseCaseSupport;
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
            FeatureAddressElementsType theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            ElementTagType theActor;
            theActor = this.getActor();
            strategy.appendField(locator, this, "actor", buffer, theActor, (this.actor!= null));
        }
        {
            UseCaseSupportElementsType theUseCaseSupport;
            theUseCaseSupport = this.getUseCaseSupport();
            strategy.appendField(locator, this, "useCaseSupport", buffer, theUseCaseSupport, (this.useCaseSupport!= null));
        }
        return buffer;
    }

}
