package com.tuan.example;

import com.tuan.example.services.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
        AopService aopService = (AopService) context.getBean("aopService");
        aopService.methodLoggered();
    }
}
