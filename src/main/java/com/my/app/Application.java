package com.my.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.my.app.repository")
public class Application {
    @RequestMapping("/")
    String home() {
        return "My app home.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
