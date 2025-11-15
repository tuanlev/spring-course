package com.tuan.example;

import jakarta.annotation.PostConstruct;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    Logger logger ;

    @PostConstruct
    public void init() {
        this.logger = Logger.getLogger("com.tuan.example");
        logger.info("LoggerAspect init");
    }

    @Before(value = "execution(* com.tuan.example.services.*.*(..))")
    public void before(){
        logger.info("before method call ...");
    }
    @After(value = "execution(* com.tuan.example.services.*.*(..))")
    public void after(){
        logger.info("after method call ...");
    }
}
