package io.wakelesstuna.kuberneteshelloworddemo.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloResponseTest {

    private final String payload = "" +
            "{\n" +
            "    \"message\": \"Hello, World!\"\n" +
            "}";

    @Test
    void canSerialize() throws JsonProcessingException {
        HelloResponse actualResponse = new ObjectMapper().readValue(payload, HelloResponse.class);
        assertEquals("Hello, World!", actualResponse.getMessage());
    }
}