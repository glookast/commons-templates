
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvidPamMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidPamMetadataSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="workgroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="realm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidPamMetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "hostname",
    "port",
    "workgroup",
    "username",
    "password",
    "realm",
    "folder"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = AvidPamMetadataSystem.class)
public class AvidPamMetadataSystem
    extends MetadataSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String hostname;
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    @XmlElement(required = true)
    protected String workgroup;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String realm;
    @XmlElement(required = true)
    protected String folder;

    /**
     * Default no-arg constructor
     *
     */
    public AvidPamMetadataSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public AvidPamMetadataSystem(final UUID id, final String name, final String description, final String hostname, final int port, final String workgroup, final String username, final String password, final String realm, final String folder) {
        super(id, name, description);
        this.hostname = hostname;
        this.port = port;
        this.workgroup = workgroup;
        this.username = username;
        this.password = password;
        this.realm = realm;
        this.folder = folder;
    }

    public AvidPamMetadataSystem(AvidPamMetadataSystem ms) {
        super(ms);
        this.hostname = ms.hostname;
        this.port = ms.port;
        this.workgroup = ms.workgroup;
        this.username = ms.username;
        this.password = ms.password;
        this.realm = ms.realm;
        this.folder = ms.folder;
    }

    /**
     * Gets the value of the hostname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the port property.
     *
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     *
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the workgroup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWorkgroup() {
        return workgroup;
    }

    /**
     * Sets the value of the workgroup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWorkgroup(String value) {
        this.workgroup = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the realm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRealm(String value) {
        this.realm = value;
    }

    /**
     * Gets the value of the folder property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFolder(String value) {
        this.folder = value;
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
        AvidPamMetadataSystem that = (AvidPamMetadataSystem) o;
        return getPort() == that.getPort() &&
               Objects.equals(getHostname(), that.getHostname()) &&
               Objects.equals(getWorkgroup(), that.getWorkgroup()) &&
               Objects.equals(getUsername(), that.getUsername()) &&
               Objects.equals(getPassword(), that.getPassword()) &&
               Objects.equals(getRealm(), that.getRealm()) &&
               Objects.equals(getFolder(), that.getFolder());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getHostname(), getPort(), getWorkgroup(), getUsername(), getPassword(), getRealm(), getFolder());
    }

    @Override
    public String toString()
    {
        return "AvidPamMetadataSystem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", hostname='" + hostname + '\'' +
               ", port=" + port +
               ", workgroup='" + workgroup + '\'' +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", realm='" + realm + '\'' +
               ", folder='" + folder + '\'' +
               '}';
    }
}
