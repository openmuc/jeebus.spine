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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for HvacSystemFunctionOperationModeRelationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HvacSystemFunctionOperationModeRelationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemFunctionId" type="{http://docs.eebus.org/spine/xsd/v1}HvacSystemFunctionIdType" minOccurs="0"/&gt;
 *         &lt;element name="operationModeId" type="{http://docs.eebus.org/spine/xsd/v1}HvacOperationModeIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HvacSystemFunctionOperationModeRelationDataType", propOrder = {
    "systemFunctionId",
    "operationModeId"
})
public class HvacSystemFunctionOperationModeRelationDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long systemFunctionId;
    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> operationModeId;

    /**
     * Default no-arg constructor
     * 
     */
    public HvacSystemFunctionOperationModeRelationDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HvacSystemFunctionOperationModeRelationDataType(final Long systemFunctionId, final List<Long> operationModeId) {
        this.systemFunctionId = systemFunctionId;
        this.operationModeId = operationModeId;
    }

    /**
     * Gets the value of the systemFunctionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSystemFunctionId() {
        return systemFunctionId;
    }

    /**
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSystemFunctionId(Long value) {
        this.systemFunctionId = value;
    }

    /**
     * Gets the value of the operationModeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the operationModeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationModeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getOperationModeId() {
        if (operationModeId == null) {
            operationModeId = new ArrayList<Long>();
        }
        return this.operationModeId;
    }

    /**
     * Sets the value of the systemFunctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public HvacSystemFunctionOperationModeRelationDataType withSystemFunctionId(Long value) {
        setSystemFunctionId(value);
        return this;
    }

    /**
     * Adds objects to the list of OperationModeId using add method
     * 
     * @param values
     *     objects to add to the list OperationModeId
     * @return
     *     The class instance
     */
    public HvacSystemFunctionOperationModeRelationDataType withOperationModeId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getOperationModeId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of OperationModeId using addAll method
     * 
     * @param values
     *     objects to add to the list OperationModeId
     * @return
     *     The class instance
     */
    public HvacSystemFunctionOperationModeRelationDataType withOperationModeId(Collection<Long> values) {
        if (values!= null) {
            getOperationModeId().addAll(values);
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
        if (draftCopy instanceof HvacSystemFunctionOperationModeRelationDataType) {
            final HvacSystemFunctionOperationModeRelationDataType copy = ((HvacSystemFunctionOperationModeRelationDataType) draftCopy);
            {
                Boolean systemFunctionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.systemFunctionId!= null));
                if (systemFunctionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSystemFunctionId;
                    sourceSystemFunctionId = this.getSystemFunctionId();
                    Long copySystemFunctionId = ((Long) strategy.copy(LocatorUtils.property(locator, "systemFunctionId", sourceSystemFunctionId), sourceSystemFunctionId, (this.systemFunctionId!= null)));
                    copy.setSystemFunctionId(copySystemFunctionId);
                } else {
                    if (systemFunctionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.systemFunctionId = null;
                    }
                }
            }
            {
                Boolean operationModeIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operationModeId!= null)&&(!this.operationModeId.isEmpty())));
                if (operationModeIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Long> sourceOperationModeId;
                    sourceOperationModeId = (((this.operationModeId!= null)&&(!this.operationModeId.isEmpty()))?this.getOperationModeId():null);
                    @SuppressWarnings("unchecked")
                    List<Long> copyOperationModeId = ((List<Long> ) strategy.copy(LocatorUtils.property(locator, "operationModeId", sourceOperationModeId), sourceOperationModeId, ((this.operationModeId!= null)&&(!this.operationModeId.isEmpty()))));
                    copy.operationModeId = null;
                    if (copyOperationModeId!= null) {
                        List<Long> uniqueOperationModeIdl = copy.getOperationModeId();
                        uniqueOperationModeIdl.addAll(copyOperationModeId);
                    }
                } else {
                    if (operationModeIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationModeId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new HvacSystemFunctionOperationModeRelationDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HvacSystemFunctionOperationModeRelationDataType that = ((HvacSystemFunctionOperationModeRelationDataType) object);
        {
            Long leftSystemFunctionId;
            leftSystemFunctionId = this.getSystemFunctionId();
            Long rightSystemFunctionId;
            rightSystemFunctionId = that.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                if (that.systemFunctionId!= null) {
                    if (!leftSystemFunctionId.equals(rightSystemFunctionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.systemFunctionId!= null) {
                    return false;
                }
            }
        }
        {
            List<Long> leftOperationModeId;
            leftOperationModeId = (((this.operationModeId!= null)&&(!this.operationModeId.isEmpty()))?this.getOperationModeId():null);
            List<Long> rightOperationModeId;
            rightOperationModeId = (((that.operationModeId!= null)&&(!that.operationModeId.isEmpty()))?that.getOperationModeId():null);
            if ((this.operationModeId!= null)&&(!this.operationModeId.isEmpty())) {
                if ((that.operationModeId!= null)&&(!that.operationModeId.isEmpty())) {
                    if (!leftOperationModeId.equals(rightOperationModeId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.operationModeId!= null)&&(!that.operationModeId.isEmpty())) {
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
            Long theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            if (this.systemFunctionId!= null) {
                currentHashCode += theSystemFunctionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<Long> theOperationModeId;
            theOperationModeId = (((this.operationModeId!= null)&&(!this.operationModeId.isEmpty()))?this.getOperationModeId():null);
            if ((this.operationModeId!= null)&&(!this.operationModeId.isEmpty())) {
                currentHashCode += theOperationModeId.hashCode();
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
            Long theSystemFunctionId;
            theSystemFunctionId = this.getSystemFunctionId();
            strategy.appendField(locator, this, "systemFunctionId", buffer, theSystemFunctionId, (this.systemFunctionId!= null));
        }
        {
            List<Long> theOperationModeId;
            theOperationModeId = (((this.operationModeId!= null)&&(!this.operationModeId.isEmpty()))?this.getOperationModeId():null);
            strategy.appendField(locator, this, "operationModeId", buffer, theOperationModeId, ((this.operationModeId!= null)&&(!this.operationModeId.isEmpty())));
        }
        return buffer;
    }

}
