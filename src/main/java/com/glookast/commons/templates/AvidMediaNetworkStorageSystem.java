
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
 * <p>Java class for AvidMediaNetworkStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidMediaNetworkStorageSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}AvidStorageSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileManager" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workspace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidMediaNetworkStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "fileManager",
    "workspace"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = AvidMediaNetworkStorageSystem.class)
public class AvidMediaNetworkStorageSystem
    extends AvidStorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String fileManager;
    @XmlElement(required = true)
    protected String workspace;

    /**
     * Default no-arg constructor
     */
    public AvidMediaNetworkStorageSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidMediaNetworkStorageSystem(final UUID id, final String name, final String description, final String fileManager, final String workspace)
    {
        super(id, name, description);
        this.fileManager = fileManager;
        this.workspace = workspace;
    }

    public AvidMediaNetworkStorageSystem(AvidMediaNetworkStorageSystem ss)
    {
        super(ss);
        this.fileManager = ss.fileManager;
        this.workspace = ss.workspace;
    }

    /**
     * Gets the value of the fileManager property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileManager()
    {
        return fileManager;
    }

    /**
     * Sets the value of the fileManager property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileManager(String value)
    {
        this.fileManager = value;
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
        AvidMediaNetworkStorageSystem that = (AvidMediaNetworkStorageSystem) o;
        return Objects.equals(getFileManager(), that.getFileManager()) &&
               Objects.equals(getWorkspace(), that.getWorkspace());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(super.hashCode(), getFileManager(), getWorkspace());
    }

    @Override
    public String toString()
    {
        return "AvidMediaNetworkStorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", fileManager=" + fileManager + ", workspace=" + workspace + '}';
    }


}
