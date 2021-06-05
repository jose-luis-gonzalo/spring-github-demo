package com.example.springgithubdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringGithubDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGithubDemoApplication.class, args);
    }

    @RestController
    public class MyController {
        int c = 0;

        @GetMapping("/")
        public ResponseEntity<String> get() {
            String str = "->" + (++c);

            System.out.println(str);

            return new ResponseEntity<>(str, HttpStatus.OK);
        }
    }
}
