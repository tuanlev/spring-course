package com.tuan.example.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@ToString


public class LomBokEntity {
    @Data
    @Builder

    @ToString(of={"address"}) //(exclude)
    public static class LomBokEntity1 {
        final String address;
        @With String name;
        @NonNull
        String gender;
    }

}
