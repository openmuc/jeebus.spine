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
 * <p>Java class for TierBoundaryListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tierBoundaryData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryListDataType", propOrder = {
    "tierBoundaryData"
})
public class TierBoundaryListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TierBoundaryDataType> tierBoundaryData;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryListDataType(final List<TierBoundaryDataType> tierBoundaryData) {
        this.tierBoundaryData = tierBoundaryData;
    }

    /**
     * Gets the value of the tierBoundaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tierBoundaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierBoundaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierBoundaryDataType }
     * 
     * 
     */
    public List<TierBoundaryDataType> getTierBoundaryData() {
        if (tierBoundaryData == null) {
            tierBoundaryData = new ArrayList<TierBoundaryDataType>();
        }
        return this.tierBoundaryData;
    }

    /**
     * Adds objects to the list of TierBoundaryData using add method
     * 
     * @param values
     *     objects to add to the list TierBoundaryData
     * @return
     *     The class instance
     */
    public TierBoundaryListDataType withTierBoundaryData(TierBoundaryDataType... values) {
        if (values!= null) {
            for (TierBoundaryDataType value: values) {
                getTierBoundaryData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TierBoundaryData using addAll method
     * 
     * @param values
     *     objects to add to the list TierBoundaryData
     * @return
     *     The class instance
     */
    public TierBoundaryListDataType withTierBoundaryData(Collection<TierBoundaryDataType> values) {
        if (values!= null) {
            getTierBoundaryData().addAll(values);
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
        if (draftCopy instanceof TierBoundaryListDataType) {
            final TierBoundaryListDataType copy = ((TierBoundaryListDataType) draftCopy);
            {
                Boolean tierBoundaryDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty())));
                if (tierBoundaryDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TierBoundaryDataType> sourceTierBoundaryData;
                    sourceTierBoundaryData = (((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty()))?this.getTierBoundaryData():null);
                    @SuppressWarnings("unchecked")
                    List<TierBoundaryDataType> copyTierBoundaryData = ((List<TierBoundaryDataType> ) strategy.copy(LocatorUtils.property(locator, "tierBoundaryData", sourceTierBoundaryData), sourceTierBoundaryData, ((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty()))));
                    copy.tierBoundaryData = null;
                    if (copyTierBoundaryData!= null) {
                        List<TierBoundaryDataType> uniqueTierBoundaryDatal = copy.getTierBoundaryData();
                        uniqueTierBoundaryDatal.addAll(copyTierBoundaryData);
                    }
                } else {
                    if (tierBoundaryDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierBoundaryData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierBoundaryListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryListDataType that = ((TierBoundaryListDataType) object);
        {
            List<TierBoundaryDataType> leftTierBoundaryData;
            leftTierBoundaryData = (((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty()))?this.getTierBoundaryData():null);
            List<TierBoundaryDataType> rightTierBoundaryData;
            rightTierBoundaryData = (((that.tierBoundaryData!= null)&&(!that.tierBoundaryData.isEmpty()))?that.getTierBoundaryData():null);
            if ((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty())) {
                if ((that.tierBoundaryData!= null)&&(!that.tierBoundaryData.isEmpty())) {
                    if (!leftTierBoundaryData.equals(rightTierBoundaryData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tierBoundaryData!= null)&&(!that.tierBoundaryData.isEmpty())) {
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
            List<TierBoundaryDataType> theTierBoundaryData;
            theTierBoundaryData = (((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty()))?this.getTierBoundaryData():null);
            if ((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty())) {
                currentHashCode += theTierBoundaryData.hashCode();
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
            List<TierBoundaryDataType> theTierBoundaryData;
            theTierBoundaryData = (((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty()))?this.getTierBoundaryData():null);
            strategy.appendField(locator, this, "tierBoundaryData", buffer, theTierBoundaryData, ((this.tierBoundaryData!= null)&&(!this.tierBoundaryData.isEmpty())));
        }
        return buffer;
    }

}
