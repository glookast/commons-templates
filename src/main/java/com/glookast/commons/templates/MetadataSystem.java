package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.glookast.commons.base.PropertyList;
import com.glookast.commons.xml.XmlAdapterUUID;


/**
 * <p>Java class for MetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MetadataSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://templates.commons.glookast.com}MetadataSystemType"/>
 *         &lt;element name="properties" type="{http://base.commons.glookast.com}PropertyList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description",
    "type",
    "properties"
})
public class MetadataSystem implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MetadataSystemType type;
    @XmlElement(required = true)
    protected PropertyList properties;

    /**
     * Default no-arg constructor
     *
     */
    public MetadataSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public MetadataSystem(final UUID id, final String name, final String description, final MetadataSystemType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public MetadataSystem(MetadataSystem ms) {
        this.id = ms.id;
        this.name = ms.name;
        this.description = ms.description;
        this.type = ms.type;
        this.properties = new PropertyList(ms.getProperties());
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(UUID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link MetadataSystemType }
     *
     */
    public MetadataSystemType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link MetadataSystemType }
     *
     */
    public void setType(MetadataSystemType value) {
        this.type = value;
    }

    /**
     * Gets the value of the properties property.
     *
     * @return
     *     possible object is
     *     {@link PropertyList }
     *
     */
    public PropertyList getProperties() {
        if (properties == null) {
            properties = new PropertyList();
        }
        return properties;
    }

    /**
     * Sets the value of the properties property.
     *
     * @param value
     *     allowed object is
     *     {@link PropertyList }
     *
     */
    public void setProperties(PropertyList value) {
        this.properties = new PropertyList(value);
    }

}
