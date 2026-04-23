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
 * <p>Java class for TariffDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tariffDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffDescriptionListDataType", propOrder = {
    "tariffDescriptionData"
})
public class TariffDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TariffDescriptionDataType> tariffDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffDescriptionListDataType(final List<TariffDescriptionDataType> tariffDescriptionData) {
        this.tariffDescriptionData = tariffDescriptionData;
    }

    /**
     * Gets the value of the tariffDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffDescriptionDataType }
     * 
     * 
     */
    public List<TariffDescriptionDataType> getTariffDescriptionData() {
        if (tariffDescriptionData == null) {
            tariffDescriptionData = new ArrayList<TariffDescriptionDataType>();
        }
        return this.tariffDescriptionData;
    }

    /**
     * Adds objects to the list of TariffDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list TariffDescriptionData
     * @return
     *     The class instance
     */
    public TariffDescriptionListDataType withTariffDescriptionData(TariffDescriptionDataType... values) {
        if (values!= null) {
            for (TariffDescriptionDataType value: values) {
                getTariffDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TariffDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list TariffDescriptionData
     * @return
     *     The class instance
     */
    public TariffDescriptionListDataType withTariffDescriptionData(Collection<TariffDescriptionDataType> values) {
        if (values!= null) {
            getTariffDescriptionData().addAll(values);
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
        if (draftCopy instanceof TariffDescriptionListDataType) {
            final TariffDescriptionListDataType copy = ((TariffDescriptionListDataType) draftCopy);
            {
                Boolean tariffDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty())));
                if (tariffDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TariffDescriptionDataType> sourceTariffDescriptionData;
                    sourceTariffDescriptionData = (((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty()))?this.getTariffDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<TariffDescriptionDataType> copyTariffDescriptionData = ((List<TariffDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "tariffDescriptionData", sourceTariffDescriptionData), sourceTariffDescriptionData, ((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty()))));
                    copy.tariffDescriptionData = null;
                    if (copyTariffDescriptionData!= null) {
                        List<TariffDescriptionDataType> uniqueTariffDescriptionDatal = copy.getTariffDescriptionData();
                        uniqueTariffDescriptionDatal.addAll(copyTariffDescriptionData);
                    }
                } else {
                    if (tariffDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffDescriptionListDataType that = ((TariffDescriptionListDataType) object);
        {
            List<TariffDescriptionDataType> leftTariffDescriptionData;
            leftTariffDescriptionData = (((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty()))?this.getTariffDescriptionData():null);
            List<TariffDescriptionDataType> rightTariffDescriptionData;
            rightTariffDescriptionData = (((that.tariffDescriptionData!= null)&&(!that.tariffDescriptionData.isEmpty()))?that.getTariffDescriptionData():null);
            if ((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty())) {
                if ((that.tariffDescriptionData!= null)&&(!that.tariffDescriptionData.isEmpty())) {
                    if (!leftTariffDescriptionData.equals(rightTariffDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tariffDescriptionData!= null)&&(!that.tariffDescriptionData.isEmpty())) {
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
            List<TariffDescriptionDataType> theTariffDescriptionData;
            theTariffDescriptionData = (((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty()))?this.getTariffDescriptionData():null);
            if ((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty())) {
                currentHashCode += theTariffDescriptionData.hashCode();
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
            List<TariffDescriptionDataType> theTariffDescriptionData;
            theTariffDescriptionData = (((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty()))?this.getTariffDescriptionData():null);
            strategy.appendField(locator, this, "tariffDescriptionData", buffer, theTariffDescriptionData, ((this.tariffDescriptionData!= null)&&(!this.tariffDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
