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
 * <p>Java class for SessionMeasurementRelationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionMeasurementRelationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}sessionMeasurementRelationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionMeasurementRelationListDataType", propOrder = {
    "sessionMeasurementRelationData"
})
public class SessionMeasurementRelationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SessionMeasurementRelationDataType> sessionMeasurementRelationData;

    /**
     * Default no-arg constructor
     * 
     */
    public SessionMeasurementRelationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SessionMeasurementRelationListDataType(final List<SessionMeasurementRelationDataType> sessionMeasurementRelationData) {
        this.sessionMeasurementRelationData = sessionMeasurementRelationData;
    }

    /**
     * Gets the value of the sessionMeasurementRelationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sessionMeasurementRelationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionMeasurementRelationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionMeasurementRelationDataType }
     * 
     * 
     */
    public List<SessionMeasurementRelationDataType> getSessionMeasurementRelationData() {
        if (sessionMeasurementRelationData == null) {
            sessionMeasurementRelationData = new ArrayList<SessionMeasurementRelationDataType>();
        }
        return this.sessionMeasurementRelationData;
    }

    /**
     * Adds objects to the list of SessionMeasurementRelationData using add method
     * 
     * @param values
     *     objects to add to the list SessionMeasurementRelationData
     * @return
     *     The class instance
     */
    public SessionMeasurementRelationListDataType withSessionMeasurementRelationData(SessionMeasurementRelationDataType... values) {
        if (values!= null) {
            for (SessionMeasurementRelationDataType value: values) {
                getSessionMeasurementRelationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SessionMeasurementRelationData using addAll method
     * 
     * @param values
     *     objects to add to the list SessionMeasurementRelationData
     * @return
     *     The class instance
     */
    public SessionMeasurementRelationListDataType withSessionMeasurementRelationData(Collection<SessionMeasurementRelationDataType> values) {
        if (values!= null) {
            getSessionMeasurementRelationData().addAll(values);
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
        if (draftCopy instanceof SessionMeasurementRelationListDataType) {
            final SessionMeasurementRelationListDataType copy = ((SessionMeasurementRelationListDataType) draftCopy);
            {
                Boolean sessionMeasurementRelationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty())));
                if (sessionMeasurementRelationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SessionMeasurementRelationDataType> sourceSessionMeasurementRelationData;
                    sourceSessionMeasurementRelationData = (((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty()))?this.getSessionMeasurementRelationData():null);
                    @SuppressWarnings("unchecked")
                    List<SessionMeasurementRelationDataType> copySessionMeasurementRelationData = ((List<SessionMeasurementRelationDataType> ) strategy.copy(LocatorUtils.property(locator, "sessionMeasurementRelationData", sourceSessionMeasurementRelationData), sourceSessionMeasurementRelationData, ((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty()))));
                    copy.sessionMeasurementRelationData = null;
                    if (copySessionMeasurementRelationData!= null) {
                        List<SessionMeasurementRelationDataType> uniqueSessionMeasurementRelationDatal = copy.getSessionMeasurementRelationData();
                        uniqueSessionMeasurementRelationDatal.addAll(copySessionMeasurementRelationData);
                    }
                } else {
                    if (sessionMeasurementRelationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionMeasurementRelationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SessionMeasurementRelationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SessionMeasurementRelationListDataType that = ((SessionMeasurementRelationListDataType) object);
        {
            List<SessionMeasurementRelationDataType> leftSessionMeasurementRelationData;
            leftSessionMeasurementRelationData = (((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty()))?this.getSessionMeasurementRelationData():null);
            List<SessionMeasurementRelationDataType> rightSessionMeasurementRelationData;
            rightSessionMeasurementRelationData = (((that.sessionMeasurementRelationData!= null)&&(!that.sessionMeasurementRelationData.isEmpty()))?that.getSessionMeasurementRelationData():null);
            if ((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty())) {
                if ((that.sessionMeasurementRelationData!= null)&&(!that.sessionMeasurementRelationData.isEmpty())) {
                    if (!leftSessionMeasurementRelationData.equals(rightSessionMeasurementRelationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.sessionMeasurementRelationData!= null)&&(!that.sessionMeasurementRelationData.isEmpty())) {
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
            List<SessionMeasurementRelationDataType> theSessionMeasurementRelationData;
            theSessionMeasurementRelationData = (((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty()))?this.getSessionMeasurementRelationData():null);
            if ((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty())) {
                currentHashCode += theSessionMeasurementRelationData.hashCode();
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
            List<SessionMeasurementRelationDataType> theSessionMeasurementRelationData;
            theSessionMeasurementRelationData = (((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty()))?this.getSessionMeasurementRelationData():null);
            strategy.appendField(locator, this, "sessionMeasurementRelationData", buffer, theSessionMeasurementRelationData, ((this.sessionMeasurementRelationData!= null)&&(!this.sessionMeasurementRelationData.isEmpty())));
        }
        return buffer;
    }

}
