package com.tuan.example;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {
    @RequestMapping(value = "/requestbody",method = RequestMethod.POST)
    //chỉ có 1 tham số required thường đi kèm với valid nằm đáp ứng các định nghĩa được đưa ra trong định
    // nghĩa của entity
    public String requestBody(@Valid @RequestBody String requestBody){
        return requestBody;
    }
}
