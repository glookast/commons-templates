package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


/**
 * <p>Java class for ArvatoEditMateMetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="ArvatoEditMateMetadataSystem">
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
 *         <element name="metadataFieldsMap" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@SuperBuilder(toBuilder = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArvatoEditMateMetadataSystem", propOrder = {
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
    "restrictionColorName",
    "metadataFieldsMap"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = ArvatoEditMateMetadataSystem.class)
public class ArvatoEditMateMetadataSystem
    extends MetadataSystem {

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
    protected Map<String, String> metadataFieldsMap;

    public static Map<String, String> parseMetadataFieldsMap(String json) {

        if (json != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                Map<String, String> parsedMap = mapper.reader().forType(HashMap.class).readValue(json);
                // exclude empty keys
                parsedMap.keySet().removeIf(String::isEmpty);
                return parsedMap;
            } catch (IOException ex) {
                Logger.getLogger(ArvatoEditMateMetadataSystem.class.getName()).warning(ex.getMessage());
            }
        }

        return new HashMap<>();

    }

}
