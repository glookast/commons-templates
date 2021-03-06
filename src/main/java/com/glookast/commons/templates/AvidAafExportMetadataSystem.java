
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for AvidAafExportMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidAafExportMetadataSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pmrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidAafExportMetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location",
    "pmrEnabled"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = AvidAafExportMetadataSystem.class)
public class AvidAafExportMetadataSystem
    extends MetadataSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String location;
    protected boolean pmrEnabled;

    /**
     * Default no-arg constructor
     */
    public AvidAafExportMetadataSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidAafExportMetadataSystem(final UUID id, final String name, final String description, final String location, final boolean pmrEnabled)
    {
        super(id, name, description);
        this.location = location;
        this.pmrEnabled = pmrEnabled;
    }

    public AvidAafExportMetadataSystem(AvidAafExportMetadataSystem ms)
    {
        super(ms);
        this.location = ms.location;
        this.pmrEnabled = ms.pmrEnabled;
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

    /**
     * Gets the value of the pmrEnabled property.
     */
    public boolean isPmrEnabled()
    {
        return pmrEnabled;
    }

    /**
     * Sets the value of the pmrEnabled property.
     */
    public void setPmrEnabled(boolean value)
    {
        this.pmrEnabled = value;
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
        if (!super.equals(o)) {
            return false;
        }
        AvidAafExportMetadataSystem that = (AvidAafExportMetadataSystem) o;
        return isPmrEnabled() == that.isPmrEnabled() &&
               Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getLocation(), isPmrEnabled());
    }

    @Override
    public String toString()
    {
        return "AvidAafExportMetadataSystem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", location='" + location + '\'' +
               ", pmrEnabled=" + pmrEnabled +
               '}';
    }
}
