package com.springbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.springbank.controller"),
        @ComponentScan("com.springbank.config") })
public class SpringBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBankApplication.class, args);
    }

}
