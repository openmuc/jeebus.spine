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
 * <p>Java class for SensingListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensingListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}sensingData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensingListDataType", propOrder = {
    "sensingData"
})
public class SensingListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SensingDataType> sensingData;

    /**
     * Default no-arg constructor
     * 
     */
    public SensingListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SensingListDataType(final List<SensingDataType> sensingData) {
        this.sensingData = sensingData;
    }

    /**
     * Gets the value of the sensingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sensingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensingDataType }
     * 
     * 
     */
    public List<SensingDataType> getSensingData() {
        if (sensingData == null) {
            sensingData = new ArrayList<SensingDataType>();
        }
        return this.sensingData;
    }

    /**
     * Adds objects to the list of SensingData using add method
     * 
     * @param values
     *     objects to add to the list SensingData
     * @return
     *     The class instance
     */
    public SensingListDataType withSensingData(SensingDataType... values) {
        if (values!= null) {
            for (SensingDataType value: values) {
                getSensingData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SensingData using addAll method
     * 
     * @param values
     *     objects to add to the list SensingData
     * @return
     *     The class instance
     */
    public SensingListDataType withSensingData(Collection<SensingDataType> values) {
        if (values!= null) {
            getSensingData().addAll(values);
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
        if (draftCopy instanceof SensingListDataType) {
            final SensingListDataType copy = ((SensingListDataType) draftCopy);
            {
                Boolean sensingDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sensingData!= null)&&(!this.sensingData.isEmpty())));
                if (sensingDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SensingDataType> sourceSensingData;
                    sourceSensingData = (((this.sensingData!= null)&&(!this.sensingData.isEmpty()))?this.getSensingData():null);
                    @SuppressWarnings("unchecked")
                    List<SensingDataType> copySensingData = ((List<SensingDataType> ) strategy.copy(LocatorUtils.property(locator, "sensingData", sourceSensingData), sourceSensingData, ((this.sensingData!= null)&&(!this.sensingData.isEmpty()))));
                    copy.sensingData = null;
                    if (copySensingData!= null) {
                        List<SensingDataType> uniqueSensingDatal = copy.getSensingData();
                        uniqueSensingDatal.addAll(copySensingData);
                    }
                } else {
                    if (sensingDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sensingData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SensingListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SensingListDataType that = ((SensingListDataType) object);
        {
            List<SensingDataType> leftSensingData;
            leftSensingData = (((this.sensingData!= null)&&(!this.sensingData.isEmpty()))?this.getSensingData():null);
            List<SensingDataType> rightSensingData;
            rightSensingData = (((that.sensingData!= null)&&(!that.sensingData.isEmpty()))?that.getSensingData():null);
            if ((this.sensingData!= null)&&(!this.sensingData.isEmpty())) {
                if ((that.sensingData!= null)&&(!that.sensingData.isEmpty())) {
                    if (!leftSensingData.equals(rightSensingData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.sensingData!= null)&&(!that.sensingData.isEmpty())) {
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
            List<SensingDataType> theSensingData;
            theSensingData = (((this.sensingData!= null)&&(!this.sensingData.isEmpty()))?this.getSensingData():null);
            if ((this.sensingData!= null)&&(!this.sensingData.isEmpty())) {
                currentHashCode += theSensingData.hashCode();
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
            List<SensingDataType> theSensingData;
            theSensingData = (((this.sensingData!= null)&&(!this.sensingData.isEmpty()))?this.getSensingData():null);
            strategy.appendField(locator, this, "sensingData", buffer, theSensingData, ((this.sensingData!= null)&&(!this.sensingData.isEmpty())));
        }
        return buffer;
    }

}
