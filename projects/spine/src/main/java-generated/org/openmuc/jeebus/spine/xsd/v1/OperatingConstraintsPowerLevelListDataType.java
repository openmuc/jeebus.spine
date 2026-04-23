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
 * <p>Java class for OperatingConstraintsPowerLevelListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsPowerLevelListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsPowerLevelData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsPowerLevelListDataType", propOrder = {
    "operatingConstraintsPowerLevelData"
})
public class OperatingConstraintsPowerLevelListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsPowerLevelDataType> operatingConstraintsPowerLevelData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsPowerLevelListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsPowerLevelListDataType(final List<OperatingConstraintsPowerLevelDataType> operatingConstraintsPowerLevelData) {
        this.operatingConstraintsPowerLevelData = operatingConstraintsPowerLevelData;
    }

    /**
     * Gets the value of the operatingConstraintsPowerLevelData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsPowerLevelData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsPowerLevelData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsPowerLevelDataType }
     * 
     * 
     */
    public List<OperatingConstraintsPowerLevelDataType> getOperatingConstraintsPowerLevelData() {
        if (operatingConstraintsPowerLevelData == null) {
            operatingConstraintsPowerLevelData = new ArrayList<OperatingConstraintsPowerLevelDataType>();
        }
        return this.operatingConstraintsPowerLevelData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerLevelData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerLevelData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerLevelListDataType withOperatingConstraintsPowerLevelData(OperatingConstraintsPowerLevelDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsPowerLevelDataType value: values) {
                getOperatingConstraintsPowerLevelData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsPowerLevelData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsPowerLevelData
     * @return
     *     The class instance
     */
    public OperatingConstraintsPowerLevelListDataType withOperatingConstraintsPowerLevelData(Collection<OperatingConstraintsPowerLevelDataType> values) {
        if (values!= null) {
            getOperatingConstraintsPowerLevelData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsPowerLevelListDataType) {
            final OperatingConstraintsPowerLevelListDataType copy = ((OperatingConstraintsPowerLevelListDataType) draftCopy);
            {
                Boolean operatingConstraintsPowerLevelDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty())));
                if (operatingConstraintsPowerLevelDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsPowerLevelDataType> sourceOperatingConstraintsPowerLevelData;
                    sourceOperatingConstraintsPowerLevelData = (((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty()))?this.getOperatingConstraintsPowerLevelData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsPowerLevelDataType> copyOperatingConstraintsPowerLevelData = ((List<OperatingConstraintsPowerLevelDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsPowerLevelData", sourceOperatingConstraintsPowerLevelData), sourceOperatingConstraintsPowerLevelData, ((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty()))));
                    copy.operatingConstraintsPowerLevelData = null;
                    if (copyOperatingConstraintsPowerLevelData!= null) {
                        List<OperatingConstraintsPowerLevelDataType> uniqueOperatingConstraintsPowerLevelDatal = copy.getOperatingConstraintsPowerLevelData();
                        uniqueOperatingConstraintsPowerLevelDatal.addAll(copyOperatingConstraintsPowerLevelData);
                    }
                } else {
                    if (operatingConstraintsPowerLevelDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsPowerLevelData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsPowerLevelListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsPowerLevelListDataType that = ((OperatingConstraintsPowerLevelListDataType) object);
        {
            List<OperatingConstraintsPowerLevelDataType> leftOperatingConstraintsPowerLevelData;
            leftOperatingConstraintsPowerLevelData = (((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty()))?this.getOperatingConstraintsPowerLevelData():null);
            List<OperatingConstraintsPowerLevelDataType> rightOperatingConstraintsPowerLevelData;
            rightOperatingConstraintsPowerLevelData = (((that.operatingConstraintsPowerLevelData!= null)&&(!that.operatingConstraintsPowerLevelData.isEmpty()))?that.getOperatingConstraintsPowerLevelData():null);
            if ((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty())) {
                if ((that.operatingConstraintsPowerLevelData!= null)&&(!that.operatingConstraintsPowerLevelData.isEmpty())) {
                    if (!leftOperatingConstraintsPowerLevelData.equals(rightOperatingConstraintsPowerLevelData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsPowerLevelData!= null)&&(!that.operatingConstraintsPowerLevelData.isEmpty())) {
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
            List<OperatingConstraintsPowerLevelDataType> theOperatingConstraintsPowerLevelData;
            theOperatingConstraintsPowerLevelData = (((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty()))?this.getOperatingConstraintsPowerLevelData():null);
            if ((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty())) {
                currentHashCode += theOperatingConstraintsPowerLevelData.hashCode();
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
            List<OperatingConstraintsPowerLevelDataType> theOperatingConstraintsPowerLevelData;
            theOperatingConstraintsPowerLevelData = (((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty()))?this.getOperatingConstraintsPowerLevelData():null);
            strategy.appendField(locator, this, "operatingConstraintsPowerLevelData", buffer, theOperatingConstraintsPowerLevelData, ((this.operatingConstraintsPowerLevelData!= null)&&(!this.operatingConstraintsPowerLevelData.isEmpty())));
        }
        return buffer;
    }

}
