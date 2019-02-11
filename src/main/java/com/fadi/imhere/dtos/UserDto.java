package com.fadi.imhere.dtos;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@ToString

public class UserDto {


    private UUID id;
    private String mail;
    private String uid;
    private String firstName;
    private String lastName;
    private String country;

    private String password;

    private boolean enabled;
    private int experience;
    private int speech;
    private int sprintExperience;
    private int rank;
    private int sprintRank;
    private int crystals;
    private int coins;
    private int spaceInvadersRecord;
    private int spaceInvadersChampion;
    private Date firstConnection;
    private Date lastConnection;
    private Date tosDate;
    private RoleDto role;
    private int age;

    private  String bio;





}
