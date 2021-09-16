package io.wakelesstuna.kuberneteshelloworddemo.application;

import io.wakelesstuna.kuberneteshelloworddemo.domain.HelloResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloService {

    public HelloResponse sayHello() {
        log.info("saying hello to request");
        return new HelloResponse("Hello, World!");
    }

}
