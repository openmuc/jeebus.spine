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

import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for RecurrenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurringInterval" type="{http://docs.eebus.org/spine/xsd/v1}RecurringIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="recurringIntervalStep" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="firstExecution" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="executionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="lastExecution" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceInformationType", propOrder = {
    "recurringInterval",
    "recurringIntervalStep",
    "firstExecution",
    "executionCount",
    "lastExecution"
})
public class RecurrenceInformationType implements Cloneable, CopyTo, ToString
{

    protected String recurringInterval;
    @XmlSchemaType(name = "unsignedInt")
    protected Long recurringIntervalStep;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstExecution;
    @XmlSchemaType(name = "unsignedInt")
    protected Long executionCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastExecution;

    /**
     * Default no-arg constructor
     * 
     */
    public RecurrenceInformationType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RecurrenceInformationType(final String recurringInterval, final Long recurringIntervalStep, final XMLGregorianCalendar firstExecution, final Long executionCount, final XMLGregorianCalendar lastExecution) {
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
     *     {@link String }
     *     
     */
    public String getRecurringInterval() {
        return recurringInterval;
    }

    /**
     * Sets the value of the recurringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringInterval(String value) {
        this.recurringInterval = value;
    }

    /**
     * Gets the value of the recurringIntervalStep property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurringIntervalStep() {
        return recurringIntervalStep;
    }

    /**
     * Sets the value of the recurringIntervalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurringIntervalStep(Long value) {
        this.recurringIntervalStep = value;
    }

    /**
     * Gets the value of the firstExecution property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstExecution() {
        return firstExecution;
    }

    /**
     * Sets the value of the firstExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstExecution(XMLGregorianCalendar value) {
        this.firstExecution = value;
    }

    /**
     * Gets the value of the executionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecutionCount() {
        return executionCount;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecutionCount(Long value) {
        this.executionCount = value;
    }

    /**
     * Gets the value of the lastExecution property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExecution() {
        return lastExecution;
    }

    /**
     * Sets the value of the lastExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExecution(XMLGregorianCalendar value) {
        this.lastExecution = value;
    }

    /**
     * Sets the value of the recurringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    public RecurrenceInformationType withRecurringInterval(String value) {
        setRecurringInterval(value);
        return this;
    }

    /**
     * Sets the value of the recurringIntervalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public RecurrenceInformationType withRecurringIntervalStep(Long value) {
        setRecurringIntervalStep(value);
        return this;
    }

    /**
     * Sets the value of the firstExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public RecurrenceInformationType withFirstExecution(XMLGregorianCalendar value) {
        setFirstExecution(value);
        return this;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public RecurrenceInformationType withExecutionCount(Long value) {
        setExecutionCount(value);
        return this;
    }

    /**
     * Sets the value of the lastExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @return
     *     The class instance
     */
    public RecurrenceInformationType withLastExecution(XMLGregorianCalendar value) {
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
        if (draftCopy instanceof RecurrenceInformationType) {
            final RecurrenceInformationType copy = ((RecurrenceInformationType) draftCopy);
            {
                Boolean recurringIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurringInterval!= null));
                if (recurringIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRecurringInterval;
                    sourceRecurringInterval = this.getRecurringInterval();
                    String copyRecurringInterval = ((String) strategy.copy(LocatorUtils.property(locator, "recurringInterval", sourceRecurringInterval), sourceRecurringInterval, (this.recurringInterval!= null)));
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
                    Long sourceRecurringIntervalStep;
                    sourceRecurringIntervalStep = this.getRecurringIntervalStep();
                    Long copyRecurringIntervalStep = ((Long) strategy.copy(LocatorUtils.property(locator, "recurringIntervalStep", sourceRecurringIntervalStep), sourceRecurringIntervalStep, (this.recurringIntervalStep!= null)));
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
                    XMLGregorianCalendar sourceFirstExecution;
                    sourceFirstExecution = this.getFirstExecution();
                    XMLGregorianCalendar copyFirstExecution = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "firstExecution", sourceFirstExecution), sourceFirstExecution, (this.firstExecution!= null)));
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
                    Long sourceExecutionCount;
                    sourceExecutionCount = this.getExecutionCount();
                    Long copyExecutionCount = ((Long) strategy.copy(LocatorUtils.property(locator, "executionCount", sourceExecutionCount), sourceExecutionCount, (this.executionCount!= null)));
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
                    XMLGregorianCalendar sourceLastExecution;
                    sourceLastExecution = this.getLastExecution();
                    XMLGregorianCalendar copyLastExecution = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "lastExecution", sourceLastExecution), sourceLastExecution, (this.lastExecution!= null)));
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
        return new RecurrenceInformationType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecurrenceInformationType that = ((RecurrenceInformationType) object);
        {
            String leftRecurringInterval;
            leftRecurringInterval = this.getRecurringInterval();
            String rightRecurringInterval;
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
            Long leftRecurringIntervalStep;
            leftRecurringIntervalStep = this.getRecurringIntervalStep();
            Long rightRecurringIntervalStep;
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
            XMLGregorianCalendar leftFirstExecution;
            leftFirstExecution = this.getFirstExecution();
            XMLGregorianCalendar rightFirstExecution;
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
            Long leftExecutionCount;
            leftExecutionCount = this.getExecutionCount();
            Long rightExecutionCount;
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
            XMLGregorianCalendar leftLastExecution;
            leftLastExecution = this.getLastExecution();
            XMLGregorianCalendar rightLastExecution;
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
            String theRecurringInterval;
            theRecurringInterval = this.getRecurringInterval();
            if (this.recurringInterval!= null) {
                currentHashCode += theRecurringInterval.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theRecurringIntervalStep;
            theRecurringIntervalStep = this.getRecurringIntervalStep();
            if (this.recurringIntervalStep!= null) {
                currentHashCode += theRecurringIntervalStep.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theFirstExecution;
            theFirstExecution = this.getFirstExecution();
            if (this.firstExecution!= null) {
                currentHashCode += theFirstExecution.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            if (this.executionCount!= null) {
                currentHashCode += theExecutionCount.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            XMLGregorianCalendar theLastExecution;
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
            String theRecurringInterval;
            theRecurringInterval = this.getRecurringInterval();
            strategy.appendField(locator, this, "recurringInterval", buffer, theRecurringInterval, (this.recurringInterval!= null));
        }
        {
            Long theRecurringIntervalStep;
            theRecurringIntervalStep = this.getRecurringIntervalStep();
            strategy.appendField(locator, this, "recurringIntervalStep", buffer, theRecurringIntervalStep, (this.recurringIntervalStep!= null));
        }
        {
            XMLGregorianCalendar theFirstExecution;
            theFirstExecution = this.getFirstExecution();
            strategy.appendField(locator, this, "firstExecution", buffer, theFirstExecution, (this.firstExecution!= null));
        }
        {
            Long theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            strategy.appendField(locator, this, "executionCount", buffer, theExecutionCount, (this.executionCount!= null));
        }
        {
            XMLGregorianCalendar theLastExecution;
            theLastExecution = this.getLastExecution();
            strategy.appendField(locator, this, "lastExecution", buffer, theLastExecution, (this.lastExecution!= null));
        }
        return buffer;
    }

}
