package com.zc.springbootshrio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.zc.springbootshrio.mapper")
@SpringBootApplication

public class SpringbootShrioApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShrioApplication.class, args);
    }

}
