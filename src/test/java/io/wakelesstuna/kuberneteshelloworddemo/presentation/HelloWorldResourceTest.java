package io.wakelesstuna.kuberneteshelloworddemo.presentation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldResourceTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void sayHelloEndPointTest() throws Exception {
        final String url = "/hello";
        mockMvc.perform(MockMvcRequestBuilders.get(url))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.message")
                        .value("Hello, World!"));
    }
}