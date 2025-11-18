package com.tuan.example.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    static public void test() {
//        LomBokEntity b = new LomBokEntity("gv","v");
        LomBokEntity.LomBokEntity1 b2 = LomBokEntity.LomBokEntity1.builder().name("d").gender("v").build();
        LomBokEntity.LomBokEntity1 b3 = LomBokEntity.LomBokEntity1.builder().name("d").gender("v").build();

        log.info(String.valueOf(b2.equals(b3)));
    }
}