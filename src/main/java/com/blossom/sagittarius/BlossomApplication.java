package com.blossom.sagittarius;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.blossom.sagittarius.dao")
public class BlossomApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlossomApplication.class, args);
    }
}
