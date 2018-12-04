package com.fadi.imhere.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString

public class UserDTO {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Column//(nullable = false, length = 15)
    private String firstName;

    @Column//(nullable = false, length = 15)
    private String lastName;

    private String username;

    @NotNull
    @Column//(nullable = false)
    private String password;

    private int age;

    @Column//(nullable = false, length = 20)
    private  String bio;

    private  String email;





}
