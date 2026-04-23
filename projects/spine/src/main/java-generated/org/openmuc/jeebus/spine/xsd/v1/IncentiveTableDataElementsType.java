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
 * <p>Java class for IncentiveTableDataElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDataElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveTable" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableElementsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableDataElementsType", propOrder = {
    "incentiveTable"
})
public class IncentiveTableDataElementsType implements Cloneable, CopyTo, ToString
{

    protected IncentiveTableElementsType incentiveTable;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDataElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDataElementsType(final IncentiveTableElementsType incentiveTable) {
        this.incentiveTable = incentiveTable;
    }

    /**
     * Gets the value of the incentiveTable property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveTableElementsType }
     *     
     */
    public IncentiveTableElementsType getIncentiveTable() {
        return incentiveTable;
    }

    /**
     * Sets the value of the incentiveTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableElementsType }
     *     
     */
    public void setIncentiveTable(IncentiveTableElementsType value) {
        this.incentiveTable = value;
    }

    /**
     * Sets the value of the incentiveTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveTableElementsType }
     * @return
     *     The class instance
     */
    public IncentiveTableDataElementsType withIncentiveTable(IncentiveTableElementsType value) {
        setIncentiveTable(value);
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
        if (draftCopy instanceof IncentiveTableDataElementsType) {
            final IncentiveTableDataElementsType copy = ((IncentiveTableDataElementsType) draftCopy);
            {
                Boolean incentiveTableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.incentiveTable!= null));
                if (incentiveTableShouldBeCopiedAndSet == Boolean.TRUE) {
                    IncentiveTableElementsType sourceIncentiveTable;
                    sourceIncentiveTable = this.getIncentiveTable();
                    IncentiveTableElementsType copyIncentiveTable = ((IncentiveTableElementsType) strategy.copy(LocatorUtils.property(locator, "incentiveTable", sourceIncentiveTable), sourceIncentiveTable, (this.incentiveTable!= null)));
                    copy.setIncentiveTable(copyIncentiveTable);
                } else {
                    if (incentiveTableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.incentiveTable = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IncentiveTableDataElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDataElementsType that = ((IncentiveTableDataElementsType) object);
        {
            IncentiveTableElementsType leftIncentiveTable;
            leftIncentiveTable = this.getIncentiveTable();
            IncentiveTableElementsType rightIncentiveTable;
            rightIncentiveTable = that.getIncentiveTable();
            if (this.incentiveTable!= null) {
                if (that.incentiveTable!= null) {
                    if (!leftIncentiveTable.equals(rightIncentiveTable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.incentiveTable!= null) {
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
            IncentiveTableElementsType theIncentiveTable;
            theIncentiveTable = this.getIncentiveTable();
            if (this.incentiveTable!= null) {
                currentHashCode += theIncentiveTable.hashCode();
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
            IncentiveTableElementsType theIncentiveTable;
            theIncentiveTable = this.getIncentiveTable();
            strategy.appendField(locator, this, "incentiveTable", buffer, theIncentiveTable, (this.incentiveTable!= null));
        }
        return buffer;
    }

}
