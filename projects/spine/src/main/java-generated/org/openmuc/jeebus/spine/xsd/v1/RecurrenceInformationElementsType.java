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
 * <p>Java class for RecurrenceInformationElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceInformationElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringInterval" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="recurringIntervalStep" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="firstExecution" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="executionCount" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *         &lt;element name="lastExecution" type="{http://docs.eebus.org/spine/xsd/v1}ElementTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceInformationElementsType", propOrder = {
    "recurringInterval",
    "recurringIntervalStep",
    "firstExecution",
    "executionCount",
    "lastExecution"
})
public class RecurrenceInformationElementsType implements Cloneable, CopyTo, ToString
{

    protected ElementTagType recurringInterval;
    protected ElementTagType recurringIntervalStep;
    protected ElementTagType firstExecution;
    protected ElementTagType executionCount;
    protected ElementTagType lastExecution;

    /**
     * Default no-arg constructor
     * 
     */
    public RecurrenceInformationElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RecurrenceInformationElementsType(final ElementTagType recurringInterval, final ElementTagType recurringIntervalStep, final ElementTagType firstExecution, final ElementTagType executionCount, final ElementTagType lastExecution) {
        this.recurringInterval = recurringInterval;
        this.recurringIntervalStep = recurringIntervalStep;
        this.firstExecution = firstExecution;
        this.executionCount = executionCount;
        this.lastExecution = lastExecution;
    }

    /**
     * Gets the value of the recurringInterval property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRecurringInterval() {
        return recurringInterval;
    }

    /**
     * Sets the value of the recurringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRecurringInterval(ElementTagType value) {
        this.recurringInterval = value;
    }

    /**
     * Gets the value of the recurringIntervalStep property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getRecurringIntervalStep() {
        return recurringIntervalStep;
    }

    /**
     * Sets the value of the recurringIntervalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setRecurringIntervalStep(ElementTagType value) {
        this.recurringIntervalStep = value;
    }

    /**
     * Gets the value of the firstExecution property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getFirstExecution() {
        return firstExecution;
    }

    /**
     * Sets the value of the firstExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setFirstExecution(ElementTagType value) {
        this.firstExecution = value;
    }

    /**
     * Gets the value of the executionCount property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getExecutionCount() {
        return executionCount;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setExecutionCount(ElementTagType value) {
        this.executionCount = value;
    }

    /**
     * Gets the value of the lastExecution property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTagType }
     *     
     */
    public ElementTagType getLastExecution() {
        return lastExecution;
    }

    /**
     * Sets the value of the lastExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     *     
     */
    public void setLastExecution(ElementTagType value) {
        this.lastExecution = value;
    }

    /**
     * Sets the value of the recurringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public RecurrenceInformationElementsType withRecurringInterval(ElementTagType value) {
        setRecurringInterval(value);
        return this;
    }

    /**
     * Sets the value of the recurringIntervalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public RecurrenceInformationElementsType withRecurringIntervalStep(ElementTagType value) {
        setRecurringIntervalStep(value);
        return this;
    }

    /**
     * Sets the value of the firstExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public RecurrenceInformationElementsType withFirstExecution(ElementTagType value) {
        setFirstExecution(value);
        return this;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public RecurrenceInformationElementsType withExecutionCount(ElementTagType value) {
        setExecutionCount(value);
        return this;
    }

    /**
     * Sets the value of the lastExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTagType }
     * @return
     *     The class instance
     */
    public RecurrenceInformationElementsType withLastExecution(ElementTagType value) {
        setLastExecution(value);
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
        if (draftCopy instanceof RecurrenceInformationElementsType) {
            final RecurrenceInformationElementsType copy = ((RecurrenceInformationElementsType) draftCopy);
            {
                Boolean recurringIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurringInterval!= null));
                if (recurringIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRecurringInterval;
                    sourceRecurringInterval = this.getRecurringInterval();
                    ElementTagType copyRecurringInterval = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "recurringInterval", sourceRecurringInterval), sourceRecurringInterval, (this.recurringInterval!= null)));
                    copy.setRecurringInterval(copyRecurringInterval);
                } else {
                    if (recurringIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurringInterval = null;
                    }
                }
            }
            {
                Boolean recurringIntervalStepShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurringIntervalStep!= null));
                if (recurringIntervalStepShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceRecurringIntervalStep;
                    sourceRecurringIntervalStep = this.getRecurringIntervalStep();
                    ElementTagType copyRecurringIntervalStep = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "recurringIntervalStep", sourceRecurringIntervalStep), sourceRecurringIntervalStep, (this.recurringIntervalStep!= null)));
                    copy.setRecurringIntervalStep(copyRecurringIntervalStep);
                } else {
                    if (recurringIntervalStepShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurringIntervalStep = null;
                    }
                }
            }
            {
                Boolean firstExecutionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstExecution!= null));
                if (firstExecutionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceFirstExecution;
                    sourceFirstExecution = this.getFirstExecution();
                    ElementTagType copyFirstExecution = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "firstExecution", sourceFirstExecution), sourceFirstExecution, (this.firstExecution!= null)));
                    copy.setFirstExecution(copyFirstExecution);
                } else {
                    if (firstExecutionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firstExecution = null;
                    }
                }
            }
            {
                Boolean executionCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.executionCount!= null));
                if (executionCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceExecutionCount;
                    sourceExecutionCount = this.getExecutionCount();
                    ElementTagType copyExecutionCount = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "executionCount", sourceExecutionCount), sourceExecutionCount, (this.executionCount!= null)));
                    copy.setExecutionCount(copyExecutionCount);
                } else {
                    if (executionCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.executionCount = null;
                    }
                }
            }
            {
                Boolean lastExecutionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastExecution!= null));
                if (lastExecutionShouldBeCopiedAndSet == Boolean.TRUE) {
                    ElementTagType sourceLastExecution;
                    sourceLastExecution = this.getLastExecution();
                    ElementTagType copyLastExecution = ((ElementTagType) strategy.copy(LocatorUtils.property(locator, "lastExecution", sourceLastExecution), sourceLastExecution, (this.lastExecution!= null)));
                    copy.setLastExecution(copyLastExecution);
                } else {
                    if (lastExecutionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastExecution = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new RecurrenceInformationElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecurrenceInformationElementsType that = ((RecurrenceInformationElementsType) object);
        {
            ElementTagType leftRecurringInterval;
            leftRecurringInterval = this.getRecurringInterval();
            ElementTagType rightRecurringInterval;
            rightRecurringInterval = that.getRecurringInterval();
            if (this.recurringInterval!= null) {
                if (that.recurringInterval!= null) {
                    if (!leftRecurringInterval.equals(rightRecurringInterval)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.recurringInterval!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftRecurringIntervalStep;
            leftRecurringIntervalStep = this.getRecurringIntervalStep();
            ElementTagType rightRecurringIntervalStep;
            rightRecurringIntervalStep = that.getRecurringIntervalStep();
            if (this.recurringIntervalStep!= null) {
                if (that.recurringIntervalStep!= null) {
                    if (!leftRecurringIntervalStep.equals(rightRecurringIntervalStep)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.recurringIntervalStep!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftFirstExecution;
            leftFirstExecution = this.getFirstExecution();
            ElementTagType rightFirstExecution;
            rightFirstExecution = that.getFirstExecution();
            if (this.firstExecution!= null) {
                if (that.firstExecution!= null) {
                    if (!leftFirstExecution.equals(rightFirstExecution)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.firstExecution!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftExecutionCount;
            leftExecutionCount = this.getExecutionCount();
            ElementTagType rightExecutionCount;
            rightExecutionCount = that.getExecutionCount();
            if (this.executionCount!= null) {
                if (that.executionCount!= null) {
                    if (!leftExecutionCount.equals(rightExecutionCount)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.executionCount!= null) {
                    return false;
                }
            }
        }
        {
            ElementTagType leftLastExecution;
            leftLastExecution = this.getLastExecution();
            ElementTagType rightLastExecution;
            rightLastExecution = that.getLastExecution();
            if (this.lastExecution!= null) {
                if (that.lastExecution!= null) {
                    if (!leftLastExecution.equals(rightLastExecution)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.lastExecution!= null) {
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
            ElementTagType theRecurringInterval;
            theRecurringInterval = this.getRecurringInterval();
            if (this.recurringInterval!= null) {
                currentHashCode += theRecurringInterval.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theRecurringIntervalStep;
            theRecurringIntervalStep = this.getRecurringIntervalStep();
            if (this.recurringIntervalStep!= null) {
                currentHashCode += theRecurringIntervalStep.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theFirstExecution;
            theFirstExecution = this.getFirstExecution();
            if (this.firstExecution!= null) {
                currentHashCode += theFirstExecution.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            if (this.executionCount!= null) {
                currentHashCode += theExecutionCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            ElementTagType theLastExecution;
            theLastExecution = this.getLastExecution();
            if (this.lastExecution!= null) {
                currentHashCode += theLastExecution.hashCode();
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
            ElementTagType theRecurringInterval;
            theRecurringInterval = this.getRecurringInterval();
            strategy.appendField(locator, this, "recurringInterval", buffer, theRecurringInterval, (this.recurringInterval!= null));
        }
        {
            ElementTagType theRecurringIntervalStep;
            theRecurringIntervalStep = this.getRecurringIntervalStep();
            strategy.appendField(locator, this, "recurringIntervalStep", buffer, theRecurringIntervalStep, (this.recurringIntervalStep!= null));
        }
        {
            ElementTagType theFirstExecution;
            theFirstExecution = this.getFirstExecution();
            strategy.appendField(locator, this, "firstExecution", buffer, theFirstExecution, (this.firstExecution!= null));
        }
        {
            ElementTagType theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            strategy.appendField(locator, this, "executionCount", buffer, theExecutionCount, (this.executionCount!= null));
        }
        {
            ElementTagType theLastExecution;
            theLastExecution = this.getLastExecution();
            strategy.appendField(locator, this, "lastExecution", buffer, theLastExecution, (this.lastExecution!= null));
        }
        return buffer;
    }

}
