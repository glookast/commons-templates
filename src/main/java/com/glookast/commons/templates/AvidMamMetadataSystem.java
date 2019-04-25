
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for AvidMamMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidMamMetadataSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}MetadataSystem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="ssl" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="realm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicationSecret" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="folderGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidMamMetadataSystem", propOrder = {
    "hostname",
    "port",
    "ssl",
    "username",
    "password",
    "realm",
    "applicationId",
    "applicationSecret",
    "folderGuid"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = AvidMamMetadataSystem.class)
public class AvidMamMetadataSystem
    extends MetadataSystem
    implements Serializable
{

    @XmlElement(required = true)
    protected String hostname;
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    protected boolean ssl;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String realm;
    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected String applicationSecret;
    @XmlElement(required = true)
    protected String folderGuid;

    /**
     * Default no-arg constructor
     */
    public AvidMamMetadataSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidMamMetadataSystem(final UUID id, final String name, final String description, final String hostname, final int port, final boolean ssl, final String username, final String password, final String realm, final String applicationId, final String applicationSecret, final String folderGuid)
    {
        super(id, name, description);
        this.hostname = hostname;
        this.port = port;
        this.ssl = ssl;
        this.username = username;
        this.password = password;
        this.realm = realm;
        this.applicationId = applicationId;
        this.applicationSecret = applicationSecret;
        this.folderGuid = folderGuid;
    }

    public AvidMamMetadataSystem(AvidMamMetadataSystem ms)
    {
        super(ms);
        this.hostname = ms.hostname;
        this.port = ms.port;
        this.ssl = ms.ssl;
        this.username = ms.username;
        this.password = ms.password;
        this.realm = ms.realm;
        this.applicationId = ms.applicationId;
        this.applicationSecret = ms.applicationSecret;
        this.folderGuid = ms.folderGuid;
    }

    /**
     * Gets the value of the hostname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHostname()
    {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHostname(String value)
    {
        this.hostname = value;
    }

    /**
     * Gets the value of the port property.
     */
    public int getPort()
    {
        return port;
    }

    /**
     * Sets the value of the port property.
     */
    public void setPort(int value)
    {
        this.port = value;
    }

    /**
     * Gets the value of the ssl property.
     */
    public boolean isSsl()
    {
        return ssl;
    }

    /**
     * Sets the value of the ssl property.
     */
    public void setSsl(boolean value)
    {
        this.ssl = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsername(String value)
    {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPassword(String value)
    {
        this.password = value;
    }

    /**
     * Gets the value of the realm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRealm()
    {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRealm(String value)
    {
        this.realm = value;
    }

    /**
     * Gets the value of the applicationId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplicationId()
    {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplicationId(String value)
    {
        this.applicationId = value;
    }

    /**
     * Gets the value of the applicationSecret property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApplicationSecret()
    {
        return applicationSecret;
    }

    /**
     * Sets the value of the applicationSecret property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApplicationSecret(String value)
    {
        this.applicationSecret = value;
    }

    /**
     * Gets the value of the folderGuid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFolderGuid()
    {
        return folderGuid;
    }

    /**
     * Sets the value of the folderGuid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFolderGuid(String value)
    {
        this.folderGuid = value;
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
        AvidMamMetadataSystem that = (AvidMamMetadataSystem) o;
        return getPort() == that.getPort() &&
               isSsl() == that.isSsl() &&
               Objects.equals(getHostname(), that.getHostname()) &&
               Objects.equals(getUsername(), that.getUsername()) &&
               Objects.equals(getPassword(), that.getPassword()) &&
               Objects.equals(getRealm(), that.getRealm()) &&
               Objects.equals(getApplicationId(), that.getApplicationId()) &&
               Objects.equals(getApplicationSecret(), that.getApplicationSecret()) &&
               Objects.equals(getFolderGuid(), that.getFolderGuid());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getHostname(), getPort(), isSsl(), getUsername(), getPassword(), getRealm(), getApplicationId(), getApplicationSecret(), getFolderGuid());
    }

    @Override
    public String toString()
    {
        return "AvidMamMetadataSystem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", hostname='" + hostname + '\'' +
               ", port=" + port +
               ", ssl=" + ssl +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", realm='" + realm + '\'' +
               ", applicationId='" + applicationId + '\'' +
               ", applicationSecret='" + applicationSecret + '\'' +
               ", folderGuid='" + folderGuid + '\'' +
               '}';
    }
}
