package com.tuan.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
    @GetMapping({"/responeentityexample"})
    public ResponseEntity<String> responseEntityExample(){

        return ResponseEntity.ok().body("Hello World");
    }
}
