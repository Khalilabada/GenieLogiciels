package com.boky.PFE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boky.PFE", "pattern"})  // ← AJOUTE "pattern"
public class PfeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PfeApplication.class, args);
    }
}