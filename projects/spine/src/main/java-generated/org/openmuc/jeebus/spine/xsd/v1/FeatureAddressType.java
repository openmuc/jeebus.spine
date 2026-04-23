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
 * <p>Java class for FeatureAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://docs.eebus.org/spine/xsd/v1}EntityAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.eebus.org/spine/xsd/v1}feature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureAddressType", propOrder = {
    "feature"
})
public class FeatureAddressType
    extends EntityAddressType
    implements Cloneable, CopyTo, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long feature;

    /**
     * Default no-arg constructor
     * 
     */
    public FeatureAddressType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FeatureAddressType(final String device, final List<Long> entity, final Long feature) {
        super(device, entity);
        this.feature = feature;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeature(Long value) {
        this.feature = value;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    public FeatureAddressType withFeature(Long value) {
        setFeature(value);
        return this;
    }

    /**
     * Adds objects to the list of Entity using add method
     * 
     * @param values
     *     objects to add to the list Entity
     * @return
     *     The class instance
     */
    @Override
    public FeatureAddressType withEntity(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getEntity().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Entity using addAll method
     * 
     * @param values
     *     objects to add to the list Entity
     * @return
     *     The class instance
     */
    @Override
    public FeatureAddressType withEntity(Collection<Long> values) {
        if (values!= null) {
            getEntity().addAll(values);
        }
        return this;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return
     *     The class instance
     */
    @Override
    public FeatureAddressType withDevice(String value) {
        setDevice(value);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof FeatureAddressType) {
            final FeatureAddressType copy = ((FeatureAddressType) draftCopy);
            {
                Boolean featureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feature!= null));
                if (featureShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceFeature;
                    sourceFeature = this.getFeature();
                    Long copyFeature = ((Long) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature, (this.feature!= null)));
                    copy.setFeature(copyFeature);
                } else {
                    if (featureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feature = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new FeatureAddressType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        final FeatureAddressType that = ((FeatureAddressType) object);
        {
            Long leftFeature;
            leftFeature = this.getFeature();
            Long rightFeature;
            rightFeature = that.getFeature();
            if (this.feature!= null) {
                if (that.feature!= null) {
                    if (!leftFeature.equals(rightFeature)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.feature!= null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        currentHashCode = ((currentHashCode* 31)+ super.hashCode());
        {
            currentHashCode = (currentHashCode* 31);
            Long theFeature;
            theFeature = this.getFeature();
            if (this.feature!= null) {
                currentHashCode += theFeature.hashCode();
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
        super.appendFields(locator, buffer, strategy);
        {
            Long theFeature;
            theFeature = this.getFeature();
            strategy.appendField(locator, this, "feature", buffer, theFeature, (this.feature!= null));
        }
        return buffer;
    }

}
