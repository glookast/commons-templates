package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataSystemType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPORT_XML"/>
 *     &lt;enumeration value="EXPORT_AAF"/>
 *     &lt;enumeration value="INTERPLAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MetadataSystemType", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum MetadataSystemType {

    EXPORT_XML,
    EXPORT_AAF,
    INTERPLAY;

    public String value() {
        return name();
    }

    public static MetadataSystemType fromValue(String v) {
        return valueOf(v);
    }

}
