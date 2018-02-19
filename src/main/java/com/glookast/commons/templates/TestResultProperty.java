
package com.glookast.commons.templates;

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
 *     &lt;enumeration value="STORAGE_PATH_EXISTS"/&gt;
 *     &lt;enumeration value="STORAGE_PATH_IS_FOLDER"/&gt;
 *     &lt;enumeration value="STORAGE_PATH_CAN_READ"/&gt;
 *     &lt;enumeration value="STORAGE_PATH_CAN_WRITE"/&gt;
 *     &lt;enumeration value="STORAGE_PATH_CAN_EXECUTE"/&gt;
 *     &lt;enumeration value="INTERPLAY_REACHABLE"/&gt;
 *     &lt;enumeration value="INTERPLAY_ROOT_FOLDER_EXISTS"/&gt;
 *     &lt;enumeration value="INTERPLAY_FOLDER_EXISTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value()
    {
        return name();
    }

    public static TestResultProperty fromValue(String v)
    {
        return valueOf(v);
    }

}
