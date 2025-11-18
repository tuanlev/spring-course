package com.tuan.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PathVariableController {
    @GetMapping(value = {"/pathvariable/{name}","/pathvariable"})
    public String pathVariable(@PathVariable(value = "name") Optional<String> any){
        return (any.isPresent())?any.get():"no path variable";
    }
}
