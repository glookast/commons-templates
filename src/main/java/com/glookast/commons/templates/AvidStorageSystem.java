
package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.UUID;


/**
 * <p>Java class for AvidStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvidStorageSystem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://templates.commons.glookast.com}StorageSystem"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidStorageSystem", namespace = "http://templates.commons.glookast.com")
@XmlSeeAlso({
    AvidNexisStorageSystem.class,
    AvidOtherStorageSystem.class,
    AvidMediaNetworkStorageSystem.class
})
public abstract class AvidStorageSystem
    extends StorageSystem
    implements Serializable
{


    /**
     * Default no-arg constructor
     */
    public AvidStorageSystem()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public AvidStorageSystem(final UUID id, final String name, final String description)
    {
        super(id, name, description);
    }

    public AvidStorageSystem(AvidStorageSystem ss)
    {
        super(ss);
    }

    @Override
    public String toString()
    {
        return "AvidStorageSystem{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
