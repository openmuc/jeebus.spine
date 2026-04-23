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
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy;


/**
 * <p>Java class for SmartEnergyManagementPsAlternativesRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartEnergyManagementPsAlternativesRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}PowerSequenceAlternativesRelationDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativesId" type="{http://docs.eebus.org/spine/xsd/v1}AlternativesIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartEnergyManagementPsAlternativesRelationType")
public class SmartEnergyManagementPsAlternativesRelationType
    extends PowerSequenceAlternativesRelationDataType
    implements Cloneable, CopyTo, ToString
{


    /**
     * Default no-arg constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesRelationType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SmartEnergyManagementPsAlternativesRelationType(final Long alternativesId, final List<Long> sequenceId) {
        super(alternativesId, sequenceId);
    }

    /**
     * Sets the value of the alternativesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     * @return
     *     The class instance
     */
    @Override
    public SmartEnergyManagementPsAlternativesRelationType withAlternativesId(Long value) {
        setAlternativesId(value);
        return this;
    }

    /**
     * Adds objects to the list of SequenceId using add method
     * 
     * @param values
     *     objects to add to the list SequenceId
     * @return
     *     The class instance
     */
    @Override
    public SmartEnergyManagementPsAlternativesRelationType withSequenceId(Long... values) {
        if (values!= null) {
            for (Long value: values) {
                getSequenceId().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SequenceId using addAll method
     * 
     * @param values
     *     objects to add to the list SequenceId
     * @return
     *     The class instance
     */
    @Override
    public SmartEnergyManagementPsAlternativesRelationType withSequenceId(Collection<Long> values) {
        if (values!= null) {
            getSequenceId().addAll(values);
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
        super.copyTo(locator, draftCopy, strategy);
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new SmartEnergyManagementPsAlternativesRelationType();
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
        return true;
    }

    @Override
    public int hashCode() {
        int currentHashCode = 1;
        currentHashCode = ((currentHashCode* 31)+ super.hashCode());
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
        return buffer;
    }

}
