
package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.glookast.commons.xml.XmlAdapterUUID;


/**
 * <p>Java class for TransformProfile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TransformProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="videoFormatId" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="audioFormatId" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="containerFormatId" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="outputSystemIds" type="{http://base.commons.glookast.com}UUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformProfile", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description",
    "videoFormatId",
    "audioFormatId",
    "containerFormatId",
    "outputSystemIds"
})
public class TransformProfile implements Serializable
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
    protected UUID videoFormatId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID audioFormatId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID containerFormatId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected List<UUID> outputSystemIds;

    /**
     * Default no-arg constructor
     *
     */
    public TransformProfile() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public TransformProfile(final UUID id, final String name, final String description, final UUID videoFormatId, final UUID audioFormatId, final UUID containerFormatId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.videoFormatId = videoFormatId;
        this.audioFormatId = audioFormatId;
        this.containerFormatId = containerFormatId;
    }

    public TransformProfile(TransformProfile tp) {
        this.id = tp.id;
        this.name = tp.name;
        this.description = tp.description;
        this.videoFormatId = tp.videoFormatId;
        this.audioFormatId = tp.audioFormatId;
        this.containerFormatId = tp.containerFormatId;
        this.outputSystemIds = new ArrayList<>(tp.getOutputSystemIds());
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
     * Gets the value of the videoFormatId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public UUID getVideoFormatId() {
        return videoFormatId;
    }

    /**
     * Sets the value of the videoFormatId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVideoFormatId(UUID value) {
        this.videoFormatId = value;
    }

    /**
     * Gets the value of the audioFormatId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public UUID getAudioFormatId() {
        return audioFormatId;
    }

    /**
     * Sets the value of the audioFormatId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAudioFormatId(UUID value) {
        this.audioFormatId = value;
    }

    /**
     * Gets the value of the containerFormatId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public UUID getContainerFormatId() {
        return containerFormatId;
    }

    /**
     * Sets the value of the containerFormatId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContainerFormatId(UUID value) {
        this.containerFormatId = value;
    }

    /**
     * Gets the value of the outputSystemIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputSystemIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSystemIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<UUID> getOutputSystemIds() {
        if (outputSystemIds == null) {
            outputSystemIds = new ArrayList<UUID>();
        }
        return this.outputSystemIds;
    }

    @Override
    public String toString()
    {
        return "TransformProfile{" + "id=" + id + ", name=" + name + ", description=" + description + ", videoFormatId=" + videoFormatId + ", audioFormatId=" + audioFormatId + ", containerFormatId=" + containerFormatId + ", outputSystemIds=" + outputSystemIds + '}';
    }
}
