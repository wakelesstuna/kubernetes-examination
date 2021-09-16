package io.wakelesstuna.kuberneteshelloworddemo.application;

import io.wakelesstuna.kuberneteshelloworddemo.domain.HelloResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloServiceTest {

    @Mock
    HelloService helloService;

    @Test
    void sayHello() {
        HelloResponse expectedResponse = new HelloResponse("Hello, World!");
        HelloResponse testResponse = new HelloResponse("Hello, World!");

        when(helloService.sayHello())
                .thenReturn(testResponse);

        HelloResponse actualResponse = helloService.sayHello();

        assertEquals(expectedResponse.getMessage(), actualResponse.getMessage());
    }
}