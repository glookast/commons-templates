
package com.glookast.commons.templates;

import java.io.Serializable;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvidInterplayMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidInterplayMetadataSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem">
 *       &lt;sequence>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="workgroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidInterplayMetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "hostname",
    "port",
    "workgroup",
    "username",
    "password",
    "folder"
})
public class AvidInterplayMetadataSystem
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
    protected String folder;

    /**
     * Default no-arg constructor
     *
     */
    public AvidInterplayMetadataSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     *
     */
    public AvidInterplayMetadataSystem(final UUID id, final String name, final String description, final String hostname, final int port, final String workgroup, final String username, final String password, final String folder) {
        super(id, name, description);
        this.hostname = hostname;
        this.port = port;
        this.workgroup = workgroup;
        this.username = username;
        this.password = password;
        this.folder = folder;
    }

    public AvidInterplayMetadataSystem(AvidInterplayMetadataSystem ms)
    {
        super(ms);
        this.hostname = ms.hostname;
        this.port = ms.port;
        this.workgroup = ms.workgroup;
        this.username = ms.username;
        this.password = ms.password;
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
    public String toString()
    {
        return "AvidInterplayMetadataSystem{" + "id=" + id + ", name=" + name + ", description=" + description + ", hostname=" + hostname + ", port=" + port + ", workgroup=" + workgroup + ", username=" + username + ", password=[RESTRICTED], folder=" + folder + '}';
    }


}
