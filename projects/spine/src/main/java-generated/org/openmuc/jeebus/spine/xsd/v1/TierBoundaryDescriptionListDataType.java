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
 * <p>Java class for TierBoundaryDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBoundaryDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tierBoundaryDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBoundaryDescriptionListDataType", propOrder = {
    "tierBoundaryDescriptionData"
})
public class TierBoundaryDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TierBoundaryDescriptionDataType> tierBoundaryDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TierBoundaryDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierBoundaryDescriptionListDataType(final List<TierBoundaryDescriptionDataType> tierBoundaryDescriptionData) {
        this.tierBoundaryDescriptionData = tierBoundaryDescriptionData;
    }

    /**
     * Gets the value of the tierBoundaryDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tierBoundaryDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierBoundaryDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierBoundaryDescriptionDataType }
     * 
     * 
     */
    public List<TierBoundaryDescriptionDataType> getTierBoundaryDescriptionData() {
        if (tierBoundaryDescriptionData == null) {
            tierBoundaryDescriptionData = new ArrayList<TierBoundaryDescriptionDataType>();
        }
        return this.tierBoundaryDescriptionData;
    }

    /**
     * Adds objects to the list of TierBoundaryDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TierBoundaryDescriptionData
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionListDataType withTierBoundaryDescriptionData(TierBoundaryDescriptionDataType... values) {
        if (values!= null) {
            for (TierBoundaryDescriptionDataType value: values) {
                getTierBoundaryDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TierBoundaryDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TierBoundaryDescriptionData
     * @return
     *     The class instance
     */
    public TierBoundaryDescriptionListDataType withTierBoundaryDescriptionData(Collection<TierBoundaryDescriptionDataType> values) {
        if (values!= null) {
            getTierBoundaryDescriptionData().addAll(values);
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
        if (draftCopy instanceof TierBoundaryDescriptionListDataType) {
            final TierBoundaryDescriptionListDataType copy = ((TierBoundaryDescriptionListDataType) draftCopy);
            {
                Boolean tierBoundaryDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty())));
                if (tierBoundaryDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TierBoundaryDescriptionDataType> sourceTierBoundaryDescriptionData;
                    sourceTierBoundaryDescriptionData = (((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty()))?this.getTierBoundaryDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TierBoundaryDescriptionDataType> copyTierBoundaryDescriptionData = ((List<TierBoundaryDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "tierBoundaryDescriptionData", sourceTierBoundaryDescriptionData), sourceTierBoundaryDescriptionData, ((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty()))));
                    copy.tierBoundaryDescriptionData = null;
                    if (copyTierBoundaryDescriptionData!= null) {
                        List<TierBoundaryDescriptionDataType> uniqueTierBoundaryDescriptionDatal = copy.getTierBoundaryDescriptionData();
                        uniqueTierBoundaryDescriptionDatal.addAll(copyTierBoundaryDescriptionData);
                    }
                } else {
                    if (tierBoundaryDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierBoundaryDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierBoundaryDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierBoundaryDescriptionListDataType that = ((TierBoundaryDescriptionListDataType) object);
        {
            List<TierBoundaryDescriptionDataType> leftTierBoundaryDescriptionData;
            leftTierBoundaryDescriptionData = (((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty()))?this.getTierBoundaryDescriptionData():null);
            List<TierBoundaryDescriptionDataType> rightTierBoundaryDescriptionData;
            rightTierBoundaryDescriptionData = (((that.tierBoundaryDescriptionData!= null)&&(!that.tierBoundaryDescriptionData.isEmpty()))?that.getTierBoundaryDescriptionData():null);
            if ((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty())) {
                if ((that.tierBoundaryDescriptionData!= null)&&(!that.tierBoundaryDescriptionData.isEmpty())) {
                    if (!leftTierBoundaryDescriptionData.equals(rightTierBoundaryDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tierBoundaryDescriptionData!= null)&&(!that.tierBoundaryDescriptionData.isEmpty())) {
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
            List<TierBoundaryDescriptionDataType> theTierBoundaryDescriptionData;
            theTierBoundaryDescriptionData = (((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty()))?this.getTierBoundaryDescriptionData():null);
            if ((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty())) {
                currentHashCode += theTierBoundaryDescriptionData.hashCode();
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
            List<TierBoundaryDescriptionDataType> theTierBoundaryDescriptionData;
            theTierBoundaryDescriptionData = (((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty()))?this.getTierBoundaryDescriptionData():null);
            strategy.appendField(locator, this, "tierBoundaryDescriptionData", buffer, theTierBoundaryDescriptionData, ((this.tierBoundaryDescriptionData!= null)&&(!this.tierBoundaryDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
