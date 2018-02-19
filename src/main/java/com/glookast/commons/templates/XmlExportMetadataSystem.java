
package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.UUID;


/**
 * <p>Java class for XmlExportMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XmlExportMetadataSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlExportMetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location"
})
public class XmlExportMetadataSystem
    extends MetadataSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String location;

    /**
     * Default no-arg constructor
     */
    public XmlExportMetadataSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public XmlExportMetadataSystem(final UUID id, final String name, final String description, final String location)
    {
        super(id, name, description);
        this.location = location;
    }

    public XmlExportMetadataSystem(XmlExportMetadataSystem ms)
    {
        super(ms);
        this.location = ms.location;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocation(String value)
    {
        this.location = value;
    }

    @Override
    public String toString()
    {
        return "XmlExportMetadataSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", location=" + location + '}';
    }


}
