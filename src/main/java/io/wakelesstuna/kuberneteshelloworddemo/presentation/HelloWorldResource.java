package io.wakelesstuna.kuberneteshelloworddemo.presentation;

import io.wakelesstuna.kuberneteshelloworddemo.application.HelloService;
import io.wakelesstuna.kuberneteshelloworddemo.domain.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldResource {

    private final HelloService helloService;

    public HelloWorldResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public ResponseEntity<HelloResponse> sayHello() {
        HelloResponse helloResponse = helloService.sayHello();
        return ResponseEntity.ok(helloResponse);
    }

}
