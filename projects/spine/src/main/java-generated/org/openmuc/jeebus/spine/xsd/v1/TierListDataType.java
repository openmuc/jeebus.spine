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
 * <p>Java class for TierListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tierData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierListDataType", propOrder = {
    "tierData"
})
public class TierListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TierDataType> tierData;

    /**
     * Default no-arg constructor
     * 
     */
    public TierListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierListDataType(final List<TierDataType> tierData) {
        this.tierData = tierData;
    }

    /**
     * Gets the value of the tierData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tierData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierDataType }
     * 
     * 
     */
    public List<TierDataType> getTierData() {
        if (tierData == null) {
            tierData = new ArrayList<TierDataType>();
        }
        return this.tierData;
    }

    /**
     * Adds objects to the list of TierData using add method
     * 
     * @param values
     *     objects to add to the list TierData
     * @return
     *     The class instance
     */
    public TierListDataType withTierData(TierDataType... values) {
        if (values!= null) {
            for (TierDataType value: values) {
                getTierData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TierData using addAll method
     * 
     * @param values
     *     objects to add to the list TierData
     * @return
     *     The class instance
     */
    public TierListDataType withTierData(Collection<TierDataType> values) {
        if (values!= null) {
            getTierData().addAll(values);
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
        if (draftCopy instanceof TierListDataType) {
            final TierListDataType copy = ((TierListDataType) draftCopy);
            {
                Boolean tierDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tierData!= null)&&(!this.tierData.isEmpty())));
                if (tierDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TierDataType> sourceTierData;
                    sourceTierData = (((this.tierData!= null)&&(!this.tierData.isEmpty()))?this.getTierData():null);
                    @SuppressWarnings("unchecked")
                    List<TierDataType> copyTierData = ((List<TierDataType> ) strategy.copy(LocatorUtils.property(locator, "tierData", sourceTierData), sourceTierData, ((this.tierData!= null)&&(!this.tierData.isEmpty()))));
                    copy.tierData = null;
                    if (copyTierData!= null) {
                        List<TierDataType> uniqueTierDatal = copy.getTierData();
                        uniqueTierDatal.addAll(copyTierData);
                    }
                } else {
                    if (tierDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierListDataType that = ((TierListDataType) object);
        {
            List<TierDataType> leftTierData;
            leftTierData = (((this.tierData!= null)&&(!this.tierData.isEmpty()))?this.getTierData():null);
            List<TierDataType> rightTierData;
            rightTierData = (((that.tierData!= null)&&(!that.tierData.isEmpty()))?that.getTierData():null);
            if ((this.tierData!= null)&&(!this.tierData.isEmpty())) {
                if ((that.tierData!= null)&&(!that.tierData.isEmpty())) {
                    if (!leftTierData.equals(rightTierData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tierData!= null)&&(!that.tierData.isEmpty())) {
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
            List<TierDataType> theTierData;
            theTierData = (((this.tierData!= null)&&(!this.tierData.isEmpty()))?this.getTierData():null);
            if ((this.tierData!= null)&&(!this.tierData.isEmpty())) {
                currentHashCode += theTierData.hashCode();
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
            List<TierDataType> theTierData;
            theTierData = (((this.tierData!= null)&&(!this.tierData.isEmpty()))?this.getTierData():null);
            strategy.appendField(locator, this, "tierData", buffer, theTierData, ((this.tierData!= null)&&(!this.tierData.isEmpty())));
        }
        return buffer;
    }

}
