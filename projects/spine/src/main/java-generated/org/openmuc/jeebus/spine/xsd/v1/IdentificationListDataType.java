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
 * <p>Java class for IdentificationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}identificationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationListDataType", propOrder = {
    "identificationData"
})
public class IdentificationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<IdentificationDataType> identificationData;

    /**
     * Default no-arg constructor
     * 
     */
    public IdentificationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IdentificationListDataType(final List<IdentificationDataType> identificationData) {
        this.identificationData = identificationData;
    }

    /**
     * Gets the value of the identificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationDataType }
     * 
     * 
     */
    public List<IdentificationDataType> getIdentificationData() {
        if (identificationData == null) {
            identificationData = new ArrayList<IdentificationDataType>();
        }
        return this.identificationData;
    }

    /**
     * Adds objects to the list of IdentificationData using add method
     * 
     * @param values
     *     objects to add to the list IdentificationData
     * @return
     *     The class instance
     */
    public IdentificationListDataType withIdentificationData(IdentificationDataType... values) {
        if (values!= null) {
            for (IdentificationDataType value: values) {
                getIdentificationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of IdentificationData using addAll method
     * 
     * @param values
     *     objects to add to the list IdentificationData
     * @return
     *     The class instance
     */
    public IdentificationListDataType withIdentificationData(Collection<IdentificationDataType> values) {
        if (values!= null) {
            getIdentificationData().addAll(values);
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
        if (draftCopy instanceof IdentificationListDataType) {
            final IdentificationListDataType copy = ((IdentificationListDataType) draftCopy);
            {
                Boolean identificationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.identificationData!= null)&&(!this.identificationData.isEmpty())));
                if (identificationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<IdentificationDataType> sourceIdentificationData;
                    sourceIdentificationData = (((this.identificationData!= null)&&(!this.identificationData.isEmpty()))?this.getIdentificationData():null);
                    @SuppressWarnings("unchecked")
                    List<IdentificationDataType> copyIdentificationData = ((List<IdentificationDataType> ) strategy.copy(LocatorUtils.property(locator, "identificationData", sourceIdentificationData), sourceIdentificationData, ((this.identificationData!= null)&&(!this.identificationData.isEmpty()))));
                    copy.identificationData = null;
                    if (copyIdentificationData!= null) {
                        List<IdentificationDataType> uniqueIdentificationDatal = copy.getIdentificationData();
                        uniqueIdentificationDatal.addAll(copyIdentificationData);
                    }
                } else {
                    if (identificationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identificationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new IdentificationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IdentificationListDataType that = ((IdentificationListDataType) object);
        {
            List<IdentificationDataType> leftIdentificationData;
            leftIdentificationData = (((this.identificationData!= null)&&(!this.identificationData.isEmpty()))?this.getIdentificationData():null);
            List<IdentificationDataType> rightIdentificationData;
            rightIdentificationData = (((that.identificationData!= null)&&(!that.identificationData.isEmpty()))?that.getIdentificationData():null);
            if ((this.identificationData!= null)&&(!this.identificationData.isEmpty())) {
                if ((that.identificationData!= null)&&(!that.identificationData.isEmpty())) {
                    if (!leftIdentificationData.equals(rightIdentificationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.identificationData!= null)&&(!that.identificationData.isEmpty())) {
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
            List<IdentificationDataType> theIdentificationData;
            theIdentificationData = (((this.identificationData!= null)&&(!this.identificationData.isEmpty()))?this.getIdentificationData():null);
            if ((this.identificationData!= null)&&(!this.identificationData.isEmpty())) {
                currentHashCode += theIdentificationData.hashCode();
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
            List<IdentificationDataType> theIdentificationData;
            theIdentificationData = (((this.identificationData!= null)&&(!this.identificationData.isEmpty()))?this.getIdentificationData():null);
            strategy.appendField(locator, this, "identificationData", buffer, theIdentificationData, ((this.identificationData!= null)&&(!this.identificationData.isEmpty())));
        }
        return buffer;
    }

}
