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
 * <p>Java class for SpecificationVersionListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificationVersionListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}specificationVersionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationVersionListDataType", propOrder = {
    "specificationVersionData"
})
public class SpecificationVersionListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SpecificationVersionDataType> specificationVersionData;

    /**
     * Default no-arg constructor
     * 
     */
    public SpecificationVersionListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SpecificationVersionListDataType(final List<SpecificationVersionDataType> specificationVersionData) {
        this.specificationVersionData = specificationVersionData;
    }

    /**
     * Gets the value of the specificationVersionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificationVersionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationVersionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationVersionDataType }
     * 
     * 
     */
    public List<SpecificationVersionDataType> getSpecificationVersionData() {
        if (specificationVersionData == null) {
            specificationVersionData = new ArrayList<SpecificationVersionDataType>();
        }
        return this.specificationVersionData;
    }

    /**
     * Adds objects to the list of SpecificationVersionData using add method
     * 
     * @param values
     *     objects to add to the list SpecificationVersionData
     * @return
     *     The class instance
     */
    public SpecificationVersionListDataType withSpecificationVersionData(SpecificationVersionDataType... values) {
        if (values!= null) {
            for (SpecificationVersionDataType value: values) {
                getSpecificationVersionData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SpecificationVersionData using addAll method
     * 
     * @param values
     *     objects to add to the list SpecificationVersionData
     * @return
     *     The class instance
     */
    public SpecificationVersionListDataType withSpecificationVersionData(Collection<SpecificationVersionDataType> values) {
        if (values!= null) {
            getSpecificationVersionData().addAll(values);
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
        if (draftCopy instanceof SpecificationVersionListDataType) {
            final SpecificationVersionListDataType copy = ((SpecificationVersionListDataType) draftCopy);
            {
                Boolean specificationVersionDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty())));
                if (specificationVersionDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SpecificationVersionDataType> sourceSpecificationVersionData;
                    sourceSpecificationVersionData = (((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty()))?this.getSpecificationVersionData():null);
                    @SuppressWarnings("unchecked")
                    List<SpecificationVersionDataType> copySpecificationVersionData = ((List<SpecificationVersionDataType> ) strategy.copy(LocatorUtils.property(locator, "specificationVersionData", sourceSpecificationVersionData), sourceSpecificationVersionData, ((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty()))));
                    copy.specificationVersionData = null;
                    if (copySpecificationVersionData!= null) {
                        List<SpecificationVersionDataType> uniqueSpecificationVersionDatal = copy.getSpecificationVersionData();
                        uniqueSpecificationVersionDatal.addAll(copySpecificationVersionData);
                    }
                } else {
                    if (specificationVersionDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationVersionData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SpecificationVersionListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SpecificationVersionListDataType that = ((SpecificationVersionListDataType) object);
        {
            List<SpecificationVersionDataType> leftSpecificationVersionData;
            leftSpecificationVersionData = (((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty()))?this.getSpecificationVersionData():null);
            List<SpecificationVersionDataType> rightSpecificationVersionData;
            rightSpecificationVersionData = (((that.specificationVersionData!= null)&&(!that.specificationVersionData.isEmpty()))?that.getSpecificationVersionData():null);
            if ((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty())) {
                if ((that.specificationVersionData!= null)&&(!that.specificationVersionData.isEmpty())) {
                    if (!leftSpecificationVersionData.equals(rightSpecificationVersionData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.specificationVersionData!= null)&&(!that.specificationVersionData.isEmpty())) {
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
            List<SpecificationVersionDataType> theSpecificationVersionData;
            theSpecificationVersionData = (((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty()))?this.getSpecificationVersionData():null);
            if ((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty())) {
                currentHashCode += theSpecificationVersionData.hashCode();
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
            List<SpecificationVersionDataType> theSpecificationVersionData;
            theSpecificationVersionData = (((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty()))?this.getSpecificationVersionData():null);
            strategy.appendField(locator, this, "specificationVersionData", buffer, theSpecificationVersionData, ((this.specificationVersionData!= null)&&(!this.specificationVersionData.isEmpty())));
        }
        return buffer;
    }

}
