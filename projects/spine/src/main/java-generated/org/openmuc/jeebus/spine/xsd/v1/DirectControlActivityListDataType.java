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
 * <p>Java class for DirectControlActivityListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectControlActivityListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}directControlActivityData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectControlActivityListDataType", propOrder = {
    "directControlActivityData"
})
public class DirectControlActivityListDataType implements Cloneable, CopyTo, ToString
{

    protected List<DirectControlActivityDataType> directControlActivityData;

    /**
     * Default no-arg constructor
     * 
     */
    public DirectControlActivityListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public DirectControlActivityListDataType(final List<DirectControlActivityDataType> directControlActivityData) {
        this.directControlActivityData = directControlActivityData;
    }

    /**
     * Gets the value of the directControlActivityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the directControlActivityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectControlActivityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectControlActivityDataType }
     * 
     * 
     */
    public List<DirectControlActivityDataType> getDirectControlActivityData() {
        if (directControlActivityData == null) {
            directControlActivityData = new ArrayList<DirectControlActivityDataType>();
        }
        return this.directControlActivityData;
    }

    /**
     * Adds objects to the list of DirectControlActivityData using add method
     * 
     * @param values
     *     objects to add to the list DirectControlActivityData
     * @return
     *     The class instance
     */
    public DirectControlActivityListDataType withDirectControlActivityData(DirectControlActivityDataType... values) {
        if (values!= null) {
            for (DirectControlActivityDataType value: values) {
                getDirectControlActivityData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of DirectControlActivityData using addAll method
     * 
     * @param values
     *     objects to add to the list DirectControlActivityData
     * @return
     *     The class instance
     */
    public DirectControlActivityListDataType withDirectControlActivityData(Collection<DirectControlActivityDataType> values) {
        if (values!= null) {
            getDirectControlActivityData().addAll(values);
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
        if (draftCopy instanceof DirectControlActivityListDataType) {
            final DirectControlActivityListDataType copy = ((DirectControlActivityListDataType) draftCopy);
            {
                Boolean directControlActivityDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty())));
                if (directControlActivityDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DirectControlActivityDataType> sourceDirectControlActivityData;
                    sourceDirectControlActivityData = (((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty()))?this.getDirectControlActivityData():null);
                    @SuppressWarnings("unchecked")
                    List<DirectControlActivityDataType> copyDirectControlActivityData = ((List<DirectControlActivityDataType> ) strategy.copy(LocatorUtils.property(locator, "directControlActivityData", sourceDirectControlActivityData), sourceDirectControlActivityData, ((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty()))));
                    copy.directControlActivityData = null;
                    if (copyDirectControlActivityData!= null) {
                        List<DirectControlActivityDataType> uniqueDirectControlActivityDatal = copy.getDirectControlActivityData();
                        uniqueDirectControlActivityDatal.addAll(copyDirectControlActivityData);
                    }
                } else {
                    if (directControlActivityDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.directControlActivityData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new DirectControlActivityListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectControlActivityListDataType that = ((DirectControlActivityListDataType) object);
        {
            List<DirectControlActivityDataType> leftDirectControlActivityData;
            leftDirectControlActivityData = (((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty()))?this.getDirectControlActivityData():null);
            List<DirectControlActivityDataType> rightDirectControlActivityData;
            rightDirectControlActivityData = (((that.directControlActivityData!= null)&&(!that.directControlActivityData.isEmpty()))?that.getDirectControlActivityData():null);
            if ((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty())) {
                if ((that.directControlActivityData!= null)&&(!that.directControlActivityData.isEmpty())) {
                    if (!leftDirectControlActivityData.equals(rightDirectControlActivityData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.directControlActivityData!= null)&&(!that.directControlActivityData.isEmpty())) {
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
            List<DirectControlActivityDataType> theDirectControlActivityData;
            theDirectControlActivityData = (((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty()))?this.getDirectControlActivityData():null);
            if ((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty())) {
                currentHashCode += theDirectControlActivityData.hashCode();
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
            List<DirectControlActivityDataType> theDirectControlActivityData;
            theDirectControlActivityData = (((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty()))?this.getDirectControlActivityData():null);
            strategy.appendField(locator, this, "directControlActivityData", buffer, theDirectControlActivityData, ((this.directControlActivityData!= null)&&(!this.directControlActivityData.isEmpty())));
        }
        return buffer;
    }

}
