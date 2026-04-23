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
 * <p>Java class for UseCaseSupportElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseSupportElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseAvailable" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseDocumentSubRevision" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseSupportElementsType", propOrder = {
    "useCaseName",
    "useCaseVersion",
    "useCaseAvailable",
    "scenarioSupport",
    "useCaseDocumentSubRevision"
})
public class UseCaseSupportElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType useCaseName;
    protected ElementTagType useCaseVersion;
    protected ElementTagType useCaseAvailable;
    protected ElementTagType scenarioSupport;
    protected ElementTagType useCaseDocumentSubRevision;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseSupportElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseSupportElementsType(final ElementTagType useCaseName, final ElementTagType useCaseVersion, final ElementTagType useCaseAvailable, final ElementTagType scenarioSupport, final ElementTagType useCaseDocumentSubRevision) {
        this.useCaseName = useCaseName;
        this.useCaseVersion = useCaseVersion;
        this.useCaseAvailable = useCaseAvailable;
        this.scenarioSupport = scenarioSupport;
        this.useCaseDocumentSubRevision = useCaseDocumentSubRevision;
    }

    /**
     * Gets the value of the useCaseName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUseCaseName() {
        return useCaseName;
    }

    /**
     * Sets the value of the useCaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUseCaseName(ElementTagType value) {
        this.useCaseName = value;
    }

    /**
     * Gets the value of the useCaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUseCaseVersion() {
        return useCaseVersion;
    }

    /**
     * Sets the value of the useCaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUseCaseVersion(ElementTagType value) {
        this.useCaseVersion = value;
    }

    /**
     * Gets the value of the useCaseAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUseCaseAvailable() {
        return useCaseAvailable;
    }

    /**
     * Sets the value of the useCaseAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUseCaseAvailable(ElementTagType value) {
        this.useCaseAvailable = value;
    }

    /**
     * Gets the value of the scenarioSupport property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getScenarioSupport() {
        return scenarioSupport;
    }

    /**
     * Sets the value of the scenarioSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setScenarioSupport(ElementTagType value) {
        this.scenarioSupport = value;
    }

    /**
     * Gets the value of the useCaseDocumentSubRevision property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getUseCaseDocumentSubRevision() {
        return useCaseDocumentSubRevision;
    }

    /**
     * Sets the value of the useCaseDocumentSubRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setUseCaseDocumentSubRevision(ElementTagType value) {
        this.useCaseDocumentSubRevision = value;
    }

    /**
     * Sets the value of the useCaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseSupportElementsType withUseCaseName(ElementTagType value) {
        setUseCaseName(value);
        return this;
    }

    /**
     * Sets the value of the useCaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseSupportElementsType withUseCaseVersion(ElementTagType value) {
        setUseCaseVersion(value);
        return this;
    }

    /**
     * Sets the value of the useCaseAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseSupportElementsType withUseCaseAvailable(ElementTagType value) {
        setUseCaseAvailable(value);
        return this;
    }

    /**
     * Sets the value of the scenarioSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseSupportElementsType withScenarioSupport(ElementTagType value) {
        setScenarioSupport(value);
        return this;
    }

    /**
     * Sets the value of the useCaseDocumentSubRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public UseCaseSupportElementsType withUseCaseDocumentSubRevision(ElementTagType value) {
        setUseCaseDocumentSubRevision(value);
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
        if (draftCopy instanceof UseCaseSupportElementsType) {
            final UseCaseSupportElementsType copy = ((UseCaseSupportElementsType) draftCopy);
            {
                Boolean useCaseNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseName!= null));
                if (useCaseNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUseCaseName;
                    sourceUseCaseName = this.getUseCaseName();
                    ElementTagType copyUseCaseName = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "useCaseName", sourceUseCaseName), sourceUseCaseName, (this.useCaseName!= null)));
                    copy.setUseCaseName(copyUseCaseName);
                } else {
                    if (useCaseNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseName = null;
                    }
                }
            }
            {
                Boolean useCaseVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseVersion!= null));
                if (useCaseVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUseCaseVersion;
                    sourceUseCaseVersion = this.getUseCaseVersion();
                    ElementTagType copyUseCaseVersion = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "useCaseVersion", sourceUseCaseVersion), sourceUseCaseVersion, (this.useCaseVersion!= null)));
                    copy.setUseCaseVersion(copyUseCaseVersion);
                } else {
                    if (useCaseVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseVersion = null;
                    }
                }
            }
            {
                Boolean useCaseAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseAvailable!= null));
                if (useCaseAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUseCaseAvailable;
                    sourceUseCaseAvailable = this.getUseCaseAvailable();
                    ElementTagType copyUseCaseAvailable = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "useCaseAvailable", sourceUseCaseAvailable), sourceUseCaseAvailable, (this.useCaseAvailable!= null)));
                    copy.setUseCaseAvailable(copyUseCaseAvailable);
                } else {
                    if (useCaseAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseAvailable = null;
                    }
                }
            }
            {
                Boolean scenarioSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scenarioSupport!= null));
                if (scenarioSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceScenarioSupport;
                    sourceScenarioSupport = this.getScenarioSupport();
                    ElementTagType copyScenarioSupport = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "scenarioSupport", sourceScenarioSupport), sourceScenarioSupport, (this.scenarioSupport!= null)));
                    copy.setScenarioSupport(copyScenarioSupport);
                } else {
                    if (scenarioSupportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scenarioSupport = null;
                    }
                }
            }
            {
                Boolean useCaseDocumentSubRevisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseDocumentSubRevision!= null));
                if (useCaseDocumentSubRevisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceUseCaseDocumentSubRevision;
                    sourceUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
                    ElementTagType copyUseCaseDocumentSubRevision = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "useCaseDocumentSubRevision", sourceUseCaseDocumentSubRevision), sourceUseCaseDocumentSubRevision, (this.useCaseDocumentSubRevision!= null)));
                    copy.setUseCaseDocumentSubRevision(copyUseCaseDocumentSubRevision);
                } else {
                    if (useCaseDocumentSubRevisionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseDocumentSubRevision = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new UseCaseSupportElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseSupportElementsType that = ((UseCaseSupportElementsType) object);
        {
            ElementTagType leftUseCaseName;
            leftUseCaseName = this.getUseCaseName();
            ElementTagType rightUseCaseName;
            rightUseCaseName = that.getUseCaseName();
            if (this.useCaseName!= null) {
                if (that.useCaseName!= null) {
                    if (!leftUseCaseName.equals(rightUseCaseName)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseName!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUseCaseVersion;
            leftUseCaseVersion = this.getUseCaseVersion();
            ElementTagType rightUseCaseVersion;
            rightUseCaseVersion = that.getUseCaseVersion();
            if (this.useCaseVersion!= null) {
                if (that.useCaseVersion!= null) {
                    if (!leftUseCaseVersion.equals(rightUseCaseVersion)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseVersion!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUseCaseAvailable;
            leftUseCaseAvailable = this.getUseCaseAvailable();
            ElementTagType rightUseCaseAvailable;
            rightUseCaseAvailable = that.getUseCaseAvailable();
            if (this.useCaseAvailable!= null) {
                if (that.useCaseAvailable!= null) {
                    if (!leftUseCaseAvailable.equals(rightUseCaseAvailable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseAvailable!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftScenarioSupport;
            leftScenarioSupport = this.getScenarioSupport();
            ElementTagType rightScenarioSupport;
            rightScenarioSupport = that.getScenarioSupport();
            if (this.scenarioSupport!= null) {
                if (that.scenarioSupport!= null) {
                    if (!leftScenarioSupport.equals(rightScenarioSupport)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.scenarioSupport!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftUseCaseDocumentSubRevision;
            leftUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
            ElementTagType rightUseCaseDocumentSubRevision;
            rightUseCaseDocumentSubRevision = that.getUseCaseDocumentSubRevision();
            if (this.useCaseDocumentSubRevision!= null) {
                if (that.useCaseDocumentSubRevision!= null) {
                    if (!leftUseCaseDocumentSubRevision.equals(rightUseCaseDocumentSubRevision)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.useCaseDocumentSubRevision!= null) {
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
            ElementTagType theUseCaseName;
            theUseCaseName = this.getUseCaseName();
            if (this.useCaseName!= null) {
                currentHashCode += theUseCaseName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUseCaseVersion;
            theUseCaseVersion = this.getUseCaseVersion();
            if (this.useCaseVersion!= null) {
                currentHashCode += theUseCaseVersion.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUseCaseAvailable;
            theUseCaseAvailable = this.getUseCaseAvailable();
            if (this.useCaseAvailable!= null) {
                currentHashCode += theUseCaseAvailable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theScenarioSupport;
            theScenarioSupport = this.getScenarioSupport();
            if (this.scenarioSupport!= null) {
                currentHashCode += theScenarioSupport.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theUseCaseDocumentSubRevision;
            theUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
            if (this.useCaseDocumentSubRevision!= null) {
                currentHashCode += theUseCaseDocumentSubRevision.hashCode();
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
            ElementTagType theUseCaseName;
            theUseCaseName = this.getUseCaseName();
            strategy.appendField(locator, this, "useCaseName", buffer, theUseCaseName, (this.useCaseName!= null));
        }
        {
            ElementTagType theUseCaseVersion;
            theUseCaseVersion = this.getUseCaseVersion();
            strategy.appendField(locator, this, "useCaseVersion", buffer, theUseCaseVersion, (this.useCaseVersion!= null));
        }
        {
            ElementTagType theUseCaseAvailable;
            theUseCaseAvailable = this.getUseCaseAvailable();
            strategy.appendField(locator, this, "useCaseAvailable", buffer, theUseCaseAvailable, (this.useCaseAvailable!= null));
        }
        {
            ElementTagType theScenarioSupport;
            theScenarioSupport = this.getScenarioSupport();
            strategy.appendField(locator, this, "scenarioSupport", buffer, theScenarioSupport, (this.scenarioSupport!= null));
        }
        {
            ElementTagType theUseCaseDocumentSubRevision;
            theUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
            strategy.appendField(locator, this, "useCaseDocumentSubRevision", buffer, theUseCaseDocumentSubRevision, (this.useCaseDocumentSubRevision!= null));
        }
        return buffer;
    }

}
