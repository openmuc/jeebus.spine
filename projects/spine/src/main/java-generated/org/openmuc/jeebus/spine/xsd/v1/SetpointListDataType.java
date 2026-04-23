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
 * <p>Java class for SetpointListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetpointListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}setpointData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetpointListDataType", propOrder = {
    "setpointData"
})
public class SetpointListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SetpointDataType> setpointData;

    /**
     * Default no-arg constructor
     * 
     */
    public SetpointListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetpointListDataType(final List<SetpointDataType> setpointData) {
        this.setpointData = setpointData;
    }

    /**
     * Gets the value of the setpointData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the setpointData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetpointData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetpointDataType }
     * 
     * 
     */
    public List<SetpointDataType> getSetpointData() {
        if (setpointData == null) {
            setpointData = new ArrayList<SetpointDataType>();
        }
        return this.setpointData;
    }

    /**
     * Adds objects to the list of SetpointData using add method
     * 
     * @param values
     *     objects to add to the list SetpointData
     * @return
     *     The class instance
     */
    public SetpointListDataType withSetpointData(SetpointDataType... values) {
        if (values!= null) {
            for (SetpointDataType value: values) {
                getSetpointData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SetpointData using addAll method
     * 
     * @param values
     *     objects to add to the list SetpointData
     * @return
     *     The class instance
     */
    public SetpointListDataType withSetpointData(Collection<SetpointDataType> values) {
        if (values!= null) {
            getSetpointData().addAll(values);
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
        if (draftCopy instanceof SetpointListDataType) {
            final SetpointListDataType copy = ((SetpointListDataType) draftCopy);
            {
                Boolean setpointDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.setpointData!= null)&&(!this.setpointData.isEmpty())));
                if (setpointDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SetpointDataType> sourceSetpointData;
                    sourceSetpointData = (((this.setpointData!= null)&&(!this.setpointData.isEmpty()))?this.getSetpointData():null);
                    @SuppressWarnings("unchecked")
                    List<SetpointDataType> copySetpointData = ((List<SetpointDataType> ) strategy.copy(LocatorUtils.property(locator, "setpointData", sourceSetpointData), sourceSetpointData, ((this.setpointData!= null)&&(!this.setpointData.isEmpty()))));
                    copy.setpointData = null;
                    if (copySetpointData!= null) {
                        List<SetpointDataType> uniqueSetpointDatal = copy.getSetpointData();
                        uniqueSetpointDatal.addAll(copySetpointData);
                    }
                } else {
                    if (setpointDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.setpointData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SetpointListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SetpointListDataType that = ((SetpointListDataType) object);
        {
            List<SetpointDataType> leftSetpointData;
            leftSetpointData = (((this.setpointData!= null)&&(!this.setpointData.isEmpty()))?this.getSetpointData():null);
            List<SetpointDataType> rightSetpointData;
            rightSetpointData = (((that.setpointData!= null)&&(!that.setpointData.isEmpty()))?that.getSetpointData():null);
            if ((this.setpointData!= null)&&(!this.setpointData.isEmpty())) {
                if ((that.setpointData!= null)&&(!that.setpointData.isEmpty())) {
                    if (!leftSetpointData.equals(rightSetpointData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.setpointData!= null)&&(!that.setpointData.isEmpty())) {
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
            List<SetpointDataType> theSetpointData;
            theSetpointData = (((this.setpointData!= null)&&(!this.setpointData.isEmpty()))?this.getSetpointData():null);
            if ((this.setpointData!= null)&&(!this.setpointData.isEmpty())) {
                currentHashCode += theSetpointData.hashCode();
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
            List<SetpointDataType> theSetpointData;
            theSetpointData = (((this.setpointData!= null)&&(!this.setpointData.isEmpty()))?this.getSetpointData():null);
            strategy.appendField(locator, this, "setpointData", buffer, theSetpointData, ((this.setpointData!= null)&&(!this.setpointData.isEmpty())));
        }
        return buffer;
    }

}
