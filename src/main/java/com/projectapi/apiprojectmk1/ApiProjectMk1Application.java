package com.projectapi.apiprojectmk1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class ApiProjectMk1Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiProjectMk1Application.class, args);
    }

}
