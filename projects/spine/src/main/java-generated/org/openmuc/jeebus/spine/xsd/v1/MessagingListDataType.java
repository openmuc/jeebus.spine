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
 * <p>Java class for MessagingListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagingListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}messagingData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagingListDataType", propOrder = {
    "messagingData"
})
public class MessagingListDataType implements Cloneable, CopyTo, ToString
{

    protected List<MessagingDataType> messagingData;

    /**
     * Default no-arg constructor
     * 
     */
    public MessagingListDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MessagingListDataType(final List<MessagingDataType> messagingData) {
        this.messagingData = messagingData;
    }

    /**
     * Gets the value of the messagingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messagingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessagingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessagingDataType }
     * 
     * 
     */
    public List<MessagingDataType> getMessagingData() {
        if (messagingData == null) {
            messagingData = new ArrayList<MessagingDataType>();
        }
        return this.messagingData;
    }

    /**
     * Adds objects to the list of MessagingData using add method
     * 
     * @param values
     *     objects to add to the list MessagingData
     * @return
     *     The class instance
     */
    public MessagingListDataType withMessagingData(MessagingDataType... values) {
        if (values!= null) {
            for (MessagingDataType value: values) {
                getMessagingData().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of MessagingData using addAll method
     * 
     * @param values
     *     objects to add to the list MessagingData
     * @return
     *     The class instance
     */
    public MessagingListDataType withMessagingData(Collection<MessagingDataType> values) {
        if (values!= null) {
            getMessagingData().addAll(values);
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
        if (draftCopy instanceof MessagingListDataType) {
            final MessagingListDataType copy = ((MessagingListDataType) draftCopy);
            {
                Boolean messagingDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.messagingData!= null)&&(!this.messagingData.isEmpty())));
                if (messagingDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MessagingDataType> sourceMessagingData;
                    sourceMessagingData = (((this.messagingData!= null)&&(!this.messagingData.isEmpty()))?this.getMessagingData():null);
                    @SuppressWarnings("unchecked")
                    List<MessagingDataType> copyMessagingData = ((List<MessagingDataType> ) strategy.copy(LocatorUtils.property(locator, "messagingData", sourceMessagingData), sourceMessagingData, ((this.messagingData!= null)&&(!this.messagingData.isEmpty()))));
                    copy.messagingData = null;
                    if (copyMessagingData!= null) {
                        List<MessagingDataType> uniqueMessagingDatal = copy.getMessagingData();
                        uniqueMessagingDatal.addAll(copyMessagingData);
                    }
                } else {
                    if (messagingDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messagingData = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new MessagingListDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MessagingListDataType that = ((MessagingListDataType) object);
        {
            List<MessagingDataType> leftMessagingData;
            leftMessagingData = (((this.messagingData!= null)&&(!this.messagingData.isEmpty()))?this.getMessagingData():null);
            List<MessagingDataType> rightMessagingData;
            rightMessagingData = (((that.messagingData!= null)&&(!that.messagingData.isEmpty()))?that.getMessagingData():null);
            if ((this.messagingData!= null)&&(!this.messagingData.isEmpty())) {
                if ((that.messagingData!= null)&&(!that.messagingData.isEmpty())) {
                    if (!leftMessagingData.equals(rightMessagingData)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.messagingData!= null)&&(!that.messagingData.isEmpty())) {
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
            List<MessagingDataType> theMessagingData;
            theMessagingData = (((this.messagingData!= null)&&(!this.messagingData.isEmpty()))?this.getMessagingData():null);
            if ((this.messagingData!= null)&&(!this.messagingData.isEmpty())) {
                currentHashCode += theMessagingData.hashCode();
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
            List<MessagingDataType> theMessagingData;
            theMessagingData = (((this.messagingData!= null)&&(!this.messagingData.isEmpty()))?this.getMessagingData():null);
            strategy.appendField(locator, this, "messagingData", buffer, theMessagingData, ((this.messagingData!= null)&&(!this.messagingData.isEmpty())));
        }
        return buffer;
    }

}
