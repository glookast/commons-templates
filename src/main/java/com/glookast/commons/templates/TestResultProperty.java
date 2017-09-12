
package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TestResultProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STORAGE_PATH_EXISTS"/>
 *     &lt;enumeration value="STORAGE_PATH_IS_FOLDER"/>
 *     &lt;enumeration value="STORAGE_PATH_CAN_READ"/>
 *     &lt;enumeration value="STORAGE_PATH_CAN_WRITE"/>
 *     &lt;enumeration value="STORAGE_PATH_CAN_EXECUTE"/>
 *     &lt;enumeration value="INTERPLAY_REACHABLE"/>
 *     &lt;enumeration value="INTERPLAY_ROOT_FOLDER_EXISTS"/>
 *     &lt;enumeration value="INTERPLAY_FOLDER_EXISTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TestResultProperty", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum TestResultProperty
{

    STORAGE_PATH_EXISTS,
    STORAGE_PATH_IS_FOLDER,
    STORAGE_PATH_CAN_READ,
    STORAGE_PATH_CAN_WRITE,
    STORAGE_PATH_CAN_EXECUTE,
    INTERPLAY_REACHABLE,
    INTERPLAY_ROOT_FOLDER_EXISTS,
    INTERPLAY_FOLDER_EXISTS;

    public String value() {
        return name();
    }

    public static TestResultProperty fromValue(String v) {
        return valueOf(v);
    }

}
