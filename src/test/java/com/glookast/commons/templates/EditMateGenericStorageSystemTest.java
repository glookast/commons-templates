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

class EditMateGenericStorageSystemTest {

    @Test
    public void emptyMetadataSystem() {

        final ArvatoEditMateGenericStorageSystem ss = new ArvatoEditMateGenericStorageSystem();
        Assertions.assertNotNull(ss);

    }

    @Test
    void toJSON() throws IOException {

        final Map<String, String> fieldsMap = new HashMap<>();
        fieldsMap.put("glookast", "editmate");

        ArvatoEditMateGenericStorageSystem ss = ArvatoEditMateGenericStorageSystem.builder()
            .location("C:\\location\\")
            .VPMSStorageId("VPMS storage id")
            .build();

        ss.setId(UUID.randomUUID());
        ss.setName("name");
        ss.setDescription("description");

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(ss);

        assertNotNull(json);

        // parse it and check it again
        ArvatoEditMateGenericStorageSystem parsedMS = mapper.reader()
            .forType(ArvatoEditMateGenericStorageSystem.class).readValue(json);

        assertNotNull(parsedMS);
        assertEquals(ss, parsedMS);

    }

    @Test
    void parseJSON() throws IOException {

        final String json = "{\n" +
            "  \"@type\": \"ArvatoEditMateGenericStorageSystem\",\n" +
            "  \"id\": \"e96e57f9-09a5-4af2-9473-c5c9308d0aaf\",\n" +
            "  \"name\": \"name\",\n" +
            "  \"description\": \"description\",\n" +
            "  \"location\": \"C:\\\\location\\\\\",\n" +
            "  \"vpmsstorageId\": \"VPMS storage id\"\n" +
            "}";


        ObjectMapper mapper = new ObjectMapper();

        ArvatoEditMateGenericStorageSystem parsedMS = mapper.reader()
            .forType(ArvatoEditMateGenericStorageSystem.class).readValue(json);

        Assertions.assertNotNull(parsedMS);

        Assertions.assertEquals(parsedMS.getId(), UUID.fromString("e96e57f9-09a5-4af2-9473-c5c9308d0aaf"));
        Assertions.assertEquals(parsedMS.getName(), "name");
        Assertions.assertEquals(parsedMS.getDescription(), "description");
        Assertions.assertEquals(parsedMS.getLocation(), "C:\\location\\");
        Assertions.assertEquals(parsedMS.getVPMSStorageId(), "VPMS storage id");

    }

}