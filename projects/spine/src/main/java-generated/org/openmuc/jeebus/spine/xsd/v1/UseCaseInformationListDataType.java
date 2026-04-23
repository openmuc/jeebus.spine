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
 * <p>Java class for UseCaseInformationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseCaseInformationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}useCaseInformationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseCaseInformationListDataType", propOrder = {
    "useCaseInformationData"
})
public class UseCaseInformationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<UseCaseInformationDataType> useCaseInformationData;

    /**
     * Default no-arg constructor
     * 
     */
    public UseCaseInformationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UseCaseInformationListDataType(final List<UseCaseInformationDataType> useCaseInformationData) {
        this.useCaseInformationData = useCaseInformationData;
    }

    /**
     * Gets the value of the useCaseInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the useCaseInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseCaseInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UseCaseInformationDataType }
     * 
     * 
     */
    public List<UseCaseInformationDataType> getUseCaseInformationData() {
        if (useCaseInformationData == null) {
            useCaseInformationData = new ArrayList<UseCaseInformationDataType>();
        }
        return this.useCaseInformationData;
    }

    /**
     * Adds objects to the list of UseCaseInformationData using add method
     * 
     * @param values
     *     objects to add to the list UseCaseInformationData
     * @return
     *     The class instance
     */
    public UseCaseInformationListDataType withUseCaseInformationData(UseCaseInformationDataType... values) {
        if (values!= null) {
            for (UseCaseInformationDataType value: values) {
                getUseCaseInformationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of UseCaseInformationData using addAll method
     * 
     * @param values
     *     objects to add to the list UseCaseInformationData
     * @return
     *     The class instance
     */
    public UseCaseInformationListDataType withUseCaseInformationData(Collection<UseCaseInformationDataType> values) {
        if (values!= null) {
            getUseCaseInformationData().addAll(values);
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
        if (draftCopy instanceof UseCaseInformationListDataType) {
            final UseCaseInformationListDataType copy = ((UseCaseInformationListDataType) draftCopy);
            {
                Boolean useCaseInformationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty())));
                if (useCaseInformationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UseCaseInformationDataType> sourceUseCaseInformationData;
                    sourceUseCaseInformationData = (((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty()))?this.getUseCaseInformationData():null);
                    @SuppressWarnings("unchecked")
                    List<UseCaseInformationDataType> copyUseCaseInformationData = ((List<UseCaseInformationDataType> ) strategy.copy(LocatorUtils.property(locator, "useCaseInformationData", sourceUseCaseInformationData), sourceUseCaseInformationData, ((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty()))));
                    copy.useCaseInformationData = null;
                    if (copyUseCaseInformationData!= null) {
                        List<UseCaseInformationDataType> uniqueUseCaseInformationDatal = copy.getUseCaseInformationData();
                        uniqueUseCaseInformationDatal.addAll(copyUseCaseInformationData);
                    }
                } else {
                    if (useCaseInformationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.useCaseInformationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new UseCaseInformationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UseCaseInformationListDataType that = ((UseCaseInformationListDataType) object);
        {
            List<UseCaseInformationDataType> leftUseCaseInformationData;
            leftUseCaseInformationData = (((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty()))?this.getUseCaseInformationData():null);
            List<UseCaseInformationDataType> rightUseCaseInformationData;
            rightUseCaseInformationData = (((that.useCaseInformationData!= null)&&(!that.useCaseInformationData.isEmpty()))?that.getUseCaseInformationData():null);
            if ((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty())) {
                if ((that.useCaseInformationData!= null)&&(!that.useCaseInformationData.isEmpty())) {
                    if (!leftUseCaseInformationData.equals(rightUseCaseInformationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.useCaseInformationData!= null)&&(!that.useCaseInformationData.isEmpty())) {
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
            List<UseCaseInformationDataType> theUseCaseInformationData;
            theUseCaseInformationData = (((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty()))?this.getUseCaseInformationData():null);
            if ((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty())) {
                currentHashCode += theUseCaseInformationData.hashCode();
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
            List<UseCaseInformationDataType> theUseCaseInformationData;
            theUseCaseInformationData = (((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty()))?this.getUseCaseInformationData():null);
            strategy.appendField(locator, this, "useCaseInformationData", buffer, theUseCaseInformationData, ((this.useCaseInformationData!= null)&&(!this.useCaseInformationData.isEmpty())));
        }
        return buffer;
    }

}
