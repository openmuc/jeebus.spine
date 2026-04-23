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
 * <p>Java class for TariffBoundaryRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffBoundaryRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tariffBoundaryRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffBoundaryRelationListDataType", propOrder = {
    "tariffBoundaryRelationData"
})
public class TariffBoundaryRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TariffBoundaryRelationDataType> tariffBoundaryRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffBoundaryRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffBoundaryRelationListDataType(final List<TariffBoundaryRelationDataType> tariffBoundaryRelationData) {
        this.tariffBoundaryRelationData = tariffBoundaryRelationData;
    }

    /**
     * Gets the value of the tariffBoundaryRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffBoundaryRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffBoundaryRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffBoundaryRelationDataType }
     * 
     * 
     */
    public List<TariffBoundaryRelationDataType> getTariffBoundaryRelationData() {
        if (tariffBoundaryRelationData == null) {
            tariffBoundaryRelationData = new ArrayList<TariffBoundaryRelationDataType>();
        }
        return this.tariffBoundaryRelationData;
    }

    /**
     * Adds objects to the list of TariffBoundaryRelationData using add method
     * 
     * @param values
     *     objects to add to the list TariffBoundaryRelationData
     * @return
     *     The class instance
     */
    public TariffBoundaryRelationListDataType withTariffBoundaryRelationData(TariffBoundaryRelationDataType... values) {
        if (values!= null) {
            for (TariffBoundaryRelationDataType value: values) {
                getTariffBoundaryRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TariffBoundaryRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list TariffBoundaryRelationData
     * @return
     *     The class instance
     */
    public TariffBoundaryRelationListDataType withTariffBoundaryRelationData(Collection<TariffBoundaryRelationDataType> values) {
        if (values!= null) {
            getTariffBoundaryRelationData().addAll(values);
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
        if (draftCopy instanceof TariffBoundaryRelationListDataType) {
            final TariffBoundaryRelationListDataType copy = ((TariffBoundaryRelationListDataType) draftCopy);
            {
                Boolean tariffBoundaryRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty())));
                if (tariffBoundaryRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TariffBoundaryRelationDataType> sourceTariffBoundaryRelationData;
                    sourceTariffBoundaryRelationData = (((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty()))?this.getTariffBoundaryRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<TariffBoundaryRelationDataType> copyTariffBoundaryRelationData = ((List<TariffBoundaryRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "tariffBoundaryRelationData", sourceTariffBoundaryRelationData), sourceTariffBoundaryRelationData, ((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty()))));
                    copy.tariffBoundaryRelationData = null;
                    if (copyTariffBoundaryRelationData!= null) {
                        List<TariffBoundaryRelationDataType> uniqueTariffBoundaryRelationDatal = copy.getTariffBoundaryRelationData();
                        uniqueTariffBoundaryRelationDatal.addAll(copyTariffBoundaryRelationData);
                    }
                } else {
                    if (tariffBoundaryRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffBoundaryRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffBoundaryRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffBoundaryRelationListDataType that = ((TariffBoundaryRelationListDataType) object);
        {
            List<TariffBoundaryRelationDataType> leftTariffBoundaryRelationData;
            leftTariffBoundaryRelationData = (((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty()))?this.getTariffBoundaryRelationData():null);
            List<TariffBoundaryRelationDataType> rightTariffBoundaryRelationData;
            rightTariffBoundaryRelationData = (((that.tariffBoundaryRelationData!= null)&&(!that.tariffBoundaryRelationData.isEmpty()))?that.getTariffBoundaryRelationData():null);
            if ((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty())) {
                if ((that.tariffBoundaryRelationData!= null)&&(!that.tariffBoundaryRelationData.isEmpty())) {
                    if (!leftTariffBoundaryRelationData.equals(rightTariffBoundaryRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tariffBoundaryRelationData!= null)&&(!that.tariffBoundaryRelationData.isEmpty())) {
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
            List<TariffBoundaryRelationDataType> theTariffBoundaryRelationData;
            theTariffBoundaryRelationData = (((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty()))?this.getTariffBoundaryRelationData():null);
            if ((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty())) {
                currentHashCode += theTariffBoundaryRelationData.hashCode();
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
            List<TariffBoundaryRelationDataType> theTariffBoundaryRelationData;
            theTariffBoundaryRelationData = (((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty()))?this.getTariffBoundaryRelationData():null);
            strategy.appendField(locator, this, "tariffBoundaryRelationData", buffer, theTariffBoundaryRelationData, ((this.tariffBoundaryRelationData!= null)&&(!this.tariffBoundaryRelationData.isEmpty())));
        }
        return buffer;
    }

}
