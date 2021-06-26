package com.trkj.tsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsmApplication.class, args);
    }
}
