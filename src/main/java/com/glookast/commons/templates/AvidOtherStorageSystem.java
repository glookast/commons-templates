
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
 * <p>Java class for AvidOtherStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidOtherStorageSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}AvidStorageSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidOtherStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = AvidOtherStorageSystem.class)
public class AvidOtherStorageSystem
    extends AvidStorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String location;

    /**
     * Default no-arg constructor
     */
    public AvidOtherStorageSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidOtherStorageSystem(final UUID id, final String name, final String description, final String location)
    {
        super(id, name, description);
        this.location = location;
    }

    public AvidOtherStorageSystem(AvidOtherStorageSystem ss)
    {
        super(ss);
        this.location = ss.location;
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
        AvidOtherStorageSystem that = (AvidOtherStorageSystem) o;
        return Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), getLocation());
    }

    @Override
    public String toString()
    {
        return "AvidOtherStorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", location=" + location + '}';
    }
}
