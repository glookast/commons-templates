
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for FtpStorageSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FtpStorageSystem"&gt;
 *   &lt;complexContent>
 *     &lt;extension base="{http://templates.commons.glookast.com}StorageSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpStorageSystem", propOrder = {
    "hostname",
    "port",
    "folder",
    "username",
    "password"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = FtpStorageSystem.class)
public class FtpStorageSystem
    extends StorageSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String hostname;
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    @XmlElement(required = true)
    protected String folder;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;

    /**
     * Default no-arg constructor
     * 
     */
    public FtpStorageSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FtpStorageSystem(final UUID id, final String name, final String description, final String hostname, final int port, final String folder, final String username, final String password) {
        super(id, name, description);
        this.hostname = hostname;
        this.port = port;
        this.folder = folder;
        this.username = username;
        this.password = password;
    }

    public FtpStorageSystem(FtpStorageSystem ss)
    {
        super(ss);
        this.hostname = ss.hostname;
        this.port = ss.port;
        this.folder = ss.folder;
        this.username = ss.username;
        this.password = ss.password;
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
        FtpStorageSystem that = (FtpStorageSystem) o;
        return getPort() == that.getPort() &&
               Objects.equals(getHostname(), that.getHostname()) &&
               Objects.equals(getFolder(), that.getFolder()) &&
               Objects.equals(getUsername(), that.getUsername()) &&
               Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getHostname(), getPort(), getFolder(), getUsername(), getPassword());
    }

    @Override
    public String toString()
    {
        return "FtpStorageSystem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", hostname='" + hostname + '\'' +
               ", port=" + port +
               ", folder='" + folder + '\'' +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               '}';
    }
}
