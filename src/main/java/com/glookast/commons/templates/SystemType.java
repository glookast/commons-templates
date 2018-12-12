
package com.glookast.commons.templates;

import com.fasterxml.jackson.annotation.JsonProperty;

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
 *     &lt;enumeration value="FTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SystemType", namespace = "http://templates.commons.glookast.com")
@XmlEnum
public enum SystemType
{
    @JsonProperty("GENERIC")
    GENERIC,
    @JsonProperty("AVID")
    AVID,
    @JsonProperty("FTP")
    FTP;

    public String value()
    {
        return name();
    }

    public static SystemType fromValue(String v)
    {
        return valueOf(v);
    }

}
