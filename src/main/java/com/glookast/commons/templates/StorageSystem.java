
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.glookast.commons.templates.resolvers.StorageSystemTemplateResolver;
import com.glookast.commons.xml.XmlAdapterUUID;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for StorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="StorageSystem">
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
@XmlType(name = "StorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description"
})
@XmlSeeAlso({
    GenericStorageSystem.class,
    AvidStorageSystem.class,
    FtpStorageSystem.class,
    ArvatoEditMateGenericStorageSystem.class
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
    @JsonSubTypes.Type(value = GenericStorageSystem.class, name = "GenericStorageSystem"),
    @JsonSubTypes.Type(value = AvidStorageSystem.class, name = "AvidStorageSystem"),
    @JsonSubTypes.Type(value = FtpStorageSystem.class, name = "FtpStorageSystem"),
    @JsonSubTypes.Type(value = ArvatoEditMateGenericStorageSystem.class, name = "ArvatoEditMateGenericStorageSystem"),
    @JsonSubTypes.Type(value = EditShareFlowStorageSystem.class, name = "EditShareFlowStorageSystem")
})
@JsonTypeIdResolver(StorageSystemTemplateResolver.class)
public abstract class StorageSystem implements Serializable {

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
    public StorageSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public StorageSystem(final UUID id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public StorageSystem(StorageSystem ss) {
        this.id = ss.id;
        this.name = ss.name;
        this.description = ss.description;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(UUID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageSystem that = (StorageSystem) o;
        return Objects.equals(getId(), that.getId()) &&
            Objects.equals(getName(), that.getName()) &&
            Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getDescription());
    }

    @Override
    public String toString() {
        return "StorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
