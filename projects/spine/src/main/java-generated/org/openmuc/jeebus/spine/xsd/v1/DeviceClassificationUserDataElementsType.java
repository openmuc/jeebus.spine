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
 * <p>Java class for DeviceClassificationUserDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceClassificationUserDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userNodeIdentification" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="userLabel" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="userDescription" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceClassificationUserDataElementsType", propOrder = {
    "userNodeIdentification",
    "userLabel",
    "userDescription"
})
public class DeviceClassificationUserDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType userNodeIdentification;
    protected ElementTagType userLabel;
    protected ElementTagType userDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public DeviceClassificationUserDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DeviceClassificationUserDataElementsType(final ElementTagType userNodeIdentification, final ElementTagType userLabel, final ElementTagType userDescription) {
        this.userNodeIdentification = userNodeIdentification;
        this.userLabel = userLabel;
        this.userDescription = userDescription;
    }

    /**
     * Gets the value of the userNodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUserNodeIdentification() {
        return userNodeIdentification;
    }

    /**
     * Sets the value of the userNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUserNodeIdentification(ElementTagType value) {
        this.userNodeIdentification = value;
    }

    /**
     * Gets the value of the userLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUserLabel() {
        return userLabel;
    }

    /**
     * Sets the value of the userLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUserLabel(ElementTagType value) {
        this.userLabel = value;
    }

    /**
     * Gets the value of the userDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUserDescription() {
        return userDescription;
    }

    /**
     * Sets the value of the userDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUserDescription(ElementTagType value) {
        this.userDescription = value;
    }

    /**
     * Sets the value of the userNodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationUserDataElementsType withUserNodeIdentification(ElementTagType value) {
        setUserNodeIdentification(value);
        return this;
    }

    /**
     * Sets the value of the userLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationUserDataElementsType withUserLabel(ElementTagType value) {
        setUserLabel(value);
        return this;
    }

    /**
     * Sets the value of the userDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public DeviceClassificationUserDataElementsType withUserDescription(ElementTagType value) {
        setUserDescription(value);
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
        if (draftCopy instanceof DeviceClassificationUserDataElementsType) {
            final DeviceClassificationUserDataElementsType copy = ((DeviceClassificationUserDataElementsType) draftCopy);
            {
                Boolean userNodeIdentificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.userNodeIdentification!= null));
                if (userNodeIdentificationShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUserNodeIdentification;
                    sourceUserNodeIdentification = this.getUserNodeIdentification();
                    ElementTagType copyUserNodeIdentification = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "userNodeIdentification", sourceUserNodeIdentification), sourceUserNodeIdentification, (this.userNodeIdentification!= null)));
                    copy.setUserNodeIdentification(copyUserNodeIdentification);
                } else {
                    if (userNodeIdentificationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userNodeIdentification = null;
                    }
                }
            }
            {
                Boolean userLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.userLabel!= null));
                if (userLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUserLabel;
                    sourceUserLabel = this.getUserLabel();
                    ElementTagType copyUserLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "userLabel", sourceUserLabel), sourceUserLabel, (this.userLabel!= null)));
                    copy.setUserLabel(copyUserLabel);
                } else {
                    if (userLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userLabel = null;
                    }
                }
            }
            {
                Boolean userDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.userDescription!= null));
                if (userDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUserDescription;
                    sourceUserDescription = this.getUserDescription();
                    ElementTagType copyUserDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "userDescription", sourceUserDescription), sourceUserDescription, (this.userDescription!= null)));
                    copy.setUserDescription(copyUserDescription);
                } else {
                    if (userDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DeviceClassificationUserDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DeviceClassificationUserDataElementsType that = ((DeviceClassificationUserDataElementsType) object);
        {
            ElementTagType leftUserNodeIdentification;
            leftUserNodeIdentification = this.getUserNodeIdentification();
            ElementTagType rightUserNodeIdentification;
            rightUserNodeIdentification = that.getUserNodeIdentification();
            if (this.userNodeIdentification!= null) {
                if (that.userNodeIdentification!= null) {
                    if (!leftUserNodeIdentification.equals(rightUserNodeIdentification)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.userNodeIdentification!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUserLabel;
            leftUserLabel = this.getUserLabel();
            ElementTagType rightUserLabel;
            rightUserLabel = that.getUserLabel();
            if (this.userLabel!= null) {
                if (that.userLabel!= null) {
                    if (!leftUserLabel.equals(rightUserLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.userLabel!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUserDescription;
            leftUserDescription = this.getUserDescription();
            ElementTagType rightUserDescription;
            rightUserDescription = that.getUserDescription();
            if (this.userDescription!= null) {
                if (that.userDescription!= null) {
                    if (!leftUserDescription.equals(rightUserDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.userDescription!= null) {
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
            ElementTagType theUserNodeIdentification;
            theUserNodeIdentification = this.getUserNodeIdentification();
            if (this.userNodeIdentification!= null) {
                currentHashCode += theUserNodeIdentification.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUserLabel;
            theUserLabel = this.getUserLabel();
            if (this.userLabel!= null) {
                currentHashCode += theUserLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUserDescription;
            theUserDescription = this.getUserDescription();
            if (this.userDescription!= null) {
                currentHashCode += theUserDescription.hashCode();
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
            ElementTagType theUserNodeIdentification;
            theUserNodeIdentification = this.getUserNodeIdentification();
            strategy.appendField(locator, this, "userNodeIdentification", buffer, theUserNodeIdentification, (this.userNodeIdentification!= null));
        }
        {
            ElementTagType theUserLabel;
            theUserLabel = this.getUserLabel();
            strategy.appendField(locator, this, "userLabel", buffer, theUserLabel, (this.userLabel!= null));
        }
        {
            ElementTagType theUserDescription;
            theUserDescription = this.getUserDescription();
            strategy.appendField(locator, this, "userDescription", buffer, theUserDescription, (this.userDescription!= null));
        }
        return buffer;
    }

}
