package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArvatoEditMateGenericStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="ArvatoEditMateGenericStorageSystem">
 *   <complexContent>
 *     <extension base="{http://templates.commons.glookast.com}StorageSystem">
 *       <sequence>
 *         <element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="VPMSStorageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ArvatoEditMateGenericStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location",
    "option",
    "VPMSStorageId"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = ArvatoEditMateGenericStorageSystem.class)
public class ArvatoEditMateGenericStorageSystem
    extends StorageSystem {

    @XmlElement(required = true)
    protected String location;

    @XmlElement(required = true)
    protected String option;
    
    @XmlElement(required = true)
    @JsonProperty("VPMSStorageId")
    protected String VPMSStorageId;

}
