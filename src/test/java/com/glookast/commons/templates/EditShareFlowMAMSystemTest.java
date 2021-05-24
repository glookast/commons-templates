package com.glookast.commons.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EditShareFlowMAMSystemTest {

    @Test
    public void emptyMetadataSystem() {

        final EditShareFlowMAMSystem ms = new EditShareFlowMAMSystem();
        Assertions.assertNotNull(ms);

    }

    @Test
    void toJSON() throws IOException {

        EditShareFlowMAMSystem ms = EditShareFlowMAMSystem.builder()
            .id(UUID.randomUUID())
            .name("name")
            .description("description")
            .hostname("hostname")
            .portNumber(1234)
            .ssl(true)
            .username("username")
            .password("password")
            .storageUrl("storage url")
            .mediaSpace("media space")
            .flowProxy(true)
            .build();

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(ms);

        assertNotNull(json);

        // parse it and check it again
        EditShareFlowMAMSystem parsedMS = mapper.reader()
            .forType(EditShareFlowMAMSystem.class).readValue(json);

        assertNotNull(parsedMS);
        assertEquals(ms, parsedMS);

    }

    @Test
    void parseJSON() throws IOException {

        final String json = "{\n" +
            "  \"@type\": \"EditShareFlowMAMSystem\",\n" +
            "  \"id\": \"f1806846-76c5-4b2a-97ea-6e9948817fbc\",\n" +
            "  \"name\": \"name\",\n" +
            "  \"description\": \"description\",\n" +
            "  \"hostname\": \"hostname\",\n" +
            "  \"portNumber\": 1234,\n" +
            "  \"ssl\": true,\n" +
            "  \"username\": \"username\",\n" +
            "  \"password\": \"password\",\n" +
            "  \"storageUrl\": \"storage url\",\n" +
            "  \"mediaSpace\": \"media space\",\n" +
            "  \"flowProxy\": true\n" +
            "}";


        ObjectMapper mapper = new ObjectMapper();

        EditShareFlowMAMSystem parsedMS = mapper.reader()
            .forType(EditShareFlowMAMSystem.class).readValue(json);

        Assertions.assertNotNull(parsedMS);

        Assertions.assertEquals(parsedMS.getId(), UUID.fromString("f1806846-76c5-4b2a-97ea-6e9948817fbc"));
        Assertions.assertEquals(parsedMS.getName(), "name");
        Assertions.assertEquals(parsedMS.getDescription(), "description");
        Assertions.assertEquals(parsedMS.getHostname(), "hostname");
        Assertions.assertEquals(parsedMS.getPortNumber(), 1234);
        Assertions.assertTrue(parsedMS.isSsl());
        Assertions.assertEquals(parsedMS.getUsername(), "username");
        Assertions.assertEquals(parsedMS.getPassword(), "password");
        Assertions.assertEquals(parsedMS.getStorageUrl(), "storage url");
        Assertions.assertEquals(parsedMS.getMediaSpace(), "media space");
        Assertions.assertTrue(parsedMS.isFlowProxy());

    }

}