package com.tuan.example.services;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class AopService
{
    Logger logger = Logger.getLogger(AopService.class.getName());
    public  int methodLoggered() {
        logger.info("methodLoggered") ;
        return 1;
    }
}
