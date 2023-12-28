package com.ll.medium_correct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MediumCorrectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediumCorrectApplication.class, args);
    }

}
