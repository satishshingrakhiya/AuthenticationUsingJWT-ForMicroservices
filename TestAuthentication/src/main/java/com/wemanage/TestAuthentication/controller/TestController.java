package com.wemanage.TestAuthentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @GetMapping("unrestricted")
    public ResponseEntity<?> getMessage() {
        return new ResponseEntity<>("Hey! this is a normal message.", HttpStatus.OK);
    }
    @GetMapping("restricted")
    public ResponseEntity<?> getRestrictedMessage() {
        return new ResponseEntity<>("This is a restricted message", HttpStatus.OK);
    }
}
