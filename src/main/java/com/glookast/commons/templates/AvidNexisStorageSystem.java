
package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for AvidNexisStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidNexisStorageSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}AvidStorageSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemDirector" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workspace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidNexisStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "systemDirector",
    "workspace"
})
public class AvidNexisStorageSystem
    extends AvidStorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String systemDirector;
    @XmlElement(required = true)
    protected String workspace;

    /**
     * Default no-arg constructor
     */
    public AvidNexisStorageSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidNexisStorageSystem(final UUID id, final String name, final String description, final String systemDirector, final String workspace)
    {
        super(id, name, description);
        this.systemDirector = systemDirector;
        this.workspace = workspace;
    }

    public AvidNexisStorageSystem(AvidNexisStorageSystem ss)
    {
        super(ss);
        this.systemDirector = ss.systemDirector;
        this.workspace = ss.workspace;
    }

    /**
     * Gets the value of the systemDirector property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSystemDirector()
    {
        return systemDirector;
    }

    /**
     * Sets the value of the systemDirector property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSystemDirector(String value)
    {
        this.systemDirector = value;
    }

    /**
     * Gets the value of the workspace property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWorkspace()
    {
        return workspace;
    }

    /**
     * Sets the value of the workspace property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWorkspace(String value)
    {
        this.workspace = value;
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
        AvidNexisStorageSystem that = (AvidNexisStorageSystem) o;
        return Objects.equals(getSystemDirector(), that.getSystemDirector()) &&
               Objects.equals(getWorkspace(), that.getWorkspace());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), getSystemDirector(), getWorkspace());
    }

    @Override
    public String toString()
    {
        return "AvidNexisStorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", systemDirector=" + systemDirector + ", workspace=" + workspace + '}';
    }
}
