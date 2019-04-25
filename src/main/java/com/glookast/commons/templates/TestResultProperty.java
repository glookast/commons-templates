
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultProperty.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestResultProperty"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_CONNECTION_OK"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_AUTHENTICATION_OK"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_PATH_EXISTS"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_PATH_IS_FOLDER"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_PATH_CAN_READ"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_PATH_CAN_WRITE"/&gt;
 *     &lt;enumeration value="STORAGE_SYSTEM_PATH_CAN_EXECUTE"/&gt;
 *     &lt;enumeration value="METADATA_SYSTEM_CONNECTION_OK"/&gt;
 *     &lt;enumeration value="METADATA_SYSTEM_AUTHENTICATION_OK"/&gt;
 *     &lt;enumeration value="METADATA_SYSTEM_ROOT_FOLDER_EXISTS"/&gt;
 *     &lt;enumeration value="METADATA_SYSTEM_FOLDER_EXISTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "TestResultProperty", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum TestResultProperty {

    @JsonProperty("STORAGE_SYSTEM_CONNECTION_OK")
    STORAGE_SYSTEM_CONNECTION_OK,
    @JsonProperty("STORAGE_SYSTEM_AUTHENTICATION_OK")
    STORAGE_SYSTEM_AUTHENTICATION_OK,
    @JsonProperty("STORAGE_SYSTEM_PATH_EXISTS")
    STORAGE_SYSTEM_PATH_EXISTS,
    @JsonProperty("STORAGE_SYSTEM_PATH_IS_FOLDER")
    STORAGE_SYSTEM_PATH_IS_FOLDER,
    @JsonProperty("STORAGE_SYSTEM_PATH_CAN_READ")
    STORAGE_SYSTEM_PATH_CAN_READ,
    @JsonProperty("STORAGE_SYSTEM_PATH_CAN_WRITE")
    STORAGE_SYSTEM_PATH_CAN_WRITE,
    @JsonProperty("STORAGE_SYSTEM_PATH_CAN_EXECUTE")
    STORAGE_SYSTEM_PATH_CAN_EXECUTE,
    @JsonProperty("METADATA_SYSTEM_CONNECTION_OK")
    METADATA_SYSTEM_CONNECTION_OK,
    @JsonProperty("METADATA_SYSTEM_AUTHENTICATION_OK")
    METADATA_SYSTEM_AUTHENTICATION_OK,
    @JsonProperty("METADATA_SYSTEM_ROOT_FOLDER_EXISTS")
    METADATA_SYSTEM_ROOT_FOLDER_EXISTS,
    @JsonProperty("METADATA_SYSTEM_FOLDER_EXISTS")
    METADATA_SYSTEM_FOLDER_EXISTS;

    public String value() {
        return name();
    }

    public static TestResultProperty fromValue(String v) {
        return valueOf(v);
    }

}
