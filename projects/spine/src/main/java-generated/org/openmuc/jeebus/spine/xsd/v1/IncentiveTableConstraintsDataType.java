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
 * <p>Java class for IncentiveTableConstraintsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableConstraintsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveTableConstraints" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableConstraintsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableConstraintsDataType", propOrder = {
    "incentiveTableConstraints"
})
public class IncentiveTableConstraintsDataType implements Cloneable, CopyTo, ToString
{

    protected List<IncentiveTableConstraintsType> incentiveTableConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableConstraintsDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableConstraintsDataType(final List<IncentiveTableConstraintsType> incentiveTableConstraints) {
        this.incentiveTableConstraints = incentiveTableConstraints;
    }

    /**
     * Gets the value of the incentiveTableConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveTableConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveTableConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableConstraintsType }
     * 
     * 
     */
    public List<IncentiveTableConstraintsType> getIncentiveTableConstraints() {
        if (incentiveTableConstraints == null) {
            incentiveTableConstraints = new ArrayList<IncentiveTableConstraintsType>();
        }
        return this.incentiveTableConstraints;
    }

    /**
     * Adds objects to the list of IncentiveTableConstraints using add method
     * 
     * @param values
     *     objects to add to the list IncentiveTableConstraints
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsDataType withIncentiveTableConstraints(IncentiveTableConstraintsType... values) {
        if (values!= null) {
            for (IncentiveTableConstraintsType value: values) {
                getIncentiveTableConstraints().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveTableConstraints using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveTableConstraints
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsDataType withIncentiveTableConstraints(Collection<IncentiveTableConstraintsType> values) {
        if (values!= null) {
            getIncentiveTableConstraints().addAll(values);
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
        if (draftCopy instanceof IncentiveTableConstraintsDataType) {
            final IncentiveTableConstraintsDataType copy = ((IncentiveTableConstraintsDataType) draftCopy);
            {
                Boolean incentiveTableConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty())));
                if (incentiveTableConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableConstraintsType> sourceIncentiveTableConstraints;
                    sourceIncentiveTableConstraints = (((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty()))?this.getIncentiveTableConstraints():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableConstraintsType> copyIncentiveTableConstraints = ((List<IncentiveTableConstraintsType> ) strategy.copy(LocatorUtils.property(locator, "incentiveTableConstraints", sourceIncentiveTableConstraints), sourceIncentiveTableConstraints, ((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty()))));
                    copy.incentiveTableConstraints = null;
                    if (copyIncentiveTableConstraints!= null) {
                        List<IncentiveTableConstraintsType> uniqueIncentiveTableConstraintsl = copy.getIncentiveTableConstraints();
                        uniqueIncentiveTableConstraintsl.addAll(copyIncentiveTableConstraints);
                    }
                } else {
                    if (incentiveTableConstraintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTableConstraints = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableConstraintsDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableConstraintsDataType that = ((IncentiveTableConstraintsDataType) object);
        {
            List<IncentiveTableConstraintsType> leftIncentiveTableConstraints;
            leftIncentiveTableConstraints = (((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty()))?this.getIncentiveTableConstraints():null);
            List<IncentiveTableConstraintsType> rightIncentiveTableConstraints;
            rightIncentiveTableConstraints = (((that.incentiveTableConstraints!= null)&&(!that.incentiveTableConstraints.isEmpty()))?that.getIncentiveTableConstraints():null);
            if ((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty())) {
                if ((that.incentiveTableConstraints!= null)&&(!that.incentiveTableConstraints.isEmpty())) {
                    if (!leftIncentiveTableConstraints.equals(rightIncentiveTableConstraints)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveTableConstraints!= null)&&(!that.incentiveTableConstraints.isEmpty())) {
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
            List<IncentiveTableConstraintsType> theIncentiveTableConstraints;
            theIncentiveTableConstraints = (((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty()))?this.getIncentiveTableConstraints():null);
            if ((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty())) {
                currentHashCode += theIncentiveTableConstraints.hashCode();
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
            List<IncentiveTableConstraintsType> theIncentiveTableConstraints;
            theIncentiveTableConstraints = (((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty()))?this.getIncentiveTableConstraints():null);
            strategy.appendField(locator, this, "incentiveTableConstraints", buffer, theIncentiveTableConstraints, ((this.incentiveTableConstraints!= null)&&(!this.incentiveTableConstraints.isEmpty())));
        }
        return buffer;
    }

}
