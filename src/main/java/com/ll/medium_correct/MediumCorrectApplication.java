package com.ll.medium_correct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 생성일자, 수정일자 기록하기 위해서 사용
public class MediumCorrectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediumCorrectApplication.class, args);
    }

}
