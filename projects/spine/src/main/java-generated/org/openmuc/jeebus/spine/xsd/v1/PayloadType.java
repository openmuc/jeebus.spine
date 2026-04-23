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
 * <p>Java class for PayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cmd" type="{http://docs.eebus.org/spine/xsd/v1}CmdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadType", propOrder = {
    "cmd"
})
public class PayloadType implements Cloneable, CopyTo, ToString
{

    protected List<CmdType> cmd;

    /**
     * Default no-arg constructor
     * 
     */
    public PayloadType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PayloadType(final List<CmdType> cmd) {
        this.cmd = cmd;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmdType }
     * 
     * 
     */
    public List<CmdType> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<CmdType>();
        }
        return this.cmd;
    }

    /**
     * Adds objects to the list of Cmd using add method
     * 
     * @param values
     *     objects to add to the list Cmd
     * @return
     *     The class instance
     */
    public PayloadType withCmd(CmdType... values) {
        if (values!= null) {
            for (CmdType value: values) {
                getCmd().add(value);
            }
        }
        return this;
    }

    /**
     * Adds objects to the list of Cmd using addAll method
     * 
     * @param values
     *     objects to add to the list Cmd
     * @return
     *     The class instance
     */
    public PayloadType withCmd(Collection<CmdType> values) {
        if (values!= null) {
            getCmd().addAll(values);
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
        if (draftCopy instanceof PayloadType) {
            final PayloadType copy = ((PayloadType) draftCopy);
            {
                Boolean cmdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.cmd!= null)&&(!this.cmd.isEmpty())));
                if (cmdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CmdType> sourceCmd;
                    sourceCmd = (((this.cmd!= null)&&(!this.cmd.isEmpty()))?this.getCmd():null);
                    @SuppressWarnings("unchecked")
                    List<CmdType> copyCmd = ((List<CmdType> ) strategy.copy(LocatorUtils.property(locator, "cmd", sourceCmd), sourceCmd, ((this.cmd!= null)&&(!this.cmd.isEmpty()))));
                    copy.cmd = null;
                    if (copyCmd!= null) {
                        List<CmdType> uniqueCmdl = copy.getCmd();
                        uniqueCmdl.addAll(copyCmd);
                    }
                } else {
                    if (cmdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cmd = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    public Object createNewInstance() {
        return new PayloadType();
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PayloadType that = ((PayloadType) object);
        {
            List<CmdType> leftCmd;
            leftCmd = (((this.cmd!= null)&&(!this.cmd.isEmpty()))?this.getCmd():null);
            List<CmdType> rightCmd;
            rightCmd = (((that.cmd!= null)&&(!that.cmd.isEmpty()))?that.getCmd():null);
            if ((this.cmd!= null)&&(!this.cmd.isEmpty())) {
                if ((that.cmd!= null)&&(!that.cmd.isEmpty())) {
                    if (!leftCmd.equals(rightCmd)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                if ((that.cmd!= null)&&(!that.cmd.isEmpty())) {
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
            List<CmdType> theCmd;
            theCmd = (((this.cmd!= null)&&(!this.cmd.isEmpty()))?this.getCmd():null);
            if ((this.cmd!= null)&&(!this.cmd.isEmpty())) {
                currentHashCode += theCmd.hashCode();
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
            List<CmdType> theCmd;
            theCmd = (((this.cmd!= null)&&(!this.cmd.isEmpty()))?this.getCmd():null);
            strategy.appendField(locator, this, "cmd", buffer, theCmd, ((this.cmd!= null)&&(!this.cmd.isEmpty())));
        }
        return buffer;
    }

}
