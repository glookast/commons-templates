package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.glookast.commons.xml.XmlAdapterUUID;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for MetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="MetadataSystem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@SuperBuilder(toBuilder = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description"
})
@XmlSeeAlso({
    AvidAafExportMetadataSystem.class,
    AvidMamMetadataSystem.class,
    AvidPamMetadataSystem.class,
    XmlExportMetadataSystem.class,
    ArvatoEditMateMetadataSystem.class
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AvidAafExportMetadataSystem.class, name = "AvidAafExportMetadataSystem"),
    @JsonSubTypes.Type(value = AvidMamMetadataSystem.class, name = "AvidMamMetadataSystem"),
    @JsonSubTypes.Type(value = AvidPamMetadataSystem.class, name = "AvidPamMetadataSystem"),
    @JsonSubTypes.Type(value = XmlExportMetadataSystem.class, name = "XmlExportMetadataSystem"),
    @JsonSubTypes.Type(value = ArvatoEditMateMetadataSystem.class, name = "ArvatoEditMateMetadataSystem")
})
public abstract class MetadataSystem implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;

    /**
     * Default no-arg constructor
     */
    public MetadataSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public MetadataSystem(final UUID id, final String name, final String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public MetadataSystem(MetadataSystem ms)
    {
        this.id = ms.id;
        this.name = ms.name;
        this.description = ms.description;
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataSystem that = (MetadataSystem) o;
        return Objects.equals(getId(), that.getId()) &&
               Objects.equals(getName(), that.getName()) &&
               Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId(), getName(), getDescription());
    }

    @Override
    public String toString()
    {
        return "MetadataSystem{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
