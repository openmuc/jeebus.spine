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
 * <p>Java class for OperatingConstraintsInterruptListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsInterruptListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsInterruptData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsInterruptListDataType", propOrder = {
    "operatingConstraintsInterruptData"
})
public class OperatingConstraintsInterruptListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsInterruptDataType> operatingConstraintsInterruptData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsInterruptListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsInterruptListDataType(final List<OperatingConstraintsInterruptDataType> operatingConstraintsInterruptData) {
        this.operatingConstraintsInterruptData = operatingConstraintsInterruptData;
    }

    /**
     * Gets the value of the operatingConstraintsInterruptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsInterruptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsInterruptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsInterruptDataType }
     * 
     * 
     */
    public List<OperatingConstraintsInterruptDataType> getOperatingConstraintsInterruptData() {
        if (operatingConstraintsInterruptData == null) {
            operatingConstraintsInterruptData = new ArrayList<OperatingConstraintsInterruptDataType>();
        }
        return this.operatingConstraintsInterruptData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsInterruptData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsInterruptData
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptListDataType withOperatingConstraintsInterruptData(OperatingConstraintsInterruptDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsInterruptDataType value: values) {
                getOperatingConstraintsInterruptData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsInterruptData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsInterruptData
     * @return
     *     The class instance
     */
    public OperatingConstraintsInterruptListDataType withOperatingConstraintsInterruptData(Collection<OperatingConstraintsInterruptDataType> values) {
        if (values!= null) {
            getOperatingConstraintsInterruptData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsInterruptListDataType) {
            final OperatingConstraintsInterruptListDataType copy = ((OperatingConstraintsInterruptListDataType) draftCopy);
            {
                Boolean operatingConstraintsInterruptDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty())));
                if (operatingConstraintsInterruptDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsInterruptDataType> sourceOperatingConstraintsInterruptData;
                    sourceOperatingConstraintsInterruptData = (((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty()))?this.getOperatingConstraintsInterruptData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsInterruptDataType> copyOperatingConstraintsInterruptData = ((List<OperatingConstraintsInterruptDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsInterruptData", sourceOperatingConstraintsInterruptData), sourceOperatingConstraintsInterruptData, ((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty()))));
                    copy.operatingConstraintsInterruptData = null;
                    if (copyOperatingConstraintsInterruptData!= null) {
                        List<OperatingConstraintsInterruptDataType> uniqueOperatingConstraintsInterruptDatal = copy.getOperatingConstraintsInterruptData();
                        uniqueOperatingConstraintsInterruptDatal.addAll(copyOperatingConstraintsInterruptData);
                    }
                } else {
                    if (operatingConstraintsInterruptDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsInterruptData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsInterruptListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsInterruptListDataType that = ((OperatingConstraintsInterruptListDataType) object);
        {
            List<OperatingConstraintsInterruptDataType> leftOperatingConstraintsInterruptData;
            leftOperatingConstraintsInterruptData = (((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty()))?this.getOperatingConstraintsInterruptData():null);
            List<OperatingConstraintsInterruptDataType> rightOperatingConstraintsInterruptData;
            rightOperatingConstraintsInterruptData = (((that.operatingConstraintsInterruptData!= null)&&(!that.operatingConstraintsInterruptData.isEmpty()))?that.getOperatingConstraintsInterruptData():null);
            if ((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty())) {
                if ((that.operatingConstraintsInterruptData!= null)&&(!that.operatingConstraintsInterruptData.isEmpty())) {
                    if (!leftOperatingConstraintsInterruptData.equals(rightOperatingConstraintsInterruptData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsInterruptData!= null)&&(!that.operatingConstraintsInterruptData.isEmpty())) {
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
            List<OperatingConstraintsInterruptDataType> theOperatingConstraintsInterruptData;
            theOperatingConstraintsInterruptData = (((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty()))?this.getOperatingConstraintsInterruptData():null);
            if ((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty())) {
                currentHashCode += theOperatingConstraintsInterruptData.hashCode();
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
            List<OperatingConstraintsInterruptDataType> theOperatingConstraintsInterruptData;
            theOperatingConstraintsInterruptData = (((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty()))?this.getOperatingConstraintsInterruptData():null);
            strategy.appendField(locator, this, "operatingConstraintsInterruptData", buffer, theOperatingConstraintsInterruptData, ((this.operatingConstraintsInterruptData!= null)&&(!this.operatingConstraintsInterruptData.isEmpty())));
        }
        return buffer;
    }

}
