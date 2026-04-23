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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for UseCaseInformationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseInformationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://docs.eebus.org/spine/xsd/v1}FeatureAddressType" minOccurs="0"/&gt;
 *         &lt;element name="actor" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseActorType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseSupportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseInformationDataType", propOrder = {
    "address",
    "actor",
    "useCaseSupport"
})
@XmlSeeAlso({
    org.openmuc.jeebus.spine.xsd.v1.NodeManagementUseCaseDataType.UseCaseInformation.class
})
public class UseCaseInformationDataType implements Cloneable, CopyTo, ToString
{

    protected FeatureAddressType address;
    protected String actor;
    protected List<UseCaseSupportType> useCaseSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseInformationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseInformationDataType(final FeatureAddressType address, final String actor, final List<UseCaseSupportType> useCaseSupport) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the useCaseSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseCaseSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseCaseSupportType }
     * 
     * 
     */
    public List<UseCaseSupportType> getUseCaseSupport() {
        if (useCaseSupport == null) {
            useCaseSupport = new ArrayList<UseCaseSupportType>();
        }
        return this.useCaseSupport;
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
    public UseCaseInformationDataType withAddress(FeatureAddressType value) {
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
    public UseCaseInformationDataType withActor(String value) {
        setActor(value);
        return this;
    }

    /**
     * Adds objects to the list of UseCaseSupport using add method
     * 
     * @param values
     *     objects to add to the list UseCaseSupport
     * @return
     *     The class instance
     */
    public UseCaseInformationDataType withUseCaseSupport(UseCaseSupportType... values) {
        if (values!= null) {
            for (UseCaseSupportType value: values) {
                getUseCaseSupport().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of UseCaseSupport using addAll method
     * 
     * @param values
     *     objects to add to the list UseCaseSupport
     * @return
     *     The class instance
     */
    public UseCaseInformationDataType withUseCaseSupport(Collection<UseCaseSupportType> values) {
        if (values!= null) {
            getUseCaseSupport().addAll(values);
        }
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
        if (draftCopy instanceof UseCaseInformationDataType) {
            final UseCaseInformationDataType copy = ((UseCaseInformationDataType) draftCopy);
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
                Boolean useCaseSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty())));
                if (useCaseSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UseCaseSupportType> sourceUseCaseSupport;
                    sourceUseCaseSupport = (((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty()))?this.getUseCaseSupport():null);
                    @SuppressWarnings("unchecked")
                    List<UseCaseSupportType> copyUseCaseSupport = ((List<UseCaseSupportType> ) strategy.copy(LocatorUtils.property(locator, "useCaseSupport", sourceUseCaseSupport), sourceUseCaseSupport, ((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty()))));
                    copy.useCaseSupport = null;
                    if (copyUseCaseSupport!= null) {
                        List<UseCaseSupportType> uniqueUseCaseSupportl = copy.getUseCaseSupport();
                        uniqueUseCaseSupportl.addAll(copyUseCaseSupport);
                    }
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
        return new UseCaseInformationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseInformationDataType that = ((UseCaseInformationDataType) object);
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
            List<UseCaseSupportType> leftUseCaseSupport;
            leftUseCaseSupport = (((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty()))?this.getUseCaseSupport():null);
            List<UseCaseSupportType> rightUseCaseSupport;
            rightUseCaseSupport = (((that.useCaseSupport!= null)&&(!that.useCaseSupport.isEmpty()))?that.getUseCaseSupport():null);
            if ((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty())) {
                if ((that.useCaseSupport!= null)&&(!that.useCaseSupport.isEmpty())) {
                    if (!leftUseCaseSupport.equals(rightUseCaseSupport)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.useCaseSupport!= null)&&(!that.useCaseSupport.isEmpty())) {
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
            List<UseCaseSupportType> theUseCaseSupport;
            theUseCaseSupport = (((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty()))?this.getUseCaseSupport():null);
            if ((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty())) {
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
            List<UseCaseSupportType> theUseCaseSupport;
            theUseCaseSupport = (((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty()))?this.getUseCaseSupport():null);
            strategy.appendField(locator, this, "useCaseSupport", buffer, theUseCaseSupport, ((this.useCaseSupport!= null)&&(!this.useCaseSupport.isEmpty())));
        }
        return buffer;
    }

}
