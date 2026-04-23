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
 * <p>Java class for IncentiveTableDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveTableDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incentiveTable" type="{http://docs.eebus.org/spine/xsd/v1}IncentiveTableType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveTableDataType", propOrder = {
    "incentiveTable"
})
public class IncentiveTableDataType implements Cloneable, CopyTo, ToString
{

    protected List<IncentiveTableType> incentiveTable;

    /**
     * Default no-arg constructor
     * 
     */
    public IncentiveTableDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IncentiveTableDataType(final List<IncentiveTableType> incentiveTable) {
        this.incentiveTable = incentiveTable;
    }

    /**
     * Gets the value of the incentiveTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the incentiveTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentiveTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveTableType }
     * 
     * 
     */
    public List<IncentiveTableType> getIncentiveTable() {
        if (incentiveTable == null) {
            incentiveTable = new ArrayList<IncentiveTableType>();
        }
        return this.incentiveTable;
    }

    /**
     * Adds objects to the list of IncentiveTable using add method
     * 
     * @param values
     *     objects to add to the list IncentiveTable
     * @return
     *     The class instance
     */
    public IncentiveTableDataType withIncentiveTable(IncentiveTableType... values) {
        if (values!= null) {
            for (IncentiveTableType value: values) {
                getIncentiveTable().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IncentiveTable using addAll method
     * 
     * @param values
     *     objects to add to the list IncentiveTable
     * @return
     *     The class instance
     */
    public IncentiveTableDataType withIncentiveTable(Collection<IncentiveTableType> values) {
        if (values!= null) {
            getIncentiveTable().addAll(values);
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
        if (draftCopy instanceof IncentiveTableDataType) {
            final IncentiveTableDataType copy = ((IncentiveTableDataType) draftCopy);
            {
                Boolean incentiveTableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty())));
                if (incentiveTableShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IncentiveTableType> sourceIncentiveTable;
                    sourceIncentiveTable = (((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty()))?this.getIncentiveTable():null);
                    @SuppressWarnings("unchecked")
                    List<IncentiveTableType> copyIncentiveTable = ((List<IncentiveTableType> ) strategy.copy(LocatorUtils.property(locator, "incentiveTable", sourceIncentiveTable), sourceIncentiveTable, ((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty()))));
                    copy.incentiveTable = null;
                    if (copyIncentiveTable!= null) {
                        List<IncentiveTableType> uniqueIncentiveTablel = copy.getIncentiveTable();
                        uniqueIncentiveTablel.addAll(copyIncentiveTable);
                    }
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
        return new IncentiveTableDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IncentiveTableDataType that = ((IncentiveTableDataType) object);
        {
            List<IncentiveTableType> leftIncentiveTable;
            leftIncentiveTable = (((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty()))?this.getIncentiveTable():null);
            List<IncentiveTableType> rightIncentiveTable;
            rightIncentiveTable = (((that.incentiveTable!= null)&&(!that.incentiveTable.isEmpty()))?that.getIncentiveTable():null);
            if ((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty())) {
                if ((that.incentiveTable!= null)&&(!that.incentiveTable.isEmpty())) {
                    if (!leftIncentiveTable.equals(rightIncentiveTable)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.incentiveTable!= null)&&(!that.incentiveTable.isEmpty())) {
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
            List<IncentiveTableType> theIncentiveTable;
            theIncentiveTable = (((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty()))?this.getIncentiveTable():null);
            if ((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty())) {
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
            List<IncentiveTableType> theIncentiveTable;
            theIncentiveTable = (((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty()))?this.getIncentiveTable():null);
            strategy.appendField(locator, this, "incentiveTable", buffer, theIncentiveTable, ((this.incentiveTable!= null)&&(!this.incentiveTable.isEmpty())));
        }
        return buffer;
    }

}
