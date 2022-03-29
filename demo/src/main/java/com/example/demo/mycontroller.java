package com.example.demo;

import org.springframework.web.bind. annotation.Getmapping;
import org.springframework.web.bind.annotation.requestmapping;
import org.springframework.web.bind.annotation.requestcontroller.*;

    @RestController
    @SpringBootApplication
    public class {

        @RequestMapping("api")
        String home() {
            return "SELAMAT BELAJAR SPRING BOOT !!!!";
        }

        public static void main(String[] args) {
            SpringApplication.run(Example.class, args);
        }

    }
}
