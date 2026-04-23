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
 * <p>Java class for SetpointConstraintsListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetpointConstraintsListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}setpointConstraintsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetpointConstraintsListDataType", propOrder = {
    "setpointConstraintsData"
})
public class SetpointConstraintsListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SetpointConstraintsDataType> setpointConstraintsData;

    /**
     * Default no-arg constructor
     * 
     */
    public SetpointConstraintsListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetpointConstraintsListDataType(final List<SetpointConstraintsDataType> setpointConstraintsData) {
        this.setpointConstraintsData = setpointConstraintsData;
    }

    /**
     * Gets the value of the setpointConstraintsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the setpointConstraintsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetpointConstraintsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetpointConstraintsDataType }
     * 
     * 
     */
    public List<SetpointConstraintsDataType> getSetpointConstraintsData() {
        if (setpointConstraintsData == null) {
            setpointConstraintsData = new ArrayList<SetpointConstraintsDataType>();
        }
        return this.setpointConstraintsData;
    }

    /**
     * Adds objects to the list of SetpointConstraintsData using add method
     * 
     * @param values
     *     objects to add to the list SetpointConstraintsData
     * @return
     *     The class instance
     */
    public SetpointConstraintsListDataType withSetpointConstraintsData(SetpointConstraintsDataType... values) {
        if (values!= null) {
            for (SetpointConstraintsDataType value: values) {
                getSetpointConstraintsData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SetpointConstraintsData using addAll method
     * 
     * @param values
     *     objects to add to the list SetpointConstraintsData
     * @return
     *     The class instance
     */
    public SetpointConstraintsListDataType withSetpointConstraintsData(Collection<SetpointConstraintsDataType> values) {
        if (values!= null) {
            getSetpointConstraintsData().addAll(values);
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
        if (draftCopy instanceof SetpointConstraintsListDataType) {
            final SetpointConstraintsListDataType copy = ((SetpointConstraintsListDataType) draftCopy);
            {
                Boolean setpointConstraintsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty())));
                if (setpointConstraintsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SetpointConstraintsDataType> sourceSetpointConstraintsData;
                    sourceSetpointConstraintsData = (((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty()))?this.getSetpointConstraintsData():null);
                    @SuppressWarnings("unchecked")
                    List<SetpointConstraintsDataType> copySetpointConstraintsData = ((List<SetpointConstraintsDataType> ) strategy.copy(LocatorUtils.property(locator, "setpointConstraintsData", sourceSetpointConstraintsData), sourceSetpointConstraintsData, ((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty()))));
                    copy.setpointConstraintsData = null;
                    if (copySetpointConstraintsData!= null) {
                        List<SetpointConstraintsDataType> uniqueSetpointConstraintsDatal = copy.getSetpointConstraintsData();
                        uniqueSetpointConstraintsDatal.addAll(copySetpointConstraintsData);
                    }
                } else {
                    if (setpointConstraintsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointConstraintsData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SetpointConstraintsListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetpointConstraintsListDataType that = ((SetpointConstraintsListDataType) object);
        {
            List<SetpointConstraintsDataType> leftSetpointConstraintsData;
            leftSetpointConstraintsData = (((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty()))?this.getSetpointConstraintsData():null);
            List<SetpointConstraintsDataType> rightSetpointConstraintsData;
            rightSetpointConstraintsData = (((that.setpointConstraintsData!= null)&&(!that.setpointConstraintsData.isEmpty()))?that.getSetpointConstraintsData():null);
            if ((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty())) {
                if ((that.setpointConstraintsData!= null)&&(!that.setpointConstraintsData.isEmpty())) {
                    if (!leftSetpointConstraintsData.equals(rightSetpointConstraintsData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.setpointConstraintsData!= null)&&(!that.setpointConstraintsData.isEmpty())) {
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
            List<SetpointConstraintsDataType> theSetpointConstraintsData;
            theSetpointConstraintsData = (((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty()))?this.getSetpointConstraintsData():null);
            if ((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty())) {
                currentHashCode += theSetpointConstraintsData.hashCode();
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
            List<SetpointConstraintsDataType> theSetpointConstraintsData;
            theSetpointConstraintsData = (((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty()))?this.getSetpointConstraintsData():null);
            strategy.appendField(locator, this, "setpointConstraintsData", buffer, theSetpointConstraintsData, ((this.setpointConstraintsData!= null)&&(!this.setpointConstraintsData.isEmpty())));
        }
        return buffer;
    }

}
