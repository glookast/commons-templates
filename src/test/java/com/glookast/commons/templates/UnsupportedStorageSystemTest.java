package com.glookast.commons.templates;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UnsupportedStorageSystemTest {

    @Test
    void parseInvalidStorageSystemJSON() {

        final String json = "invalidJSON";

        ObjectMapper mapper = new ObjectMapper();

        assertThrows(JsonParseException.class, () -> mapper.reader().readValue(json));

    }

    @Test
    void parseUnsupportedStorageSystemJSON() throws IOException {

        final String json = "{\n" +
            "\"@type\": \"SomeNotYetSupportedType\",\n" +
            "\"id\": \"62f5f283-d8e7-4f1a-83b0-f2c83d834472\",\n" +
            "\"name\": \"New Storage System 123\",\n" +
            "\"description\": \"some description\",\n" +
            "\"location\" : \"c:\\\\temp\"\n" +
            "}\n" +
            "}";

        ObjectMapper mapper = new ObjectMapper();

        StorageSystem storageSystem = mapper.readValue(json, StorageSystem.class);

        assertTrue(storageSystem instanceof UnsupportedStorageSystem);

        assertEquals(storageSystem.id.toString(), "62f5f283-d8e7-4f1a-83b0-f2c83d834472");
        assertEquals(storageSystem.name, "New Storage System 123");
        assertEquals(storageSystem.description, "some description");

    }

}