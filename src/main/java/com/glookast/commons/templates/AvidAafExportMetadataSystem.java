
package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvidAafExportMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidAafExportMetadataSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidAafExportMetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location"
})
public class AvidAafExportMetadataSystem
    extends MetadataSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String location;

    /**
     * Default no-arg constructor
     *
     */
    public AvidAafExportMetadataSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public AvidAafExportMetadataSystem(final UUID id, final String name, final String description, final String location) {
        super(id, name, description);
        this.location = location;
    }

    public AvidAafExportMetadataSystem(AvidAafExportMetadataSystem ms)
    {
        super(ms);
        this.location = ms.location;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
