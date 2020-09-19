package com.example.artifactidwebservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Counter counter;

    public Controller(Counter counter) {
        this.counter = counter;
    }

    @GetMapping("/endpoint")
    public ResponseEntity respond() {
        return counter.giveResponse();
    }
}
