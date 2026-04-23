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
 * <p>Java class for IncentiveTableDescriptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDescriptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveTableDescription" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableDescriptionDataType", propOrder = {
    "incentiveTableDescription"
})
public class IncentiveTableDescriptionDataType implements Cloneable, CopyTo, ToString
{

    protected List<IncentiveTableDescriptionType> incentiveTableDescription;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDescriptionDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDescriptionDataType(final List<IncentiveTableDescriptionType> incentiveTableDescription) {
        this.incentiveTableDescription = incentiveTableDescription;
    }

    /**
     * Gets the value of the incentiveTableDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveTableDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveTableDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableDescriptionType }
     * 
     * 
     */
    public List<IncentiveTableDescriptionType> getIncentiveTableDescription() {
        if (incentiveTableDescription == null) {
            incentiveTableDescription = new ArrayList<IncentiveTableDescriptionType>();
        }
        return this.incentiveTableDescription;
    }

    /**
     * Adds objects to the list of IncentiveTableDescription using add method
     * 
     * @param values
     *     objects to add to the list IncentiveTableDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionDataType withIncentiveTableDescription(IncentiveTableDescriptionType... values) {
        if (values!= null) {
            for (IncentiveTableDescriptionType value: values) {
                getIncentiveTableDescription().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveTableDescription using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveTableDescription
     * @return
     *     The class instance
     */
    public IncentiveTableDescriptionDataType withIncentiveTableDescription(Collection<IncentiveTableDescriptionType> values) {
        if (values!= null) {
            getIncentiveTableDescription().addAll(values);
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
        if (draftCopy instanceof IncentiveTableDescriptionDataType) {
            final IncentiveTableDescriptionDataType copy = ((IncentiveTableDescriptionDataType) draftCopy);
            {
                Boolean incentiveTableDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty())));
                if (incentiveTableDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableDescriptionType> sourceIncentiveTableDescription;
                    sourceIncentiveTableDescription = (((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty()))?this.getIncentiveTableDescription():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableDescriptionType> copyIncentiveTableDescription = ((List<IncentiveTableDescriptionType> ) strategy.copy(LocatorUtils.property(locator, "incentiveTableDescription", sourceIncentiveTableDescription), sourceIncentiveTableDescription, ((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty()))));
                    copy.incentiveTableDescription = null;
                    if (copyIncentiveTableDescription!= null) {
                        List<IncentiveTableDescriptionType> uniqueIncentiveTableDescriptionl = copy.getIncentiveTableDescription();
                        uniqueIncentiveTableDescriptionl.addAll(copyIncentiveTableDescription);
                    }
                } else {
                    if (incentiveTableDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTableDescription = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableDescriptionDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDescriptionDataType that = ((IncentiveTableDescriptionDataType) object);
        {
            List<IncentiveTableDescriptionType> leftIncentiveTableDescription;
            leftIncentiveTableDescription = (((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty()))?this.getIncentiveTableDescription():null);
            List<IncentiveTableDescriptionType> rightIncentiveTableDescription;
            rightIncentiveTableDescription = (((that.incentiveTableDescription!= null)&&(!that.incentiveTableDescription.isEmpty()))?that.getIncentiveTableDescription():null);
            if ((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty())) {
                if ((that.incentiveTableDescription!= null)&&(!that.incentiveTableDescription.isEmpty())) {
                    if (!leftIncentiveTableDescription.equals(rightIncentiveTableDescription)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveTableDescription!= null)&&(!that.incentiveTableDescription.isEmpty())) {
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
            List<IncentiveTableDescriptionType> theIncentiveTableDescription;
            theIncentiveTableDescription = (((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty()))?this.getIncentiveTableDescription():null);
            if ((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty())) {
                currentHashCode += theIncentiveTableDescription.hashCode();
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
            List<IncentiveTableDescriptionType> theIncentiveTableDescription;
            theIncentiveTableDescription = (((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty()))?this.getIncentiveTableDescription():null);
            strategy.appendField(locator, this, "incentiveTableDescription", buffer, theIncentiveTableDescription, ((this.incentiveTableDescription!= null)&&(!this.incentiveTableDescription.isEmpty())));
        }
        return buffer;
    }

}
