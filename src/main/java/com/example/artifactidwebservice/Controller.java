package com.example.artifactidwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String respond() {
        return "<h1 style='color:green;padding:20%'>Wassup Baby!</h1>";
    }
}
