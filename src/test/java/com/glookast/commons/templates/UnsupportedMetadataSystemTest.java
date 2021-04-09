package com.glookast.commons.templates;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UnsupportedMetadataSystemTest {

    @Test
    void parseInvalidMetadataSystemJSON() {

        final String json = "invalidJSON";

        ObjectMapper mapper = new ObjectMapper();

        assertThrows(JsonParseException.class, () -> mapper.reader().readValue(json));

    }

    @Test
    void parseUnsupportedMetadataSystemJSON() throws IOException {

        final String json = "{\n" +
            "\"@type\": \"SomeNotYetSupportedType\",\n" +
            "\"id\": \"62f5f283-d8e7-4f1a-83b0-f2c83d834472\",\n" +
            "\"name\": \"New Metadata System 123\",\n" +
            "\"description\": \"some description\",\n" +
            "\"location\" : \"c:\\\\temp\"\n" +
            "}\n" +
            "}";

        ObjectMapper mapper = new ObjectMapper();

        MetadataSystem metadataSystem = mapper.readValue(json, MetadataSystem.class);

        assertTrue(metadataSystem instanceof UnsupportedMetadataSystem);

        assertEquals(metadataSystem.id.toString(), "62f5f283-d8e7-4f1a-83b0-f2c83d834472");
        assertEquals(metadataSystem.name, "New Metadata System 123");
        assertEquals(metadataSystem.description, "some description");

    }

}