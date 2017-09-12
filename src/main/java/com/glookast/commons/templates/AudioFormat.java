
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
 * <p>Java class for AudioFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AudioFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         &lt;element name="codecName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codecFamily" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "AudioFormat", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "codecName",
    "codecVendor",
    "codecVersion",
    "codecFamily",
    "channels",
    "sampleSize",
    "samplingRate",
    "bitRate",
    "constantBitRate",
    "containerFormatIds"
})
public class AudioFormat implements Serializable
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
    protected int channels;
    protected int sampleSize;
    protected int samplingRate;
    protected long bitRate;
    protected boolean constantBitRate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected List<UUID> containerFormatIds;

    /**
     * Default no-arg constructor
     *
     */
    public AudioFormat() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public AudioFormat(final UUID id, final String codecName, final String codecVendor, final String codecVersion, final String codecFamily, final int channels, final int sampleSize, final int samplingRate, final long bitRate, final boolean constantBitRate) {
        this.id = id;
        this.codecName = codecName;
        this.codecVendor = codecVendor;
        this.codecVersion = codecVersion;
        this.codecFamily = codecFamily;
        this.channels = channels;
        this.sampleSize = sampleSize;
        this.samplingRate = samplingRate;
        this.bitRate = bitRate;
        this.constantBitRate = constantBitRate;
    }

    public AudioFormat(AudioFormat af) {
        this.id = af.id;
        this.codecName = af.codecName;
        this.codecVendor = af.codecVendor;
        this.codecVersion = af.codecVersion;
        this.codecFamily = af.codecFamily;
        this.channels = af.channels;
        this.sampleSize = af.sampleSize;
        this.samplingRate = af.samplingRate;
        this.bitRate = af.bitRate;
        this.constantBitRate = af.constantBitRate;
        this.containerFormatIds = new ArrayList<>(af.getContainerFormatIds());
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
     * Gets the value of the channels property.
     *
     */
    public int getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     *
     */
    public void setChannels(int value) {
        this.channels = value;
    }

    /**
     * Gets the value of the sampleSize property.
     *
     */
    public int getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     *
     */
    public void setSampleSize(int value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the samplingRate property.
     *
     */
    public int getSamplingRate() {
        return samplingRate;
    }

    /**
     * Sets the value of the samplingRate property.
     *
     */
    public void setSamplingRate(int value) {
        this.samplingRate = value;
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

}
