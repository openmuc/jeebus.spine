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
 * <p>Java class for TierIncentiveRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierIncentiveRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tierIncentiveRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierIncentiveRelationListDataType", propOrder = {
    "tierIncentiveRelationData"
})
public class TierIncentiveRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TierIncentiveRelationDataType> tierIncentiveRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public TierIncentiveRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierIncentiveRelationListDataType(final List<TierIncentiveRelationDataType> tierIncentiveRelationData) {
        this.tierIncentiveRelationData = tierIncentiveRelationData;
    }

    /**
     * Gets the value of the tierIncentiveRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tierIncentiveRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierIncentiveRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierIncentiveRelationDataType }
     * 
     * 
     */
    public List<TierIncentiveRelationDataType> getTierIncentiveRelationData() {
        if (tierIncentiveRelationData == null) {
            tierIncentiveRelationData = new ArrayList<TierIncentiveRelationDataType>();
        }
        return this.tierIncentiveRelationData;
    }

    /**
     * Adds objects to the list of TierIncentiveRelationData using add method
     * 
     * @param values
     *     objects to add to the list TierIncentiveRelationData
     * @return
     *     The class instance
     */
    public TierIncentiveRelationListDataType withTierIncentiveRelationData(TierIncentiveRelationDataType... values) {
        if (values!= null) {
            for (TierIncentiveRelationDataType value: values) {
                getTierIncentiveRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TierIncentiveRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list TierIncentiveRelationData
     * @return
     *     The class instance
     */
    public TierIncentiveRelationListDataType withTierIncentiveRelationData(Collection<TierIncentiveRelationDataType> values) {
        if (values!= null) {
            getTierIncentiveRelationData().addAll(values);
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
        if (draftCopy instanceof TierIncentiveRelationListDataType) {
            final TierIncentiveRelationListDataType copy = ((TierIncentiveRelationListDataType) draftCopy);
            {
                Boolean tierIncentiveRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty())));
                if (tierIncentiveRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TierIncentiveRelationDataType> sourceTierIncentiveRelationData;
                    sourceTierIncentiveRelationData = (((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty()))?this.getTierIncentiveRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<TierIncentiveRelationDataType> copyTierIncentiveRelationData = ((List<TierIncentiveRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "tierIncentiveRelationData", sourceTierIncentiveRelationData), sourceTierIncentiveRelationData, ((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty()))));
                    copy.tierIncentiveRelationData = null;
                    if (copyTierIncentiveRelationData!= null) {
                        List<TierIncentiveRelationDataType> uniqueTierIncentiveRelationDatal = copy.getTierIncentiveRelationData();
                        uniqueTierIncentiveRelationDatal.addAll(copyTierIncentiveRelationData);
                    }
                } else {
                    if (tierIncentiveRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierIncentiveRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierIncentiveRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierIncentiveRelationListDataType that = ((TierIncentiveRelationListDataType) object);
        {
            List<TierIncentiveRelationDataType> leftTierIncentiveRelationData;
            leftTierIncentiveRelationData = (((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty()))?this.getTierIncentiveRelationData():null);
            List<TierIncentiveRelationDataType> rightTierIncentiveRelationData;
            rightTierIncentiveRelationData = (((that.tierIncentiveRelationData!= null)&&(!that.tierIncentiveRelationData.isEmpty()))?that.getTierIncentiveRelationData():null);
            if ((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty())) {
                if ((that.tierIncentiveRelationData!= null)&&(!that.tierIncentiveRelationData.isEmpty())) {
                    if (!leftTierIncentiveRelationData.equals(rightTierIncentiveRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tierIncentiveRelationData!= null)&&(!that.tierIncentiveRelationData.isEmpty())) {
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
            List<TierIncentiveRelationDataType> theTierIncentiveRelationData;
            theTierIncentiveRelationData = (((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty()))?this.getTierIncentiveRelationData():null);
            if ((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty())) {
                currentHashCode += theTierIncentiveRelationData.hashCode();
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
            List<TierIncentiveRelationDataType> theTierIncentiveRelationData;
            theTierIncentiveRelationData = (((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty()))?this.getTierIncentiveRelationData():null);
            strategy.appendField(locator, this, "tierIncentiveRelationData", buffer, theTierIncentiveRelationData, ((this.tierIncentiveRelationData!= null)&&(!this.tierIncentiveRelationData.isEmpty())));
        }
        return buffer;
    }

}
