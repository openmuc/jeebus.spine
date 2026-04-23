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
 * <p>Java class for TierDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tierDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierDescriptionListDataType", propOrder = {
    "tierDescriptionData"
})
public class TierDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TierDescriptionDataType> tierDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TierDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TierDescriptionListDataType(final List<TierDescriptionDataType> tierDescriptionData) {
        this.tierDescriptionData = tierDescriptionData;
    }

    /**
     * Gets the value of the tierDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tierDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierDescriptionDataType }
     * 
     * 
     */
    public List<TierDescriptionDataType> getTierDescriptionData() {
        if (tierDescriptionData == null) {
            tierDescriptionData = new ArrayList<TierDescriptionDataType>();
        }
        return this.tierDescriptionData;
    }

    /**
     * Adds objects to the list of TierDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TierDescriptionData
     * @return
     *     The class instance
     */
    public TierDescriptionListDataType withTierDescriptionData(TierDescriptionDataType... values) {
        if (values!= null) {
            for (TierDescriptionDataType value: values) {
                getTierDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TierDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TierDescriptionData
     * @return
     *     The class instance
     */
    public TierDescriptionListDataType withTierDescriptionData(Collection<TierDescriptionDataType> values) {
        if (values!= null) {
            getTierDescriptionData().addAll(values);
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
        if (draftCopy instanceof TierDescriptionListDataType) {
            final TierDescriptionListDataType copy = ((TierDescriptionListDataType) draftCopy);
            {
                Boolean tierDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty())));
                if (tierDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TierDescriptionDataType> sourceTierDescriptionData;
                    sourceTierDescriptionData = (((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty()))?this.getTierDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TierDescriptionDataType> copyTierDescriptionData = ((List<TierDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "tierDescriptionData", sourceTierDescriptionData), sourceTierDescriptionData, ((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty()))));
                    copy.tierDescriptionData = null;
                    if (copyTierDescriptionData!= null) {
                        List<TierDescriptionDataType> uniqueTierDescriptionDatal = copy.getTierDescriptionData();
                        uniqueTierDescriptionDatal.addAll(copyTierDescriptionData);
                    }
                } else {
                    if (tierDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TierDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TierDescriptionListDataType that = ((TierDescriptionListDataType) object);
        {
            List<TierDescriptionDataType> leftTierDescriptionData;
            leftTierDescriptionData = (((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty()))?this.getTierDescriptionData():null);
            List<TierDescriptionDataType> rightTierDescriptionData;
            rightTierDescriptionData = (((that.tierDescriptionData!= null)&&(!that.tierDescriptionData.isEmpty()))?that.getTierDescriptionData():null);
            if ((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty())) {
                if ((that.tierDescriptionData!= null)&&(!that.tierDescriptionData.isEmpty())) {
                    if (!leftTierDescriptionData.equals(rightTierDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tierDescriptionData!= null)&&(!that.tierDescriptionData.isEmpty())) {
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
            List<TierDescriptionDataType> theTierDescriptionData;
            theTierDescriptionData = (((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty()))?this.getTierDescriptionData():null);
            if ((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty())) {
                currentHashCode += theTierDescriptionData.hashCode();
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
            List<TierDescriptionDataType> theTierDescriptionData;
            theTierDescriptionData = (((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty()))?this.getTierDescriptionData():null);
            strategy.appendField(locator, this, "tierDescriptionData", buffer, theTierDescriptionData, ((this.tierDescriptionData!= null)&&(!this.tierDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
