package com.hanseong.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Springboot2WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2WebserviceApplication.class, args);
    }

}
