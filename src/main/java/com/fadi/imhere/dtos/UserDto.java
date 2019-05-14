package com.fadi.imhere.dtos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Setter
@Getter
@ToString

public class UserDto {


    private String id;
    private String mail;
    private String uid;
    private String firstName;
    private String lastName;
    private String country;
    private String username;
    private String password;
    private boolean enabled;
    private int experience;
    private Date firstConnection;
    private Date lastConnection;
    private Date tosDate;
    private RoleDto role;
    private int age;
    private  String bio;

}
