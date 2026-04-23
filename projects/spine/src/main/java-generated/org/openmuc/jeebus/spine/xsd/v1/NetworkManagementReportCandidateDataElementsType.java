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
 * <p>Java class for NetworkManagementReportCandidateDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementReportCandidateDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="candidateSetup" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="setupUsableForAdd" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementReportCandidateDataElementsType", propOrder = {
    "candidateSetup",
    "setupUsableForAdd",
    "label",
    "description"
})
public class NetworkManagementReportCandidateDataElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType candidateSetup;
    protected ElementTagType setupUsableForAdd;
    protected ElementTagType label;
    protected ElementTagType description;

    /**
     * Default no-arg constructor
     * 
     */
    public NetworkManagementReportCandidateDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NetworkManagementReportCandidateDataElementsType(final ElementTagType candidateSetup, final ElementTagType setupUsableForAdd, final ElementTagType label, final ElementTagType description) {
        this.candidateSetup = candidateSetup;
        this.setupUsableForAdd = setupUsableForAdd;
        this.label = label;
        this.description = description;
    }

    /**
     * Gets the value of the candidateSetup property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getCandidateSetup() {
        return candidateSetup;
    }

    /**
     * Sets the value of the candidateSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setCandidateSetup(ElementTagType value) {
        this.candidateSetup = value;
    }

    /**
     * Gets the value of the setupUsableForAdd property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getSetupUsableForAdd() {
        return setupUsableForAdd;
    }

    /**
     * Sets the value of the setupUsableForAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setSetupUsableForAdd(ElementTagType value) {
        this.setupUsableForAdd = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLabel(ElementTagType value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setDescription(ElementTagType value) {
        this.description = value;
    }

    /**
     * Sets the value of the candidateSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementReportCandidateDataElementsType withCandidateSetup(ElementTagType value) {
        setCandidateSetup(value);
        return this;
    }

    /**
     * Sets the value of the setupUsableForAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementReportCandidateDataElementsType withSetupUsableForAdd(ElementTagType value) {
        setSetupUsableForAdd(value);
        return this;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementReportCandidateDataElementsType withLabel(ElementTagType value) {
        setLabel(value);
        return this;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public NetworkManagementReportCandidateDataElementsType withDescription(ElementTagType value) {
        setDescription(value);
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
        if (draftCopy instanceof NetworkManagementReportCandidateDataElementsType) {
            final NetworkManagementReportCandidateDataElementsType copy = ((NetworkManagementReportCandidateDataElementsType) draftCopy);
            {
                Boolean candidateSetupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.candidateSetup!= null));
                if (candidateSetupShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceCandidateSetup;
                    sourceCandidateSetup = this.getCandidateSetup();
                    ElementTagType copyCandidateSetup = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "candidateSetup", sourceCandidateSetup), sourceCandidateSetup, (this.candidateSetup!= null)));
                    copy.setCandidateSetup(copyCandidateSetup);
                } else {
                    if (candidateSetupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.candidateSetup = null;
                    }
                }
            }
            {
                Boolean setupUsableForAddShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.setupUsableForAdd!= null));
                if (setupUsableForAddShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceSetupUsableForAdd;
                    sourceSetupUsableForAdd = this.getSetupUsableForAdd();
                    ElementTagType copySetupUsableForAdd = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "setupUsableForAdd", sourceSetupUsableForAdd), sourceSetupUsableForAdd, (this.setupUsableForAdd!= null)));
                    copy.setSetupUsableForAdd(copySetupUsableForAdd);
                } else {
                    if (setupUsableForAddShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setupUsableForAdd = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLabel;
                    sourceLabel = this.getLabel();
                    ElementTagType copyLabel = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceDescription;
                    sourceDescription = this.getDescription();
                    ElementTagType copyDescription = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NetworkManagementReportCandidateDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NetworkManagementReportCandidateDataElementsType that = ((NetworkManagementReportCandidateDataElementsType) object);
        {
            ElementTagType leftCandidateSetup;
            leftCandidateSetup = this.getCandidateSetup();
            ElementTagType rightCandidateSetup;
            rightCandidateSetup = that.getCandidateSetup();
            if (this.candidateSetup!= null) {
                if (that.candidateSetup!= null) {
                    if (!leftCandidateSetup.equals(rightCandidateSetup)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.candidateSetup!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftSetupUsableForAdd;
            leftSetupUsableForAdd = this.getSetupUsableForAdd();
            ElementTagType rightSetupUsableForAdd;
            rightSetupUsableForAdd = that.getSetupUsableForAdd();
            if (this.setupUsableForAdd!= null) {
                if (that.setupUsableForAdd!= null) {
                    if (!leftSetupUsableForAdd.equals(rightSetupUsableForAdd)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.setupUsableForAdd!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLabel;
            leftLabel = this.getLabel();
            ElementTagType rightLabel;
            rightLabel = that.getLabel();
            if (this.label!= null) {
                if (that.label!= null) {
                    if (!leftLabel.equals(rightLabel)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.label!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftDescription;
            leftDescription = this.getDescription();
            ElementTagType rightDescription;
            rightDescription = that.getDescription();
            if (this.description!= null) {
                if (that.description!= null) {
                    if (!leftDescription.equals(rightDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.description!= null) {
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
            ElementTagType theCandidateSetup;
            theCandidateSetup = this.getCandidateSetup();
            if (this.candidateSetup!= null) {
                currentHashCode += theCandidateSetup.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theSetupUsableForAdd;
            theSetupUsableForAdd = this.getSetupUsableForAdd();
            if (this.setupUsableForAdd!= null) {
                currentHashCode += theSetupUsableForAdd.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLabel;
            theLabel = this.getLabel();
            if (this.label!= null) {
                currentHashCode += theLabel.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theDescription;
            theDescription = this.getDescription();
            if (this.description!= null) {
                currentHashCode += theDescription.hashCode();
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
            ElementTagType theCandidateSetup;
            theCandidateSetup = this.getCandidateSetup();
            strategy.appendField(locator, this, "candidateSetup", buffer, theCandidateSetup, (this.candidateSetup!= null));
        }
        {
            ElementTagType theSetupUsableForAdd;
            theSetupUsableForAdd = this.getSetupUsableForAdd();
            strategy.appendField(locator, this, "setupUsableForAdd", buffer, theSetupUsableForAdd, (this.setupUsableForAdd!= null));
        }
        {
            ElementTagType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            ElementTagType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        return buffer;
    }

}
