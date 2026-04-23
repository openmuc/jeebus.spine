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
 * <p>Java class for SessionIdentificationListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionIdentificationListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}sessionIdentificationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionIdentificationListDataType", propOrder = {
    "sessionIdentificationData"
})
public class SessionIdentificationListDataType implements Cloneable, CopyTo, ToString
{

    protected List<SessionIdentificationDataType> sessionIdentificationData;

    /**
     * Default no-arg constructor
     * 
     */
    public SessionIdentificationListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SessionIdentificationListDataType(final List<SessionIdentificationDataType> sessionIdentificationData) {
        this.sessionIdentificationData = sessionIdentificationData;
    }

    /**
     * Gets the value of the sessionIdentificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sessionIdentificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionIdentificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionIdentificationDataType }
     * 
     * 
     */
    public List<SessionIdentificationDataType> getSessionIdentificationData() {
        if (sessionIdentificationData == null) {
            sessionIdentificationData = new ArrayList<SessionIdentificationDataType>();
        }
        return this.sessionIdentificationData;
    }

    /**
     * Adds objects to the list of SessionIdentificationData using add method
     * 
     * @param values
     *     objects to add to the list SessionIdentificationData
     * @return
     *     The class instance
     */
    public SessionIdentificationListDataType withSessionIdentificationData(SessionIdentificationDataType... values) {
        if (values!= null) {
            for (SessionIdentificationDataType value: values) {
                getSessionIdentificationData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SessionIdentificationData using addAll method
     * 
     * @param values
     *     objects to add to the list SessionIdentificationData
     * @return
     *     The class instance
     */
    public SessionIdentificationListDataType withSessionIdentificationData(Collection<SessionIdentificationDataType> values) {
        if (values!= null) {
            getSessionIdentificationData().addAll(values);
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
        if (draftCopy instanceof SessionIdentificationListDataType) {
            final SessionIdentificationListDataType copy = ((SessionIdentificationListDataType) draftCopy);
            {
                Boolean sessionIdentificationDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty())));
                if (sessionIdentificationDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SessionIdentificationDataType> sourceSessionIdentificationData;
                    sourceSessionIdentificationData = (((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty()))?this.getSessionIdentificationData():null);
                    @SuppressWarnings("unchecked")
                    List<SessionIdentificationDataType> copySessionIdentificationData = ((List<SessionIdentificationDataType> ) strategy.copy(LocatorUtils.property(locator, "sessionIdentificationData", sourceSessionIdentificationData), sourceSessionIdentificationData, ((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty()))));
                    copy.sessionIdentificationData = null;
                    if (copySessionIdentificationData!= null) {
                        List<SessionIdentificationDataType> uniqueSessionIdentificationDatal = copy.getSessionIdentificationData();
                        uniqueSessionIdentificationDatal.addAll(copySessionIdentificationData);
                    }
                } else {
                    if (sessionIdentificationDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sessionIdentificationData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SessionIdentificationListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SessionIdentificationListDataType that = ((SessionIdentificationListDataType) object);
        {
            List<SessionIdentificationDataType> leftSessionIdentificationData;
            leftSessionIdentificationData = (((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty()))?this.getSessionIdentificationData():null);
            List<SessionIdentificationDataType> rightSessionIdentificationData;
            rightSessionIdentificationData = (((that.sessionIdentificationData!= null)&&(!that.sessionIdentificationData.isEmpty()))?that.getSessionIdentificationData():null);
            if ((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty())) {
                if ((that.sessionIdentificationData!= null)&&(!that.sessionIdentificationData.isEmpty())) {
                    if (!leftSessionIdentificationData.equals(rightSessionIdentificationData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.sessionIdentificationData!= null)&&(!that.sessionIdentificationData.isEmpty())) {
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
            List<SessionIdentificationDataType> theSessionIdentificationData;
            theSessionIdentificationData = (((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty()))?this.getSessionIdentificationData():null);
            if ((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty())) {
                currentHashCode += theSessionIdentificationData.hashCode();
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
            List<SessionIdentificationDataType> theSessionIdentificationData;
            theSessionIdentificationData = (((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty()))?this.getSessionIdentificationData():null);
            strategy.appendField(locator, this, "sessionIdentificationData", buffer, theSessionIdentificationData, ((this.sessionIdentificationData!= null)&&(!this.sessionIdentificationData.isEmpty())));
        }
        return buffer;
    }

}
