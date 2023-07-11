package com.project.losobeatz.user.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "user_table")
public class UserEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true) // unique 제약조건 추가
    private String userEmail;

    @Column
    private String userPassword;

    @Column
    private String userRepeatPassword;

    @Column
    private String userName;

}
