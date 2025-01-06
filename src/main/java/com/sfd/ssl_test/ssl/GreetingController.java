package com.sfd.ssl_test.ssl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {

    @GetMapping("{name}")
    public ResponseEntity<String> sayHello(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hello " + name + "!");
    }
}
