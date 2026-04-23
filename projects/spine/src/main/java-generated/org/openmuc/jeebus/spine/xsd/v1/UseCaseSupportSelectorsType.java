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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for UseCaseSupportSelectorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseSupportSelectorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
 *         &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseSupportSelectorsType", propOrder = {
    "useCaseName",
    "useCaseVersion",
    "scenarioSupport"
})
public class UseCaseSupportSelectorsType implements Cloneable, CopyTo, ToString
{

    protected String useCaseName;
    protected String useCaseVersion;
    @XmlSchemaType(name = "unsignedInt")
    protected Long scenarioSupport;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseSupportSelectorsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseSupportSelectorsType(final String useCaseName, final String useCaseVersion, final Long scenarioSupport) {
        this.useCaseName = useCaseName;
        this.useCaseVersion = useCaseVersion;
        this.scenarioSupport = scenarioSupport;
    }

    /**
     * Gets the value of the useCaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCaseName() {
        return useCaseName;
    }

    /**
     * Sets the value of the useCaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCaseName(String value) {
        this.useCaseName = value;
    }

    /**
     * Gets the value of the useCaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCaseVersion() {
        return useCaseVersion;
    }

    /**
     * Sets the value of the useCaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCaseVersion(String value) {
        this.useCaseVersion = value;
    }

    /**
     * Gets the value of the scenarioSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScenarioSupport() {
        return scenarioSupport;
    }

    /**
     * Sets the value of the scenarioSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScenarioSupport(Long value) {
        this.scenarioSupport = value;
    }

    /**
     * Sets the value of the useCaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public UseCaseSupportSelectorsType withUseCaseName(String value) {
        setUseCaseName(value);
        return this;
    }

    /**
     * Sets the value of the useCaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public UseCaseSupportSelectorsType withUseCaseVersion(String value) {
        setUseCaseVersion(value);
        return this;
    }

    /**
     * Sets the value of the scenarioSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public UseCaseSupportSelectorsType withScenarioSupport(Long value) {
        setScenarioSupport(value);
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
        if (draftCopy instanceof UseCaseSupportSelectorsType) {
            final UseCaseSupportSelectorsType copy = ((UseCaseSupportSelectorsType) draftCopy);
            {
                Boolean useCaseNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseName!= null));
                if (useCaseNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUseCaseName;
                    sourceUseCaseName = this.getUseCaseName();
                    String copyUseCaseName = ((String) strategy.copy(LocatorUtils.property(locator, "useCaseName", sourceUseCaseName), sourceUseCaseName, (this.useCaseName!= null)));
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
                    String sourceUseCaseVersion;
                    sourceUseCaseVersion = this.getUseCaseVersion();
                    String copyUseCaseVersion = ((String) strategy.copy(LocatorUtils.property(locator, "useCaseVersion", sourceUseCaseVersion), sourceUseCaseVersion, (this.useCaseVersion!= null)));
                    copy.setUseCaseVersion(copyUseCaseVersion);
                } else {
                    if (useCaseVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseVersion = null;
                    }
                }
            }
            {
                Boolean scenarioSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scenarioSupport!= null));
                if (scenarioSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceScenarioSupport;
                    sourceScenarioSupport = this.getScenarioSupport();
                    Long copyScenarioSupport = ((Long) strategy.copy(LocatorUtils.property(locator, "scenarioSupport", sourceScenarioSupport), sourceScenarioSupport, (this.scenarioSupport!= null)));
                    copy.setScenarioSupport(copyScenarioSupport);
                } else {
                    if (scenarioSupportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scenarioSupport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new UseCaseSupportSelectorsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseSupportSelectorsType that = ((UseCaseSupportSelectorsType) object);
        {
            String leftUseCaseName;
            leftUseCaseName = this.getUseCaseName();
            String rightUseCaseName;
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
            String leftUseCaseVersion;
            leftUseCaseVersion = this.getUseCaseVersion();
            String rightUseCaseVersion;
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
            Long leftScenarioSupport;
            leftScenarioSupport = this.getScenarioSupport();
            Long rightScenarioSupport;
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        {
            currentHashCode = (currentHashCode* 31);
            String theUseCaseName;
            theUseCaseName = this.getUseCaseName();
            if (this.useCaseName!= null) {
                currentHashCode += theUseCaseName.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theUseCaseVersion;
            theUseCaseVersion = this.getUseCaseVersion();
            if (this.useCaseVersion!= null) {
                currentHashCode += theUseCaseVersion.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theScenarioSupport;
            theScenarioSupport = this.getScenarioSupport();
            if (this.scenarioSupport!= null) {
                currentHashCode += theScenarioSupport.hashCode();
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
            String theUseCaseName;
            theUseCaseName = this.getUseCaseName();
            strategy.appendField(locator, this, "useCaseName", buffer, theUseCaseName, (this.useCaseName!= null));
        }
        {
            String theUseCaseVersion;
            theUseCaseVersion = this.getUseCaseVersion();
            strategy.appendField(locator, this, "useCaseVersion", buffer, theUseCaseVersion, (this.useCaseVersion!= null));
        }
        {
            Long theScenarioSupport;
            theScenarioSupport = this.getScenarioSupport();
            strategy.appendField(locator, this, "scenarioSupport", buffer, theScenarioSupport, (this.scenarioSupport!= null));
        }
        return buffer;
    }

}
