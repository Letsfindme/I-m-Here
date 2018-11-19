package com.fadi.imhere.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 15)
    private String username;

    @Column(nullable = false, length = 40)
    private String password;

    @Column(nullable = false, length = 20)
    private  String bio;

    private Date createdDate;


}
