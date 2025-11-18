package com.tuan.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RequestHeaderController {
    @GetMapping("/requestheader")
    //tham số tương tự RequestParam
    public String requestHeader(
            @RequestHeader(required = true) Optional<String> token){

        return "Hello World " + (token.isPresent() ? token.get() : "no token");
    }
}
