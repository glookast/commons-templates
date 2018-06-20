
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.glookast.commons.xml.XmlAdapterUUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for Template complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Template"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transformProfileIds" type="{http://base.commons.glookast.com}UUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description",
    "transformProfileIds"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = Template.class)
public class Template implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected List<UUID> transformProfileIds;

    /**
     * Default no-arg constructor
     */
    public Template()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public Template(final UUID id, final String name, final String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Template(Template template)
    {
        this.id = template.id;
        this.name = template.name;
        this.description = template.description;
        this.transformProfileIds = new ArrayList<>(template.getTransformProfileIds());
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
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }

    /**
     * Gets the value of the transformProfileIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformProfileIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformProfileIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<UUID> getTransformProfileIds()
    {
        if (transformProfileIds == null) {
            transformProfileIds = new ArrayList<UUID>();
        }
        return this.transformProfileIds;
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
        Template template = (Template) o;
        return Objects.equals(getId(), template.getId()) &&
               Objects.equals(getName(), template.getName()) &&
               Objects.equals(getDescription(), template.getDescription()) &&
               Objects.equals(getTransformProfileIds(), template.getTransformProfileIds());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getId(), getName(), getDescription(), getTransformProfileIds());
    }

    @Override
    public String toString()
    {
        return "Template{" + "id=" + id + ", name=" + name + ", description=" + description + ", transformProfileIds=" + transformProfileIds + '}';
    }
}
