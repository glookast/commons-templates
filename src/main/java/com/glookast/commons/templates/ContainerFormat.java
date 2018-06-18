
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.glookast.commons.xml.XmlAdapterUUID;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for ContainerFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContainerFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="systemTypes" type="{http://templates.commons.glookast.com}SystemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerFormat", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "systemTypes"
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = ContainerFormat.class)
public class ContainerFormat implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "string")
    protected List<SystemType> systemTypes;

    /**
     * Default no-arg constructor
     */
    public ContainerFormat()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public ContainerFormat(final UUID id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    public ContainerFormat(ContainerFormat cf)
    {
        this.id = cf.id;
        this.name = cf.name;
        this.systemTypes = new ArrayList<>(cf.getSystemTypes());
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public UUID getId()
    {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(UUID value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the systemTypes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemTypes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemType }
     */
    public List<SystemType> getSystemTypes()
    {
        if (systemTypes == null) {
            systemTypes = new ArrayList<SystemType>();
        }
        return this.systemTypes;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerFormat that = (ContainerFormat) o;
        return Objects.equals(getId(), that.getId()) &&
               Objects.equals(getName(), that.getName()) &&
               Objects.equals(getSystemTypes(), that.getSystemTypes());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getId(), getName(), getSystemTypes());
    }

    @Override
    public String toString()
    {
        return "ContainerFormat{" + "id=" + id + ", name=" + name + ", systemTypes=" + systemTypes + '}';
    }
}
