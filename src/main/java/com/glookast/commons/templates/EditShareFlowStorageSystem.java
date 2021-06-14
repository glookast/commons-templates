package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditShareFlowStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="EditShareFlowStorageSystem">
 *   <complexContent>
 *     <extension base="{http://templates.commons.glookast.com}StorageSystem">
 *       <sequence>
 *         <element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         <element name="ssl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="storageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mediaSpace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hasFlowProxy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "EditShareFlowStorageSystem", propOrder = {
    "hostname",
    "port",
    "ssl",
    "username",
    "password",
    "storageURL",
    "mediaSpace",
    "hasFlowProxy"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = EditShareFlowStorageSystem.class)
public class EditShareFlowStorageSystem
    extends StorageSystem {

    protected String hostname;
    @XmlSchemaType(name = "unsignedShort")
    protected int port;
    protected boolean ssl;
    protected String username;
    protected String password;
    protected String storageURL;
    protected String mediaSpace;
    protected boolean flowProxy;

}
