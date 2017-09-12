package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageSystemType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StorageSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="AVID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "StorageSystemType", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum StorageSystemType {

    GENERIC,
    AVID;

    public String value() {
        return name();
    }

    public static StorageSystemType fromValue(String v) {
        return valueOf(v);
    }

}
