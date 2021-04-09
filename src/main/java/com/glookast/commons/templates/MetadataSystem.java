package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.glookast.commons.templates.resolvers.MetadataSystemTemplateResolver;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.util.UUID;


/**
 * <p>Java class for MetadataSystem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="MetadataSystem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://base.commons.glookast.com}UUID"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@SuperBuilder(toBuilder = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataSystem", namespace = "http://templates.commons.glookast.com", propOrder = {
    "id",
    "name",
    "description"
})
@XmlSeeAlso({
    AvidAafExportMetadataSystem.class,
    AvidMamMetadataSystem.class,
    AvidPamMetadataSystem.class,
    XmlExportMetadataSystem.class,
    ArvatoEditMateMetadataSystem.class
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AvidAafExportMetadataSystem.class, name = "AvidAafExportMetadataSystem"),
    @JsonSubTypes.Type(value = AvidMamMetadataSystem.class, name = "AvidMamMetadataSystem"),
    @JsonSubTypes.Type(value = AvidPamMetadataSystem.class, name = "AvidPamMetadataSystem"),
    @JsonSubTypes.Type(value = XmlExportMetadataSystem.class, name = "XmlExportMetadataSystem"),
    @JsonSubTypes.Type(value = JsonExportMetadataSystem.class, name = "JsonExportMetadataSystem"),
    @JsonSubTypes.Type(value = ArvatoEditMateMetadataSystem.class, name = "ArvatoEditMateMetadataSystem")
})
@JsonTypeIdResolver(MetadataSystemTemplateResolver.class)
public abstract class MetadataSystem extends BaseTemplate {

    /**
     * Default no-arg constructor
     */
    public MetadataSystem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public MetadataSystem(final UUID id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public MetadataSystem(MetadataSystem ms) {
        this.id = ms.id;
        this.name = ms.name;
        this.description = ms.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataSystem that = (MetadataSystem) o;
        return Objects.equals(getId(), that.getId()) &&
            Objects.equals(getName(), that.getName()) &&
            Objects.equals(getDescription(), that.getDescription());
    }

}
