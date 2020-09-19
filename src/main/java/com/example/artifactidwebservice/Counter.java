package com.example.artifactidwebservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Counter {
    private int timesCalled;

    public ResponseEntity giveResponse() {
        int numberOfRetries = 20;
        if (timesCalled < numberOfRetries) {
            System.out.println("Times Called: " + ++timesCalled);
            return new ResponseEntity("CUSTOMER_NOT_FOUND" ,HttpStatus.INTERNAL_SERVER_ERROR);

        } else {
            return ResponseEntity.ok("Oh nevermind, I found the customer!");
        }
    }
}
