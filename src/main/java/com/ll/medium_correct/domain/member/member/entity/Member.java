package com.ll.medium_correct.domain.member.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)  // 1,2를 사용하기 위해서는 이게 있어야 한다.
public class Member {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @CreatedDate  // 1
    private LocalDateTime createDate;
    @LastModifiedDate  // 2
    private LocalDateTime modifyDate;
    private String username;
    private String password;

    public Member(String username, String password){  // 생성자 만들기
        this.username=username;
        this.password=password;
    }

}
