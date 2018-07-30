
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
 * <p>Java class for OutputSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OutputSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="storageSystemId" type="{http://base.commons.glookast.com}UUID"/&gt;
 *         &lt;element name="metadataSystemIds" type="{http://base.commons.glookast.com}UUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description",
    "storageSystemId",
    "metadataSystemIds"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = OutputSystem.class)
public class OutputSystem implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID storageSystemId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected List<UUID> metadataSystemIds;

    /**
     * Default no-arg constructor
     */
    public OutputSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public OutputSystem(final UUID id, final String name, final String description, final UUID storageSystemId)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.storageSystemId = storageSystemId;
    }

    public OutputSystem(OutputSystem os)
    {
        this.id = os.id;
        this.name = os.name;
        this.description = os.description;
        this.storageSystemId = os.storageSystemId;
        this.metadataSystemIds = new ArrayList<>(os.getMetadataSystemIds());
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
     * Gets the value of the storageSystemId property.
     *
     * @return possible object is
     * {@link String }
     */
    public UUID getStorageSystemId()
    {
        return storageSystemId;
    }

    /**
     * Sets the value of the storageSystemId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStorageSystemId(UUID value)
    {
        this.storageSystemId = value;
    }

    /**
     * Gets the value of the metadataSystemIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataSystemIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataSystemIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<UUID> getMetadataSystemIds()
    {
        if (metadataSystemIds == null) {
            metadataSystemIds = new ArrayList<UUID>();
        }
        return this.metadataSystemIds;
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
        OutputSystem that = (OutputSystem) o;
        return Objects.equals(getId(), that.getId()) &&
               Objects.equals(getName(), that.getName()) &&
               Objects.equals(getDescription(), that.getDescription()) &&
               Objects.equals(getStorageSystemId(), that.getStorageSystemId()) &&
               Objects.equals(getMetadataSystemIds(), that.getMetadataSystemIds());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getId(), getName(), getDescription(), getStorageSystemId(), getMetadataSystemIds());
    }

    @Override
    public String toString()
    {
        return "OutputSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", storageSystemId=" + storageSystemId + ", metadataSystemIds=" + metadataSystemIds + '}';
    }
}
