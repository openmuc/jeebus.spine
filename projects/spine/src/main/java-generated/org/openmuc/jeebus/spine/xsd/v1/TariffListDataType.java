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
 * <p>Java class for TariffListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}tariffData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffListDataType", propOrder = {
    "tariffData"
})
public class TariffListDataType implements Cloneable, CopyTo, ToString
{

    protected List<TariffDataType> tariffData;

    /**
     * Default no-arg constructor
     * 
     */
    public TariffListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TariffListDataType(final List<TariffDataType> tariffData) {
        this.tariffData = tariffData;
    }

    /**
     * Gets the value of the tariffData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tariffData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffDataType }
     * 
     * 
     */
    public List<TariffDataType> getTariffData() {
        if (tariffData == null) {
            tariffData = new ArrayList<TariffDataType>();
        }
        return this.tariffData;
    }

    /**
     * Adds objects to the list of TariffData using add method
     * 
     * @param values
     *     objects to add to the list TariffData
     * @return
     *     The class instance
     */
    public TariffListDataType withTariffData(TariffDataType... values) {
        if (values!= null) {
            for (TariffDataType value: values) {
                getTariffData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of TariffData using addAll method
     * 
     * @param values
     *     objects to add to the list TariffData
     * @return
     *     The class instance
     */
    public TariffListDataType withTariffData(Collection<TariffDataType> values) {
        if (values!= null) {
            getTariffData().addAll(values);
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
        if (draftCopy instanceof TariffListDataType) {
            final TariffListDataType copy = ((TariffListDataType) draftCopy);
            {
                Boolean tariffDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.tariffData!= null)&&(!this.tariffData.isEmpty())));
                if (tariffDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TariffDataType> sourceTariffData;
                    sourceTariffData = (((this.tariffData!= null)&&(!this.tariffData.isEmpty()))?this.getTariffData():null);
                    @SuppressWarnings("unchecked")
                    List<TariffDataType> copyTariffData = ((List<TariffDataType> ) strategy.copy(LocatorUtils.property(locator, "tariffData", sourceTariffData), sourceTariffData, ((this.tariffData!= null)&&(!this.tariffData.isEmpty()))));
                    copy.tariffData = null;
                    if (copyTariffData!= null) {
                        List<TariffDataType> uniqueTariffDatal = copy.getTariffData();
                        uniqueTariffDatal.addAll(copyTariffData);
                    }
                } else {
                    if (tariffDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tariffData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new TariffListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TariffListDataType that = ((TariffListDataType) object);
        {
            List<TariffDataType> leftTariffData;
            leftTariffData = (((this.tariffData!= null)&&(!this.tariffData.isEmpty()))?this.getTariffData():null);
            List<TariffDataType> rightTariffData;
            rightTariffData = (((that.tariffData!= null)&&(!that.tariffData.isEmpty()))?that.getTariffData():null);
            if ((this.tariffData!= null)&&(!this.tariffData.isEmpty())) {
                if ((that.tariffData!= null)&&(!that.tariffData.isEmpty())) {
                    if (!leftTariffData.equals(rightTariffData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.tariffData!= null)&&(!that.tariffData.isEmpty())) {
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
            List<TariffDataType> theTariffData;
            theTariffData = (((this.tariffData!= null)&&(!this.tariffData.isEmpty()))?this.getTariffData():null);
            if ((this.tariffData!= null)&&(!this.tariffData.isEmpty())) {
                currentHashCode += theTariffData.hashCode();
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
            List<TariffDataType> theTariffData;
            theTariffData = (((this.tariffData!= null)&&(!this.tariffData.isEmpty()))?this.getTariffData():null);
            strategy.appendField(locator, this, "tariffData", buffer, theTariffData, ((this.tariffData!= null)&&(!this.tariffData.isEmpty())));
        }
        return buffer;
    }

}
