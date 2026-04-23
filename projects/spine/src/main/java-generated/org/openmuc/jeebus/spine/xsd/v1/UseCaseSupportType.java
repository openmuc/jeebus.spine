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
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for UseCaseSupportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseSupportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useCaseName" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseNameType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionType" minOccurs="0"/&gt;
 *         &lt;element name="useCaseAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="scenarioSupport" type="{http://docs.eebus.org/spine/xsd/v1}UseCaseScenarioSupportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useCaseDocumentSubRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseSupportType", propOrder = {
    "useCaseName",
    "useCaseVersion",
    "useCaseAvailable",
    "scenarioSupport",
    "useCaseDocumentSubRevision"
})
public class UseCaseSupportType implements Cloneable, CopyTo, ToString
{

    protected String useCaseName;
    protected String useCaseVersion;
    protected Boolean useCaseAvailable;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> scenarioSupport;
    protected String useCaseDocumentSubRevision;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseSupportType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseSupportType(final String useCaseName, final String useCaseVersion, final Boolean useCaseAvailable, final List<Long> scenarioSupport, final String useCaseDocumentSubRevision) {
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
     * Gets the value of the useCaseAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseCaseAvailable() {
        return useCaseAvailable;
    }

    /**
     * Sets the value of the useCaseAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCaseAvailable(Boolean value) {
        this.useCaseAvailable = value;
    }

    /**
     * Gets the value of the scenarioSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the scenarioSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScenarioSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getScenarioSupport() {
        if (scenarioSupport == null) {
            scenarioSupport = new ArrayList<Long>();
        }
        return this.scenarioSupport;
    }

    /**
     * Gets the value of the useCaseDocumentSubRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCaseDocumentSubRevision() {
        return useCaseDocumentSubRevision;
    }

    /**
     * Sets the value of the useCaseDocumentSubRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCaseDocumentSubRevision(String value) {
        this.useCaseDocumentSubRevision = value;
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
    public UseCaseSupportType withUseCaseName(String value) {
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
    public UseCaseSupportType withUseCaseVersion(String value) {
        setUseCaseVersion(value);
        return this;
    }

    /**
     * Sets the value of the useCaseAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return
     *     The class instance
     */
    public UseCaseSupportType withUseCaseAvailable(Boolean value) {
        setUseCaseAvailable(value);
        return this;
    }

    /**
     * Adds objects to the list of ScenarioSupport using add method
     * 
     * @param values
     *     objects to add to the list ScenarioSupport
     * @return
     *     The class instance
     */
    public UseCaseSupportType withScenarioSupport(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getScenarioSupport().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of ScenarioSupport using addAll method
     * 
     * @param values
     *     objects to add to the list ScenarioSupport
     * @return
     *     The class instance
     */
    public UseCaseSupportType withScenarioSupport(Collection<Long> values) {
        if (values!= null) {
            getScenarioSupport().addAll(values);
        }
        return this;
    }

    /**
     * Sets the value of the useCaseDocumentSubRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public UseCaseSupportType withUseCaseDocumentSubRevision(String value) {
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
        if (draftCopy instanceof UseCaseSupportType) {
            final UseCaseSupportType copy = ((UseCaseSupportType) draftCopy);
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
                Boolean useCaseAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseAvailable!= null));
                if (useCaseAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUseCaseAvailable;
                    sourceUseCaseAvailable = this.getUseCaseAvailable();
                    Boolean copyUseCaseAvailable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "useCaseAvailable", sourceUseCaseAvailable), sourceUseCaseAvailable, (this.useCaseAvailable!= null)));
                    copy.setUseCaseAvailable(copyUseCaseAvailable);
                } else {
                    if (useCaseAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseAvailable = null;
                    }
                }
            }
            {
                Boolean scenarioSupportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty())));
                if (scenarioSupportShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceScenarioSupport;
                    sourceScenarioSupport = (((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty()))?this.getScenarioSupport():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyScenarioSupport = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "scenarioSupport", sourceScenarioSupport), sourceScenarioSupport, ((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty()))));
                    copy.scenarioSupport = null;
                    if (copyScenarioSupport!= null) {
                        List<Long> uniqueScenarioSupportl = copy.getScenarioSupport();
                        uniqueScenarioSupportl.addAll(copyScenarioSupport);
                    }
                } else {
                    if (scenarioSupportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scenarioSupport = null;
                    }
                }
            }
            {
                Boolean useCaseDocumentSubRevisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.useCaseDocumentSubRevision!= null));
                if (useCaseDocumentSubRevisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUseCaseDocumentSubRevision;
                    sourceUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
                    String copyUseCaseDocumentSubRevision = ((String) strategy.copy(LocatorUtils.property(locator, "useCaseDocumentSubRevision", sourceUseCaseDocumentSubRevision), sourceUseCaseDocumentSubRevision, (this.useCaseDocumentSubRevision!= null)));
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
        return new UseCaseSupportType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseSupportType that = ((UseCaseSupportType) object);
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
            Boolean leftUseCaseAvailable;
            leftUseCaseAvailable = this.getUseCaseAvailable();
            Boolean rightUseCaseAvailable;
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
            List<Long> leftScenarioSupport;
            leftScenarioSupport = (((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty()))?this.getScenarioSupport():null);
            List<Long> rightScenarioSupport;
            rightScenarioSupport = (((that.scenarioSupport!= null)&&(!that.scenarioSupport.isEmpty()))?that.getScenarioSupport():null);
            if ((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty())) {
                if ((that.scenarioSupport!= null)&&(!that.scenarioSupport.isEmpty())) {
                    if (!leftScenarioSupport.equals(rightScenarioSupport)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.scenarioSupport!= null)&&(!that.scenarioSupport.isEmpty())) {
                    return false;
                }
            }
        }
        {
            String leftUseCaseDocumentSubRevision;
            leftUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
            String rightUseCaseDocumentSubRevision;
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
            Boolean theUseCaseAvailable;
            theUseCaseAvailable = this.getUseCaseAvailable();
            if (this.useCaseAvailable!= null) {
                currentHashCode += theUseCaseAvailable.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theScenarioSupport;
            theScenarioSupport = (((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty()))?this.getScenarioSupport():null);
            if ((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty())) {
                currentHashCode += theScenarioSupport.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            String theUseCaseDocumentSubRevision;
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
            Boolean theUseCaseAvailable;
            theUseCaseAvailable = this.getUseCaseAvailable();
            strategy.appendField(locator, this, "useCaseAvailable", buffer, theUseCaseAvailable, (this.useCaseAvailable!= null));
        }
        {
            List<Long> theScenarioSupport;
            theScenarioSupport = (((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty()))?this.getScenarioSupport():null);
            strategy.appendField(locator, this, "scenarioSupport", buffer, theScenarioSupport, ((this.scenarioSupport!= null)&&(!this.scenarioSupport.isEmpty())));
        }
        {
            String theUseCaseDocumentSubRevision;
            theUseCaseDocumentSubRevision = this.getUseCaseDocumentSubRevision();
            strategy.appendField(locator, this, "useCaseDocumentSubRevision", buffer, theUseCaseDocumentSubRevision, (this.useCaseDocumentSubRevision!= null));
        }
        return buffer;
    }

}
