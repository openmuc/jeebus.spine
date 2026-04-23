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
 * <p>Java class for NodeManagementSpecificationVersionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementSpecificationVersionListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificationVersion" type="{http://docs.eebus.org/spine/xsd/v1}SpecificationVersionDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementSpecificationVersionListType", propOrder = {
    "specificationVersion"
})
public class NodeManagementSpecificationVersionListType implements Cloneable, CopyTo, ToString
{

    protected List<SpecificationVersionDataType> specificationVersion;

    /**
     * Default no-arg constructor
     * 
     */
    public NodeManagementSpecificationVersionListType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public NodeManagementSpecificationVersionListType(final List<SpecificationVersionDataType> specificationVersion) {
        this.specificationVersion = specificationVersion;
    }

    /**
     * Gets the value of the specificationVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificationVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationVersionDataType }
     * 
     * 
     */
    public List<SpecificationVersionDataType> getSpecificationVersion() {
        if (specificationVersion == null) {
            specificationVersion = new ArrayList<SpecificationVersionDataType>();
        }
        return this.specificationVersion;
    }

    /**
     * Adds objects to the list of SpecificationVersion using add method
     * 
     * @param values
     *     objects to add to the list SpecificationVersion
     * @return
     *     The class instance
     */
    public NodeManagementSpecificationVersionListType withSpecificationVersion(SpecificationVersionDataType... values) {
        if (values!= null) {
            for (SpecificationVersionDataType value: values) {
                getSpecificationVersion().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of SpecificationVersion using addAll method
     * 
     * @param values
     *     objects to add to the list SpecificationVersion
     * @return
     *     The class instance
     */
    public NodeManagementSpecificationVersionListType withSpecificationVersion(Collection<SpecificationVersionDataType> values) {
        if (values!= null) {
            getSpecificationVersion().addAll(values);
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
        if (draftCopy instanceof NodeManagementSpecificationVersionListType) {
            final NodeManagementSpecificationVersionListType copy = ((NodeManagementSpecificationVersionListType) draftCopy);
            {
                Boolean specificationVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty())));
                if (specificationVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SpecificationVersionDataType> sourceSpecificationVersion;
                    sourceSpecificationVersion = (((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty()))?this.getSpecificationVersion():null);
                    @SuppressWarnings("unchecked")
                    List<SpecificationVersionDataType> copySpecificationVersion = ((List<SpecificationVersionDataType> ) strategy.copy(LocatorUtils.property(locator, "specificationVersion", sourceSpecificationVersion), sourceSpecificationVersion, ((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty()))));
                    copy.specificationVersion = null;
                    if (copySpecificationVersion!= null) {
                        List<SpecificationVersionDataType> uniqueSpecificationVersionl = copy.getSpecificationVersion();
                        uniqueSpecificationVersionl.addAll(copySpecificationVersion);
                    }
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
        return new NodeManagementSpecificationVersionListType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NodeManagementSpecificationVersionListType that = ((NodeManagementSpecificationVersionListType) object);
        {
            List<SpecificationVersionDataType> leftSpecificationVersion;
            leftSpecificationVersion = (((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty()))?this.getSpecificationVersion():null);
            List<SpecificationVersionDataType> rightSpecificationVersion;
            rightSpecificationVersion = (((that.specificationVersion!= null)&&(!that.specificationVersion.isEmpty()))?that.getSpecificationVersion():null);
            if ((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty())) {
                if ((that.specificationVersion!= null)&&(!that.specificationVersion.isEmpty())) {
                    if (!leftSpecificationVersion.equals(rightSpecificationVersion)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.specificationVersion!= null)&&(!that.specificationVersion.isEmpty())) {
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
            List<SpecificationVersionDataType> theSpecificationVersion;
            theSpecificationVersion = (((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty()))?this.getSpecificationVersion():null);
            if ((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty())) {
                currentHashCode += theSpecificationVersion.hashCode();
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
            List<SpecificationVersionDataType> theSpecificationVersion;
            theSpecificationVersion = (((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty()))?this.getSpecificationVersion():null);
            strategy.appendField(locator, this, "specificationVersion", buffer, theSpecificationVersion, ((this.specificationVersion!= null)&&(!this.specificationVersion.isEmpty())));
        }
        return buffer;
    }

}
