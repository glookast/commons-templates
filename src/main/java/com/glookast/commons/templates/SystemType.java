
package com.glookast.commons.templates;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GENERIC"/&gt;
 *     &lt;enumeration value="AVID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SystemType", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum SystemType
{

    GENERIC,
    AVID;

    public String value()
    {
        return name();
    }

    public static SystemType fromValue(String v)
    {
        return valueOf(v);
    }

}
