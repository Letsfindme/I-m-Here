package com.fadi.imhere.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column//(nullable = false, length = 15)
    private String firstName;

    @Column//(nullable = false, length = 15)
    private String lastName;

    @Column
    private String username;

    @Column //(nullable = false)
    private String password;

    @Column//(nullable = false, length = 20)
    private  String bio;

    private String email;

    //private LocalDateTime createdDate;

    @Column
    private int age;


}
