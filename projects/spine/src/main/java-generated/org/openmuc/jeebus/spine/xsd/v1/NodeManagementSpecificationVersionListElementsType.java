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


/**
 * <p>Java class for NodeManagementSpecificationVersionListElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSpecificationVersionListElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificationVersion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionDataElementsType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementSpecificationVersionListElementsType", propOrder = {
    "specificationVersion"
})
public class NodeManagementSpecificationVersionListElementsType implements Cloneable, CopyTo, ToString
{

    protected NodeManagementSpecificationVersionListElementsType.SpecificationVersion specificationVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSpecificationVersionListElementsType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSpecificationVersionListElementsType(final NodeManagementSpecificationVersionListElementsType.SpecificationVersion specificationVersion) {
        this.specificationVersion = specificationVersion;
    }

    /**
     * Gets the value of the specificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementSpecificationVersionListElementsType.SpecificationVersion }
     *     
     */
    public NodeManagementSpecificationVersionListElementsType.SpecificationVersion getSpecificationVersion() {
        return specificationVersion;
    }

    /**
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListElementsType.SpecificationVersion }
     *     
     */
    public void setSpecificationVersion(NodeManagementSpecificationVersionListElementsType.SpecificationVersion value) {
        this.specificationVersion = value;
    }

    /**
     * Sets the value of the specificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementSpecificationVersionListElementsType.SpecificationVersion }
     * @return
     *     The class instance
     */
    public NodeManagementSpecificationVersionListElementsType withSpecificationVersion(NodeManagementSpecificationVersionListElementsType.SpecificationVersion value) {
        setSpecificationVersion(value);
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
        if (draftCopy instanceof NodeManagementSpecificationVersionListElementsType) {
            final NodeManagementSpecificationVersionListElementsType copy = ((NodeManagementSpecificationVersionListElementsType) draftCopy);
            {
                Boolean specificationVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specificationVersion!= null));
                if (specificationVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    NodeManagementSpecificationVersionListElementsType.SpecificationVersion sourceSpecificationVersion;
                    sourceSpecificationVersion = this.getSpecificationVersion();
                    NodeManagementSpecificationVersionListElementsType.SpecificationVersion copySpecificationVersion = ((NodeManagementSpecificationVersionListElementsType.SpecificationVersion) strategy.copy(LocatorUtils.property(locator, "specificationVersion", sourceSpecificationVersion), sourceSpecificationVersion, (this.specificationVersion!= null)));
                    copy.setSpecificationVersion(copySpecificationVersion);
                } else {
                    if (specificationVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.specificationVersion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new NodeManagementSpecificationVersionListElementsType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSpecificationVersionListElementsType that = ((NodeManagementSpecificationVersionListElementsType) object);
        {
            NodeManagementSpecificationVersionListElementsType.SpecificationVersion leftSpecificationVersion;
            leftSpecificationVersion = this.getSpecificationVersion();
            NodeManagementSpecificationVersionListElementsType.SpecificationVersion rightSpecificationVersion;
            rightSpecificationVersion = that.getSpecificationVersion();
            if (this.specificationVersion!= null) {
                if (that.specificationVersion!= null) {
                    if (!leftSpecificationVersion.equals(rightSpecificationVersion)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if (that.specificationVersion!= null) {
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
            NodeManagementSpecificationVersionListElementsType.SpecificationVersion theSpecificationVersion;
            theSpecificationVersion = this.getSpecificationVersion();
            if (this.specificationVersion!= null) {
                currentHashCode += theSpecificationVersion.hashCode();
            }
        }
        return currentHashCode;
    }

    @Override
    public String toString() {
        final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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
            NodeManagementSpecificationVersionListElementsType.SpecificationVersion theSpecificationVersion;
            theSpecificationVersion = this.getSpecificationVersion();
            strategy.appendField(locator, this, "specificationVersion", buffer, theSpecificationVersion, (this.specificationVersion!= null));
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionDataElementsType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecificationVersion
        extends SpecificationVersionDataElementsType
        implements Cloneable, CopyTo, ToString
    {


        /**
         * Default no-arg constructor
         * 
         */
        public SpecificationVersion() {
            super();
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
            return new NodeManagementSpecificationVersionListElementsType.SpecificationVersion();
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
            final ToStringStrategy strategy = new org.openmuc.jeebus.spine.impl.parser.CustomToStringStrategy();
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

}
