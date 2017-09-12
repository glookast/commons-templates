
package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.glookast.commons.xml.XmlAdapterUUID;


/**
 * <p>Java class for ContainerFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContainerFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="systemTypes" type="{http://templates.commons.glookast.com}SystemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerFormat", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "systemTypes"
})
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
     *
     */
    public ContainerFormat() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public ContainerFormat(final UUID id, final String name) {
        this.id = id;
        this.name = name;
    }

    public ContainerFormat(ContainerFormat cf) {
        this.id = cf.id;
        this.name = cf.name;
        this.systemTypes = new ArrayList<>(cf.getSystemTypes());
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
     *
     *
     */
    public List<SystemType> getSystemTypes() {
        if (systemTypes == null) {
            systemTypes = new ArrayList<SystemType>();
        }
        return this.systemTypes;
    }

}
