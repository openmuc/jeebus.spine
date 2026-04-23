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
 * <p>Java class for StateInformationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateInformationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}stateInformationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateInformationListDataType", propOrder = {
    "stateInformationData"
})
public class StateInformationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<StateInformationDataType> stateInformationData;

    /**
     * Default no-arg constructor
     * 
     */
    public StateInformationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StateInformationListDataType(final List<StateInformationDataType> stateInformationData) {
        this.stateInformationData = stateInformationData;
    }

    /**
     * Gets the value of the stateInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stateInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateInformationDataType }
     * 
     * 
     */
    public List<StateInformationDataType> getStateInformationData() {
        if (stateInformationData == null) {
            stateInformationData = new ArrayList<StateInformationDataType>();
        }
        return this.stateInformationData;
    }

    /**
     * Adds objects to the list of StateInformationData using add method
     * 
     * @param values
     *     objects to add to the list StateInformationData
     * @return
     *     The class instance
     */
    public StateInformationListDataType withStateInformationData(StateInformationDataType... values) {
        if (values!= null) {
            for (StateInformationDataType value: values) {
                getStateInformationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of StateInformationData using addAll method
     * 
     * @param values
     *     objects to add to the list StateInformationData
     * @return
     *     The class instance
     */
    public StateInformationListDataType withStateInformationData(Collection<StateInformationDataType> values) {
        if (values!= null) {
            getStateInformationData().addAll(values);
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
        if (draftCopy instanceof StateInformationListDataType) {
            final StateInformationListDataType copy = ((StateInformationListDataType) draftCopy);
            {
                Boolean stateInformationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty())));
                if (stateInformationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<StateInformationDataType> sourceStateInformationData;
                    sourceStateInformationData = (((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty()))?this.getStateInformationData():null);
                    @SuppressWarnings("unchecked")
                    List<StateInformationDataType> copyStateInformationData = ((List<StateInformationDataType> ) strategy.copy(LocatorUtils.property(locator, "stateInformationData", sourceStateInformationData), sourceStateInformationData, ((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty()))));
                    copy.stateInformationData = null;
                    if (copyStateInformationData!= null) {
                        List<StateInformationDataType> uniqueStateInformationDatal = copy.getStateInformationData();
                        uniqueStateInformationDatal.addAll(copyStateInformationData);
                    }
                } else {
                    if (stateInformationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stateInformationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new StateInformationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StateInformationListDataType that = ((StateInformationListDataType) object);
        {
            List<StateInformationDataType> leftStateInformationData;
            leftStateInformationData = (((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty()))?this.getStateInformationData():null);
            List<StateInformationDataType> rightStateInformationData;
            rightStateInformationData = (((that.stateInformationData!= null)&&(!that.stateInformationData.isEmpty()))?that.getStateInformationData():null);
            if ((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty())) {
                if ((that.stateInformationData!= null)&&(!that.stateInformationData.isEmpty())) {
                    if (!leftStateInformationData.equals(rightStateInformationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.stateInformationData!= null)&&(!that.stateInformationData.isEmpty())) {
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
            List<StateInformationDataType> theStateInformationData;
            theStateInformationData = (((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty()))?this.getStateInformationData():null);
            if ((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty())) {
                currentHashCode += theStateInformationData.hashCode();
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
            List<StateInformationDataType> theStateInformationData;
            theStateInformationData = (((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty()))?this.getStateInformationData():null);
            strategy.appendField(locator, this, "stateInformationData", buffer, theStateInformationData, ((this.stateInformationData!= null)&&(!this.stateInformationData.isEmpty())));
        }
        return buffer;
    }

}
