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
 * <p>Java class for OperatingConstraintsResumeImplicationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingConstraintsResumeImplicationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}operatingConstraintsResumeImplicationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingConstraintsResumeImplicationListDataType", propOrder = {
    "operatingConstraintsResumeImplicationData"
})
public class OperatingConstraintsResumeImplicationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<OperatingConstraintsResumeImplicationDataType> operatingConstraintsResumeImplicationData;

    /**
     * Default no-arg constructor
     * 
     */
    public OperatingConstraintsResumeImplicationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OperatingConstraintsResumeImplicationListDataType(final List<OperatingConstraintsResumeImplicationDataType> operatingConstraintsResumeImplicationData) {
        this.operatingConstraintsResumeImplicationData = operatingConstraintsResumeImplicationData;
    }

    /**
     * Gets the value of the operatingConstraintsResumeImplicationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operatingConstraintsResumeImplicationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingConstraintsResumeImplicationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingConstraintsResumeImplicationDataType }
     * 
     * 
     */
    public List<OperatingConstraintsResumeImplicationDataType> getOperatingConstraintsResumeImplicationData() {
        if (operatingConstraintsResumeImplicationData == null) {
            operatingConstraintsResumeImplicationData = new ArrayList<OperatingConstraintsResumeImplicationDataType>();
        }
        return this.operatingConstraintsResumeImplicationData;
    }

    /**
     * Adds objects to the list of OperatingConstraintsResumeImplicationData using add method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsResumeImplicationData
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationListDataType withOperatingConstraintsResumeImplicationData(OperatingConstraintsResumeImplicationDataType... values) {
        if (values!= null) {
            for (OperatingConstraintsResumeImplicationDataType value: values) {
                getOperatingConstraintsResumeImplicationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperatingConstraintsResumeImplicationData using addAll method
     * 
     * @param values
     *     objects to add to the list OperatingConstraintsResumeImplicationData
     * @return
     *     The class instance
     */
    public OperatingConstraintsResumeImplicationListDataType withOperatingConstraintsResumeImplicationData(Collection<OperatingConstraintsResumeImplicationDataType> values) {
        if (values!= null) {
            getOperatingConstraintsResumeImplicationData().addAll(values);
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
        if (draftCopy instanceof OperatingConstraintsResumeImplicationListDataType) {
            final OperatingConstraintsResumeImplicationListDataType copy = ((OperatingConstraintsResumeImplicationListDataType) draftCopy);
            {
                Boolean operatingConstraintsResumeImplicationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty())));
                if (operatingConstraintsResumeImplicationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OperatingConstraintsResumeImplicationDataType> sourceOperatingConstraintsResumeImplicationData;
                    sourceOperatingConstraintsResumeImplicationData = (((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty()))?this.getOperatingConstraintsResumeImplicationData():null);
                    @SuppressWarnings("unchecked")
                    List<OperatingConstraintsResumeImplicationDataType> copyOperatingConstraintsResumeImplicationData = ((List<OperatingConstraintsResumeImplicationDataType> ) strategy.copy(LocatorUtils.property(locator, "operatingConstraintsResumeImplicationData", sourceOperatingConstraintsResumeImplicationData), sourceOperatingConstraintsResumeImplicationData, ((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty()))));
                    copy.operatingConstraintsResumeImplicationData = null;
                    if (copyOperatingConstraintsResumeImplicationData!= null) {
                        List<OperatingConstraintsResumeImplicationDataType> uniqueOperatingConstraintsResumeImplicationDatal = copy.getOperatingConstraintsResumeImplicationData();
                        uniqueOperatingConstraintsResumeImplicationDatal.addAll(copyOperatingConstraintsResumeImplicationData);
                    }
                } else {
                    if (operatingConstraintsResumeImplicationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operatingConstraintsResumeImplicationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new OperatingConstraintsResumeImplicationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OperatingConstraintsResumeImplicationListDataType that = ((OperatingConstraintsResumeImplicationListDataType) object);
        {
            List<OperatingConstraintsResumeImplicationDataType> leftOperatingConstraintsResumeImplicationData;
            leftOperatingConstraintsResumeImplicationData = (((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty()))?this.getOperatingConstraintsResumeImplicationData():null);
            List<OperatingConstraintsResumeImplicationDataType> rightOperatingConstraintsResumeImplicationData;
            rightOperatingConstraintsResumeImplicationData = (((that.operatingConstraintsResumeImplicationData!= null)&&(!that.operatingConstraintsResumeImplicationData.isEmpty()))?that.getOperatingConstraintsResumeImplicationData():null);
            if ((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty())) {
                if ((that.operatingConstraintsResumeImplicationData!= null)&&(!that.operatingConstraintsResumeImplicationData.isEmpty())) {
                    if (!leftOperatingConstraintsResumeImplicationData.equals(rightOperatingConstraintsResumeImplicationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operatingConstraintsResumeImplicationData!= null)&&(!that.operatingConstraintsResumeImplicationData.isEmpty())) {
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
            List<OperatingConstraintsResumeImplicationDataType> theOperatingConstraintsResumeImplicationData;
            theOperatingConstraintsResumeImplicationData = (((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty()))?this.getOperatingConstraintsResumeImplicationData():null);
            if ((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty())) {
                currentHashCode += theOperatingConstraintsResumeImplicationData.hashCode();
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
            List<OperatingConstraintsResumeImplicationDataType> theOperatingConstraintsResumeImplicationData;
            theOperatingConstraintsResumeImplicationData = (((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty()))?this.getOperatingConstraintsResumeImplicationData():null);
            strategy.appendField(locator, this, "operatingConstraintsResumeImplicationData", buffer, theOperatingConstraintsResumeImplicationData, ((this.operatingConstraintsResumeImplicationData!= null)&&(!this.operatingConstraintsResumeImplicationData.isEmpty())));
        }
        return buffer;
    }

}
