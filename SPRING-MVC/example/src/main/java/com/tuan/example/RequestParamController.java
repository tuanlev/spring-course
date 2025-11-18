package com.tuan.example;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class RequestParamController {
Logger logger =  Logger.getLogger(RequestParamController.class.getName());

    @GetMapping(path = "/requestparamexample")
//    public String requestparamexample(@RequestParam(value = "hi",required = false,defaultValue = "") String yup) {
//    public String requestparamexample(@RequestParam String yup) {
    public String requestparamexample(@RequestParam MultiValueMap<String, String> yup) { // mặc định là required = true
        yup.forEach((s, list) -> {
            list.forEach(logger::info);
        });
        return "requestparamexample" + ((yup==null)?"noo":yup);
    }


    @GetMapping(path = "/requestparamexample1")
    public String requestparamexample1(@RequestParam(required = false) Optional<String> yup) { // mặc định là required = true

        return "requestparamexample" + ((yup.isPresent())?yup.get():"yup");
    }


}
