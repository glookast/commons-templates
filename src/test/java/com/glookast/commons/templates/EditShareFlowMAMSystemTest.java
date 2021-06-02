package com.glookast.commons.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EditShareFlowStorageSystemTest {

    @Test
    public void emptyMetadataSystem() {

        final EditShareFlowStorageSystem ms = new EditShareFlowStorageSystem();
        Assertions.assertNotNull(ms);

    }

    @Test
    void toJSON() throws IOException {

        EditShareFlowStorageSystem ms = EditShareFlowStorageSystem.builder()
            .id(UUID.randomUUID())
            .name("name")
            .description("description")
            .hostname("hostname")
            .port(1234)
            .ssl(true)
            .username("username")
            .password("password")
            .storageURL("storage url")
            .mediaSpace("media space")
            .flowProxy(true)
            .build();

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(ms);

        assertNotNull(json);

        // parse it and check it again
        EditShareFlowStorageSystem parsedMS = mapper.reader()
            .forType(EditShareFlowStorageSystem.class).readValue(json);

        assertNotNull(parsedMS);
        assertEquals(ms, parsedMS);

    }

    @Test
    void parseJSON() throws IOException {

        final String json = "{\n" +
            "  \"@type\": \"EditShareFlowStorageSystem\",\n" +
            "  \"id\": \"f1806846-76c5-4b2a-97ea-6e9948817fbc\",\n" +
            "  \"name\": \"name\",\n" +
            "  \"description\": \"description\",\n" +
            "  \"hostname\": \"hostname\",\n" +
            "  \"port\": 1234,\n" +
            "  \"ssl\": true,\n" +
            "  \"username\": \"username\",\n" +
            "  \"password\": \"password\",\n" +
            "  \"storageURL\": \"storage url\",\n" +
            "  \"mediaSpace\": \"media space\",\n" +
            "  \"flowProxy\": true\n" +
            "}";


        ObjectMapper mapper = new ObjectMapper();

        EditShareFlowStorageSystem parsedMS = mapper.reader()
            .forType(EditShareFlowStorageSystem.class).readValue(json);

        Assertions.assertNotNull(parsedMS);

        Assertions.assertEquals(parsedMS.getId(), UUID.fromString("f1806846-76c5-4b2a-97ea-6e9948817fbc"));
        Assertions.assertEquals(parsedMS.getName(), "name");
        Assertions.assertEquals(parsedMS.getDescription(), "description");
        Assertions.assertEquals(parsedMS.getHostname(), "hostname");
        Assertions.assertEquals(parsedMS.getPort(), 1234);
        Assertions.assertTrue(parsedMS.isSsl());
        Assertions.assertEquals(parsedMS.getUsername(), "username");
        Assertions.assertEquals(parsedMS.getPassword(), "password");
        Assertions.assertEquals(parsedMS.getStorageURL(), "storage url");
        Assertions.assertEquals(parsedMS.getMediaSpace(), "media space");
        Assertions.assertTrue(parsedMS.isFlowProxy());

    }

}