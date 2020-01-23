package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for GenericStorageSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="GenericStorageSystem">
 *   <complexContent>
 *     <extension base="{http://templates.commons.glookast.com}StorageSystem">
 *       <sequence>
 *         <element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GenericStorageSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "location"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, defaultImpl = ArvatoEditMateGenericStorageSystem.class)
public class ArvatoEditMateGenericStorageSystem
    extends StorageSystem
    implements Serializable {

    @XmlElement(required = true)
    protected String location;

    @XmlElement(required = true)
    protected String VPMSStorageId;

}
