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
 * <p>Java class for OperatingConstraintsPowerDescriptionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerDescriptionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsPowerDescriptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerDescriptionListDataType", propOrder = {
    "operatingConstraintsPowerDescriptionData"
})
public class OperatingConstraintsPowerDescriptionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsPowerDescriptionDataType> operatingConstraintsPowerDescriptionData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerDescriptionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerDescriptionListDataType(final List<OperatingConstraintsPowerDescriptionDataType> operatingConstraintsPowerDescriptionData) {
        this.operatingConstraintsPowerDescriptionData = operatingConstraintsPowerDescriptionData;
    }

    /**
     * Gets the value of the operatingConstraintsPowerDescriptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsPowerDescriptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsPowerDescriptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsPowerDescriptionDataType }
     * 
     * 
     */
    public List<OperatingConstraintsPowerDescriptionDataType> getOperatingConstraintsPowerDescriptionData() {
        if (operatingConstraintsPowerDescriptionData == null) {
            operatingConstraintsPowerDescriptionData = new ArrayList<OperatingConstraintsPowerDescriptionDataType>();
        }
        return this.operatingConstraintsPowerDescriptionData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerDescriptionData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerDescriptionData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerDescriptionListDataType withOperatingConstraintsPowerDescriptionData(OperatingConstraintsPowerDescriptionDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsPowerDescriptionDataType value: values) {
                getOperatingConstraintsPowerDescriptionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerDescriptionData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerDescriptionData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerDescriptionListDataType withOperatingConstraintsPowerDescriptionData(Collection<OperatingConstraintsPowerDescriptionDataType> values) {
        if (values!= null) {
            getOperatingConstraintsPowerDescriptionData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsPowerDescriptionListDataType) {
            final OperatingConstraintsPowerDescriptionListDataType copy = ((OperatingConstraintsPowerDescriptionListDataType) draftCopy);
            {
                Boolean operatingConstraintsPowerDescriptionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty())));
                if (operatingConstraintsPowerDescriptionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsPowerDescriptionDataType> sourceOperatingConstraintsPowerDescriptionData;
                    sourceOperatingConstraintsPowerDescriptionData = (((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty()))?this.getOperatingConstraintsPowerDescriptionData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsPowerDescriptionDataType> copyOperatingConstraintsPowerDescriptionData = ((List<OperatingConstraintsPowerDescriptionDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerDescriptionData", sourceOperatingConstraintsPowerDescriptionData), sourceOperatingConstraintsPowerDescriptionData, ((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty()))));
                    copy.operatingConstraintsPowerDescriptionData = null;
                    if (copyOperatingConstraintsPowerDescriptionData!= null) {
                        List<OperatingConstraintsPowerDescriptionDataType> uniqueOperatingConstraintsPowerDescriptionDatal = copy.getOperatingConstraintsPowerDescriptionData();
                        uniqueOperatingConstraintsPowerDescriptionDatal.addAll(copyOperatingConstraintsPowerDescriptionData);
                    }
                } else {
                    if (operatingConstraintsPowerDescriptionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerDescriptionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerDescriptionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerDescriptionListDataType that = ((OperatingConstraintsPowerDescriptionListDataType) object);
        {
            List<OperatingConstraintsPowerDescriptionDataType> leftOperatingConstraintsPowerDescriptionData;
            leftOperatingConstraintsPowerDescriptionData = (((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty()))?this.getOperatingConstraintsPowerDescriptionData():null);
            List<OperatingConstraintsPowerDescriptionDataType> rightOperatingConstraintsPowerDescriptionData;
            rightOperatingConstraintsPowerDescriptionData = (((that.operatingConstraintsPowerDescriptionData!= null)&&(!that.operatingConstraintsPowerDescriptionData.isEmpty()))?that.getOperatingConstraintsPowerDescriptionData():null);
            if ((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty())) {
                if ((that.operatingConstraintsPowerDescriptionData!= null)&&(!that.operatingConstraintsPowerDescriptionData.isEmpty())) {
                    if (!leftOperatingConstraintsPowerDescriptionData.equals(rightOperatingConstraintsPowerDescriptionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsPowerDescriptionData!= null)&&(!that.operatingConstraintsPowerDescriptionData.isEmpty())) {
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
            List<OperatingConstraintsPowerDescriptionDataType> theOperatingConstraintsPowerDescriptionData;
            theOperatingConstraintsPowerDescriptionData = (((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty()))?this.getOperatingConstraintsPowerDescriptionData():null);
            if ((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty())) {
                currentHashCode += theOperatingConstraintsPowerDescriptionData.hashCode();
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
            List<OperatingConstraintsPowerDescriptionDataType> theOperatingConstraintsPowerDescriptionData;
            theOperatingConstraintsPowerDescriptionData = (((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty()))?this.getOperatingConstraintsPowerDescriptionData():null);
            strategy.appendField(locator, this, "operatingConstraintsPowerDescriptionData", buffer, theOperatingConstraintsPowerDescriptionData, ((this.operatingConstraintsPowerDescriptionData!= null)&&(!this.operatingConstraintsPowerDescriptionData.isEmpty())));
        }
        return buffer;
    }

}
