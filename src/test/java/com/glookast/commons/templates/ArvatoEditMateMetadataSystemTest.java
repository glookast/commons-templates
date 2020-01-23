package com.glookast.commons.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ArvatoEditMateMetadataSystemTest {

    @Test
    public void emptyMetadataSystem() {

        final ArvatoEditMateMetadataSystem ms = new ArvatoEditMateMetadataSystem();
        Assertions.assertNotNull(ms);

    }
    
    @Test
    void toJSON() throws IOException {

        final Map<String, String> fieldsMap = new HashMap<>();
        fieldsMap.put("glookast", "editmate");

        ArvatoEditMateMetadataSystem ms = ArvatoEditMateMetadataSystem.builder()
            .id(UUID.randomUUID())
            .name("name")
            .description("description")
            .hostname("hostname")
            .port(1234)
            .ssl(true)
            .username("username")
            .password("password")
            .locatorTypeName("locator_type_name")
            .locatorNoteName("locator_note_name")
            .locatorColorName("locator_color_name")
            .restrictionTypeName("restriction_type_name")
            .restrictionNoteName("restriction_note_name")
            .restrictionColorName("restriction_color_name")
            .metadataFieldsMap(fieldsMap)
            .build();

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(ms);

        assertNotNull(json);

        // parse it and check it again
        ArvatoEditMateMetadataSystem parsedMS = mapper.reader()
            .forType(ArvatoEditMateMetadataSystem.class).readValue(json);

        assertNotNull(parsedMS);
        assertEquals(ms, parsedMS);
        
    }

    @Test
    void parseJSON() throws IOException {

        final String json = "{\n" +
            "    \"@type\": \"ArvatoEditMateMetadataSystem\",\n" +
            "    \"id\": \"62f5f283-d8e7-4f1a-83b0-f2c83d834472\",\n" +
            "    \"name\": \"name\",\n" +
            "    \"description\": \"description\",\n" +
            "    \"hostname\": \"hostname\",\n" +
            "    \"port\": 1234,\n" +
            "    \"ssl\": true,\n" +
            "    \"username\": \"username\",\n" +
            "    \"password\": \"password\",\n" +
            "    \"locatorTypeName\": \"locator_type_name\",\n" +
            "    \"locatorNoteName\": \"locator_note_name\",\n" +
            "    \"locatorColorName\": \"locator_color_name\",\n" +
            "    \"restrictionTypeName\": \"restriction_type_name\",\n" +
            "    \"restrictionNoteName\": \"restriction_note_name\",\n" +
            "    \"restrictionColorName\": \"restriction_color_name\",\n" +
            "    \"metadataFieldsMap\": {\n" +
            "      \"glookast\": \"editmate\"\n" +
            "  }\n" +
            "}";


        ObjectMapper mapper = new ObjectMapper();

        ArvatoEditMateMetadataSystem parsedMS = mapper.reader()
            .forType(ArvatoEditMateMetadataSystem.class).readValue(json);

        Assertions.assertNotNull(parsedMS);

        Assertions.assertEquals(parsedMS.getId(), UUID.fromString("62f5f283-d8e7-4f1a-83b0-f2c83d834472"));
        Assertions.assertEquals(parsedMS.getName(), "name");
        Assertions.assertEquals(parsedMS.getDescription(), "description");
        Assertions.assertEquals(parsedMS.getHostname(), "hostname");
        Assertions.assertEquals(parsedMS.getPort(), 1234);
        Assertions.assertTrue(parsedMS.isSsl());
        Assertions.assertEquals(parsedMS.getUsername(), "username");
        Assertions.assertEquals(parsedMS.getPassword(), "password");
        Assertions.assertEquals(parsedMS.getLocatorTypeName(), "locator_type_name");
        Assertions.assertEquals(parsedMS.getLocatorNoteName(), "locator_note_name");
        Assertions.assertEquals(parsedMS.getLocatorColorName(), "locator_color_name");
        Assertions.assertEquals(parsedMS.getRestrictionTypeName(), "restriction_type_name");
        Assertions.assertEquals(parsedMS.getRestrictionNoteName(), "restriction_note_name");
        Assertions.assertEquals(parsedMS.getRestrictionColorName(), "restriction_color_name");

        final Map<String, String> fieldsMap = new HashMap<>();
        fieldsMap.put("glookast", "editmate");

        Assertions.assertEquals(parsedMS.getMetadataFieldsMap(), fieldsMap);

    }

}