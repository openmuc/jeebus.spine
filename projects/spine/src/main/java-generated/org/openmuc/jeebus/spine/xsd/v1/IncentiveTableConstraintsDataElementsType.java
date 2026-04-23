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
 * <p>Java class for IncentiveTableConstraintsDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableConstraintsDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveTableConstraints" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableConstraintsElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableConstraintsDataElementsType", propOrder = {
    "incentiveTableConstraints"
})
public class IncentiveTableConstraintsDataElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableConstraintsElementsType incentiveTableConstraints;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableConstraintsDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableConstraintsDataElementsType(final IncentiveTableConstraintsElementsType incentiveTableConstraints) {
        this.incentiveTableConstraints = incentiveTableConstraints;
    }

    /**
     * Gets the value of the incentiveTableConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableConstraintsElementsType }
     *     
     */
    public IncentiveTableConstraintsElementsType getIncentiveTableConstraints() {
        return incentiveTableConstraints;
    }

    /**
     * Sets the value of the incentiveTableConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType }
     *     
     */
    public void setIncentiveTableConstraints(IncentiveTableConstraintsElementsType value) {
        this.incentiveTableConstraints = value;
    }

    /**
     * Sets the value of the incentiveTableConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableConstraintsElementsType }
     * @return
     *     The class instance
     */
    public IncentiveTableConstraintsDataElementsType withIncentiveTableConstraints(IncentiveTableConstraintsElementsType value) {
        setIncentiveTableConstraints(value);
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
        if (draftCopy instanceof IncentiveTableConstraintsDataElementsType) {
            final IncentiveTableConstraintsDataElementsType copy = ((IncentiveTableConstraintsDataElementsType) draftCopy);
            {
                Boolean incentiveTableConstraintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveTableConstraints!= null));
                if (incentiveTableConstraintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableConstraintsElementsType sourceIncentiveTableConstraints;
                    sourceIncentiveTableConstraints = this.getIncentiveTableConstraints();
                    IncentiveTableConstraintsElementsType copyIncentiveTableConstraints = ((IncentiveTableConstraintsElementsType) strategy.copy(LocatorUtils.property(locator, "incentiveTableConstraints", sourceIncentiveTableConstraints), sourceIncentiveTableConstraints, (this.incentiveTableConstraints!= null)));
                    copy.setIncentiveTableConstraints(copyIncentiveTableConstraints);
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
        return new IncentiveTableConstraintsDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableConstraintsDataElementsType that = ((IncentiveTableConstraintsDataElementsType) object);
        {
            IncentiveTableConstraintsElementsType leftIncentiveTableConstraints;
            leftIncentiveTableConstraints = this.getIncentiveTableConstraints();
            IncentiveTableConstraintsElementsType rightIncentiveTableConstraints;
            rightIncentiveTableConstraints = that.getIncentiveTableConstraints();
            if (this.incentiveTableConstraints!= null) {
                if (that.incentiveTableConstraints!= null) {
                    if (!leftIncentiveTableConstraints.equals(rightIncentiveTableConstraints)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveTableConstraints!= null) {
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
            IncentiveTableConstraintsElementsType theIncentiveTableConstraints;
            theIncentiveTableConstraints = this.getIncentiveTableConstraints();
            if (this.incentiveTableConstraints!= null) {
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
            IncentiveTableConstraintsElementsType theIncentiveTableConstraints;
            theIncentiveTableConstraints = this.getIncentiveTableConstraints();
            strategy.appendField(locator, this, "incentiveTableConstraints", buffer, theIncentiveTableConstraints, (this.incentiveTableConstraints!= null));
        }
        return buffer;
    }

}
