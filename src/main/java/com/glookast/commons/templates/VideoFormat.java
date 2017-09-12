
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
import com.glookast.commons.base.Rational;
import com.glookast.commons.xml.XmlAdapterUUID;


/**
 * <p>Java class for VideoFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VideoFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="codecName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frameRate" type="{http://base.commons.glookast.com}Rational"/>
 *         &lt;element name="interlaced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="topFieldFirst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aspectRatio" type="{http://base.commons.glookast.com}Rational"/>
 *         &lt;element name="bitRate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="constantBitRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="containerFormatIds" type="{http://base.commons.glookast.com}UUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFormat", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "codecName",
    "codecVendor",
    "codecVersion",
    "codecFamily",
    "displayWidth",
    "displayHeight",
    "frameRate",
    "interlaced",
    "topFieldFirst",
    "aspectRatio",
    "bitRate",
    "constantBitRate",
    "containerFormatIds"
})
public class VideoFormat implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID id;
    @XmlElement(required = true)
    protected String codecName;
    @XmlElement(required = true)
    protected String codecVendor;
    @XmlElement(required = true)
    protected String codecVersion;
    @XmlElement(required = true)
    protected String codecFamily;
    protected int displayWidth;
    protected int displayHeight;
    @XmlElement(required = true)
    protected Rational frameRate;
    protected boolean interlaced;
    protected boolean topFieldFirst;
    @XmlElement(required = true)
    protected Rational aspectRatio;
    protected long bitRate;
    protected boolean constantBitRate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected List<UUID> containerFormatIds;

    /**
     * Default no-arg constructor
     *
     */
    public VideoFormat() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public VideoFormat(final UUID id, final String codecName, final String codecVendor, final String codecVersion, final String codecFamily, final int displayWidth, final int displayHeight, final Rational frameRate, final boolean interlaced, final boolean topFieldFirst, final Rational aspectRatio, final long bitRate, final boolean constantBitRate) {
        this.id = id;
        this.codecName = codecName;
        this.codecVendor = codecVendor;
        this.codecVersion = codecVersion;
        this.codecFamily = codecFamily;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        this.frameRate = frameRate;
        this.interlaced = interlaced;
        this.topFieldFirst = topFieldFirst;
        this.aspectRatio = aspectRatio;
        this.bitRate = bitRate;
        this.constantBitRate = constantBitRate;
    }

    public VideoFormat(VideoFormat vf) {
        this.id = vf.id;
        this.codecName = vf.codecName;
        this.codecVendor = vf.codecVendor;
        this.codecVersion = vf.codecVersion;
        this.codecFamily = vf.codecFamily;
        this.displayWidth = vf.displayWidth;
        this.displayHeight = vf.displayHeight;
        this.frameRate = vf.frameRate;
        this.interlaced = vf.interlaced;
        this.topFieldFirst = vf.topFieldFirst;
        this.aspectRatio = vf.aspectRatio;
        this.bitRate = vf.bitRate;
        this.constantBitRate = vf.constantBitRate;
        this.containerFormatIds = new ArrayList<>(vf.getContainerFormatIds());
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
     * Gets the value of the codecName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodecName() {
        return codecName;
    }

    /**
     * Sets the value of the codecName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodecName(String value) {
        this.codecName = value;
    }

    /**
     * Gets the value of the codecVendor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodecVendor() {
        return codecVendor;
    }

    /**
     * Sets the value of the codecVendor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodecVendor(String value) {
        this.codecVendor = value;
    }

    /**
     * Gets the value of the codecVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodecVersion() {
        return codecVersion;
    }

    /**
     * Sets the value of the codecVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodecVersion(String value) {
        this.codecVersion = value;
    }

    /**
     * Gets the value of the codecFamily property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodecFamily() {
        return codecFamily;
    }

    /**
     * Sets the value of the codecFamily property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodecFamily(String value) {
        this.codecFamily = value;
    }

    /**
     * Gets the value of the displayWidth property.
     *
     */
    public int getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     *
     */
    public void setDisplayWidth(int value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the displayHeight property.
     *
     */
    public int getDisplayHeight() {
        return displayHeight;
    }

    /**
     * Sets the value of the displayHeight property.
     *
     */
    public void setDisplayHeight(int value) {
        this.displayHeight = value;
    }

    /**
     * Gets the value of the frameRate property.
     *
     * @return
     *     possible object is
     *     {@link Rational }
     *
     */
    public Rational getFrameRate() {
        return frameRate;
    }

    /**
     * Sets the value of the frameRate property.
     *
     * @param value
     *     allowed object is
     *     {@link Rational }
     *
     */
    public void setFrameRate(Rational value) {
        this.frameRate = value;
    }

    /**
     * Gets the value of the interlaced property.
     *
     */
    public boolean isInterlaced() {
        return interlaced;
    }

    /**
     * Sets the value of the interlaced property.
     *
     */
    public void setInterlaced(boolean value) {
        this.interlaced = value;
    }

    /**
     * Gets the value of the topFieldFirst property.
     *
     */
    public boolean isTopFieldFirst() {
        return topFieldFirst;
    }

    /**
     * Sets the value of the topFieldFirst property.
     *
     */
    public void setTopFieldFirst(boolean value) {
        this.topFieldFirst = value;
    }

    /**
     * Gets the value of the aspectRatio property.
     *
     * @return
     *     possible object is
     *     {@link Rational }
     *
     */
    public Rational getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     *
     * @param value
     *     allowed object is
     *     {@link Rational }
     *
     */
    public void setAspectRatio(Rational value) {
        this.aspectRatio = value;
    }

    /**
     * Gets the value of the bitRate property.
     *
     */
    public long getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     *
     */
    public void setBitRate(long value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the constantBitRate property.
     *
     */
    public boolean isConstantBitRate() {
        return constantBitRate;
    }

    /**
     * Sets the value of the constantBitRate property.
     *
     */
    public void setConstantBitRate(boolean value) {
        this.constantBitRate = value;
    }

    /**
     * Gets the value of the containerFormatIds property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerFormatIds property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerFormatIds().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<UUID> getContainerFormatIds() {
        if (containerFormatIds == null) {
            containerFormatIds = new ArrayList<UUID>();
        }
        return this.containerFormatIds;
    }

    @Override
    public String toString()
    {
        return "VideoFormat{" + "id=" + id + ", codecName=" + codecName + ", codecVendor=" + codecVendor + ", codecVersion=" + codecVersion + ", codecFamily=" + codecFamily + ", displayWidth=" + displayWidth + ", displayHeight=" + displayHeight + ", frameRate=" + frameRate + ", interlaced=" + interlaced + ", topFieldFirst=" + topFieldFirst + ", aspectRatio=" + aspectRatio + ", bitRate=" + bitRate + ", constantBitRate=" + constantBitRate + ", containerFormatIds=" + containerFormatIds + '}';
    }
}
