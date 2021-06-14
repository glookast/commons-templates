package com.glookast.commons.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class AvidMamMetadataSystemTest {

    @Test
    void parseUnsupportedJSON() throws IOException {

        final String json = "{\n" +
            "\"@type\": \"SomeNotYetSupportedType\",\n" +
            "\"id\": \"62f5f283-d8e7-4f1a-83b0-f2c83d834472\",\n" +
            "\"name\": \"name\",\n" +
            "\"description\": \"description\",\n" +
            "\"location\" : \"c:\\\\temp\"\n" +
            "}\n" +
            "}";

        ObjectMapper mapper = new ObjectMapper();

        MetadataSystem parsedMS = mapper.readValue(json, MetadataSystem.class);

        Assertions.assertNotNull(parsedMS);

        Assertions.assertTrue(parsedMS instanceof UnsupportedMetadataSystem);

    }

}