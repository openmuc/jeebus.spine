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
 * <p>Java class for TariffTierRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffTierRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tariffTierRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffTierRelationListDataType", propOrder = {
    "tariffTierRelationData"
})
public class TariffTierRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TariffTierRelationDataType> tariffTierRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffTierRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffTierRelationListDataType(final List<TariffTierRelationDataType> tariffTierRelationData) {
        this.tariffTierRelationData = tariffTierRelationData;
    }

    /**
     * Gets the value of the tariffTierRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffTierRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffTierRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffTierRelationDataType }
     * 
     * 
     */
    public List<TariffTierRelationDataType> getTariffTierRelationData() {
        if (tariffTierRelationData == null) {
            tariffTierRelationData = new ArrayList<TariffTierRelationDataType>();
        }
        return this.tariffTierRelationData;
    }

    /**
     * Adds objects to the list of TariffTierRelationData using add method
     * 
     * @param values
     *     objects to add to the list TariffTierRelationData
     * @return
     *     The class instance
     */
    public TariffTierRelationListDataType withTariffTierRelationData(TariffTierRelationDataType... values) {
        if (values!= null) {
            for (TariffTierRelationDataType value: values) {
                getTariffTierRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TariffTierRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list TariffTierRelationData
     * @return
     *     The class instance
     */
    public TariffTierRelationListDataType withTariffTierRelationData(Collection<TariffTierRelationDataType> values) {
        if (values!= null) {
            getTariffTierRelationData().addAll(values);
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
        if (draftCopy instanceof TariffTierRelationListDataType) {
            final TariffTierRelationListDataType copy = ((TariffTierRelationListDataType) draftCopy);
            {
                Boolean tariffTierRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty())));
                if (tariffTierRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TariffTierRelationDataType> sourceTariffTierRelationData;
                    sourceTariffTierRelationData = (((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty()))?this.getTariffTierRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<TariffTierRelationDataType> copyTariffTierRelationData = ((List<TariffTierRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "tariffTierRelationData", sourceTariffTierRelationData), sourceTariffTierRelationData, ((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty()))));
                    copy.tariffTierRelationData = null;
                    if (copyTariffTierRelationData!= null) {
                        List<TariffTierRelationDataType> uniqueTariffTierRelationDatal = copy.getTariffTierRelationData();
                        uniqueTariffTierRelationDatal.addAll(copyTariffTierRelationData);
                    }
                } else {
                    if (tariffTierRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffTierRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffTierRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffTierRelationListDataType that = ((TariffTierRelationListDataType) object);
        {
            List<TariffTierRelationDataType> leftTariffTierRelationData;
            leftTariffTierRelationData = (((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty()))?this.getTariffTierRelationData():null);
            List<TariffTierRelationDataType> rightTariffTierRelationData;
            rightTariffTierRelationData = (((that.tariffTierRelationData!= null)&&(!that.tariffTierRelationData.isEmpty()))?that.getTariffTierRelationData():null);
            if ((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty())) {
                if ((that.tariffTierRelationData!= null)&&(!that.tariffTierRelationData.isEmpty())) {
                    if (!leftTariffTierRelationData.equals(rightTariffTierRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tariffTierRelationData!= null)&&(!that.tariffTierRelationData.isEmpty())) {
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
            List<TariffTierRelationDataType> theTariffTierRelationData;
            theTariffTierRelationData = (((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty()))?this.getTariffTierRelationData():null);
            if ((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty())) {
                currentHashCode += theTariffTierRelationData.hashCode();
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
            List<TariffTierRelationDataType> theTariffTierRelationData;
            theTariffTierRelationData = (((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty()))?this.getTariffTierRelationData():null);
            strategy.appendField(locator, this, "tariffTierRelationData", buffer, theTariffTierRelationData, ((this.tariffTierRelationData!= null)&&(!this.tariffTierRelationData.isEmpty())));
        }
        return buffer;
    }

}
