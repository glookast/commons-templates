package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for ArvatoEditMateMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="AvidMamMetadataSystem">
 *   <complexContent>
 *     <extension base="{http://templates.commons.glookast.com}MetadataSystem">
 *       <sequence>
 *         <element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         <element name="ssl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="locatorTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="locatorNoteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="locatorColorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="restrictionTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="restrictionNoteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="restrictionColorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvidMamMetadataSystem", propOrder = {
    "hostname",
    "port",
    "ssl",
    "username",
    "password",
    "locatorTypeName",
    "locatorNoteName",
    "locatorColorName",
    "restrictionTypeName",
    "restrictionNoteName",
    "restrictionColorName"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = ArvatoEditMateMetadataSystem.class)
public class ArvatoEditMateMetadataSystem
    extends MetadataSystem
    implements Serializable {

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
    protected String locatorTypeName;
    @XmlElement(required = true)
    protected String locatorNoteName;
    @XmlElement(required = true)
    protected String locatorColorName;
    @XmlElement(required = true)
    protected String restrictionTypeName;
    @XmlElement(required = true)
    protected String restrictionNoteName;
    @XmlElement(required = true)
    protected String restrictionColorName;

}
