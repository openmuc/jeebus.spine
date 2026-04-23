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
 * <p>Java class for OperatingConstraintsDurationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsDurationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsDurationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsDurationListDataType", propOrder = {
    "operatingConstraintsDurationData"
})
public class OperatingConstraintsDurationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsDurationDataType> operatingConstraintsDurationData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsDurationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsDurationListDataType(final List<OperatingConstraintsDurationDataType> operatingConstraintsDurationData) {
        this.operatingConstraintsDurationData = operatingConstraintsDurationData;
    }

    /**
     * Gets the value of the operatingConstraintsDurationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsDurationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsDurationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsDurationDataType }
     * 
     * 
     */
    public List<OperatingConstraintsDurationDataType> getOperatingConstraintsDurationData() {
        if (operatingConstraintsDurationData == null) {
            operatingConstraintsDurationData = new ArrayList<OperatingConstraintsDurationDataType>();
        }
        return this.operatingConstraintsDurationData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsDurationData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsDurationData
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationListDataType withOperatingConstraintsDurationData(OperatingConstraintsDurationDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsDurationDataType value: values) {
                getOperatingConstraintsDurationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsDurationData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsDurationData
     * @return
     *     The class instance
     */
    public OperatingConstraintsDurationListDataType withOperatingConstraintsDurationData(Collection<OperatingConstraintsDurationDataType> values) {
        if (values!= null) {
            getOperatingConstraintsDurationData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsDurationListDataType) {
            final OperatingConstraintsDurationListDataType copy = ((OperatingConstraintsDurationListDataType) draftCopy);
            {
                Boolean operatingConstraintsDurationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty())));
                if (operatingConstraintsDurationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsDurationDataType> sourceOperatingConstraintsDurationData;
                    sourceOperatingConstraintsDurationData = (((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty()))?this.getOperatingConstraintsDurationData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsDurationDataType> copyOperatingConstraintsDurationData = ((List<OperatingConstraintsDurationDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsDurationData", sourceOperatingConstraintsDurationData), sourceOperatingConstraintsDurationData, ((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty()))));
                    copy.operatingConstraintsDurationData = null;
                    if (copyOperatingConstraintsDurationData!= null) {
                        List<OperatingConstraintsDurationDataType> uniqueOperatingConstraintsDurationDatal = copy.getOperatingConstraintsDurationData();
                        uniqueOperatingConstraintsDurationDatal.addAll(copyOperatingConstraintsDurationData);
                    }
                } else {
                    if (operatingConstraintsDurationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsDurationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsDurationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsDurationListDataType that = ((OperatingConstraintsDurationListDataType) object);
        {
            List<OperatingConstraintsDurationDataType> leftOperatingConstraintsDurationData;
            leftOperatingConstraintsDurationData = (((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty()))?this.getOperatingConstraintsDurationData():null);
            List<OperatingConstraintsDurationDataType> rightOperatingConstraintsDurationData;
            rightOperatingConstraintsDurationData = (((that.operatingConstraintsDurationData!= null)&&(!that.operatingConstraintsDurationData.isEmpty()))?that.getOperatingConstraintsDurationData():null);
            if ((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty())) {
                if ((that.operatingConstraintsDurationData!= null)&&(!that.operatingConstraintsDurationData.isEmpty())) {
                    if (!leftOperatingConstraintsDurationData.equals(rightOperatingConstraintsDurationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsDurationData!= null)&&(!that.operatingConstraintsDurationData.isEmpty())) {
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
            List<OperatingConstraintsDurationDataType> theOperatingConstraintsDurationData;
            theOperatingConstraintsDurationData = (((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty()))?this.getOperatingConstraintsDurationData():null);
            if ((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty())) {
                currentHashCode += theOperatingConstraintsDurationData.hashCode();
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
            List<OperatingConstraintsDurationDataType> theOperatingConstraintsDurationData;
            theOperatingConstraintsDurationData = (((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty()))?this.getOperatingConstraintsDurationData():null);
            strategy.appendField(locator, this, "operatingConstraintsDurationData", buffer, theOperatingConstraintsDurationData, ((this.operatingConstraintsDurationData!= null)&&(!this.operatingConstraintsDurationData.isEmpty())));
        }
        return buffer;
    }

}
