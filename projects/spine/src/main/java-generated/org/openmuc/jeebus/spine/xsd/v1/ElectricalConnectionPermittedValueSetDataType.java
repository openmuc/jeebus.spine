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
 * <p>Java class for ElectricalConnectionPermittedValueSetDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricalConnectionPermittedValueSetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalConnectionId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionIdType" minOccurs="0"/&gt;
 *         &lt;element name="parameterId" type="{http://docs.eebus.org/spine/xsd/v1}ElectricalConnectionParameterIdType" minOccurs="0"/&gt;
 *         &lt;element name="permittedValueSet" type="{http://docs.eebus.org/spine/xsd/v1}ScaledNumberSetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalConnectionPermittedValueSetDataType", propOrder = {
    "electricalConnectionId",
    "parameterId",
    "permittedValueSet"
})
public class ElectricalConnectionPermittedValueSetDataType implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long electricalConnectionId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long parameterId;
    protected List<ScaledNumberSetType> permittedValueSet;

    /**
     * Default no-arg constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ElectricalConnectionPermittedValueSetDataType(final Long electricalConnectionId, final Long parameterId, final List<ScaledNumberSetType> permittedValueSet) {
        this.electricalConnectionId = electricalConnectionId;
        this.parameterId = parameterId;
        this.permittedValueSet = permittedValueSet;
    }

    /**
     * Gets the value of the electricalConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElectricalConnectionId() {
        return electricalConnectionId;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElectricalConnectionId(Long value) {
        this.electricalConnectionId = value;
    }

    /**
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParameterId(Long value) {
        this.parameterId = value;
    }

    /**
     * Gets the value of the permittedValueSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the permittedValueSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermittedValueSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScaledNumberSetType }
     * 
     * 
     */
    public List<ScaledNumberSetType> getPermittedValueSet() {
        if (permittedValueSet == null) {
            permittedValueSet = new ArrayList<ScaledNumberSetType>();
        }
        return this.permittedValueSet;
    }

    /**
     * Sets the value of the electricalConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataType withElectricalConnectionId(Long value) {
        setElectricalConnectionId(value);
        return this;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataType withParameterId(Long value) {
        setParameterId(value);
        return this;
    }

    /**
     * Adds objects to the list of PermittedValueSet using add method
     * 
     * @param values
     *     objects to add to the list PermittedValueSet
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataType withPermittedValueSet(ScaledNumberSetType... values) {
        if (values!= null) {
            for (ScaledNumberSetType value: values) {
                getPermittedValueSet().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of PermittedValueSet using addAll method
     * 
     * @param values
     *     objects to add to the list PermittedValueSet
     * @return
     *     The class instance
     */
    public ElectricalConnectionPermittedValueSetDataType withPermittedValueSet(Collection<ScaledNumberSetType> values) {
        if (values!= null) {
            getPermittedValueSet().addAll(values);
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
        if (draftCopy instanceof ElectricalConnectionPermittedValueSetDataType) {
            final ElectricalConnectionPermittedValueSetDataType copy = ((ElectricalConnectionPermittedValueSetDataType) draftCopy);
            {
                Boolean electricalConnectionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricalConnectionId!= null));
                if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceElectricalConnectionId;
                    sourceElectricalConnectionId = this.getElectricalConnectionId();
                    Long copyElectricalConnectionId = ((Long) strategy.copy(LocatorUtils.property(locator, "electricalConnectionId", sourceElectricalConnectionId), sourceElectricalConnectionId, (this.electricalConnectionId!= null)));
                    copy.setElectricalConnectionId(copyElectricalConnectionId);
                } else {
                    if (electricalConnectionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricalConnectionId = null;
                    }
                }
            }
            {
                Boolean parameterIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterId!= null));
                if (parameterIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceParameterId;
                    sourceParameterId = this.getParameterId();
                    Long copyParameterId = ((Long) strategy.copy(LocatorUtils.property(locator, "parameterId", sourceParameterId), sourceParameterId, (this.parameterId!= null)));
                    copy.setParameterId(copyParameterId);
                } else {
                    if (parameterIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parameterId = null;
                    }
                }
            }
            {
                Boolean permittedValueSetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty())));
                if (permittedValueSetShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ScaledNumberSetType> sourcePermittedValueSet;
                    sourcePermittedValueSet = (((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty()))?this.getPermittedValueSet():null);
                    @SuppressWarnings("unchecked")
                    List<ScaledNumberSetType> copyPermittedValueSet = ((List<ScaledNumberSetType> ) strategy.copy(LocatorUtils.property(locator, "permittedValueSet", sourcePermittedValueSet), sourcePermittedValueSet, ((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty()))));
                    copy.permittedValueSet = null;
                    if (copyPermittedValueSet!= null) {
                        List<ScaledNumberSetType> uniquePermittedValueSetl = copy.getPermittedValueSet();
                        uniquePermittedValueSetl.addAll(copyPermittedValueSet);
                    }
                } else {
                    if (permittedValueSetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.permittedValueSet = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new ElectricalConnectionPermittedValueSetDataType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ElectricalConnectionPermittedValueSetDataType that = ((ElectricalConnectionPermittedValueSetDataType) object);
        {
            Long leftElectricalConnectionId;
            leftElectricalConnectionId = this.getElectricalConnectionId();
            Long rightElectricalConnectionId;
            rightElectricalConnectionId = that.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                if (that.electricalConnectionId!= null) {
                    if (!leftElectricalConnectionId.equals(rightElectricalConnectionId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.electricalConnectionId!= null) {
                    return false;
                }
            }
        }
        {
            Long leftParameterId;
            leftParameterId = this.getParameterId();
            Long rightParameterId;
            rightParameterId = that.getParameterId();
            if (this.parameterId!= null) {
                if (that.parameterId!= null) {
                    if (!leftParameterId.equals(rightParameterId)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.parameterId!= null) {
                    return false;
                }
            }
        }
        {
            List<ScaledNumberSetType> leftPermittedValueSet;
            leftPermittedValueSet = (((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty()))?this.getPermittedValueSet():null);
            List<ScaledNumberSetType> rightPermittedValueSet;
            rightPermittedValueSet = (((that.permittedValueSet!= null)&&(!that.permittedValueSet.isEmpty()))?that.getPermittedValueSet():null);
            if ((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty())) {
                if ((that.permittedValueSet!= null)&&(!that.permittedValueSet.isEmpty())) {
                    if (!leftPermittedValueSet.equals(rightPermittedValueSet)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.permittedValueSet!= null)&&(!that.permittedValueSet.isEmpty())) {
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            if (this.electricalConnectionId!= null) {
                currentHashCode += theElectricalConnectionId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            Long theParameterId;
            theParameterId = this.getParameterId();
            if (this.parameterId!= null) {
                currentHashCode += theParameterId.hashCode();
            }
        }
        {
            currentHashCode = (currentHashCode* 31);
            List<ScaledNumberSetType> thePermittedValueSet;
            thePermittedValueSet = (((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty()))?this.getPermittedValueSet():null);
            if ((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty())) {
                currentHashCode += thePermittedValueSet.hashCode();
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
            Long theElectricalConnectionId;
            theElectricalConnectionId = this.getElectricalConnectionId();
            strategy.appendField(locator, this, "electricalConnectionId", buffer, theElectricalConnectionId, (this.electricalConnectionId!= null));
        }
        {
            Long theParameterId;
            theParameterId = this.getParameterId();
            strategy.appendField(locator, this, "parameterId", buffer, theParameterId, (this.parameterId!= null));
        }
        {
            List<ScaledNumberSetType> thePermittedValueSet;
            thePermittedValueSet = (((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty()))?this.getPermittedValueSet():null);
            strategy.appendField(locator, this, "permittedValueSet", buffer, thePermittedValueSet, ((this.permittedValueSet!= null)&&(!this.permittedValueSet.isEmpty())));
        }
        return buffer;
    }

}
