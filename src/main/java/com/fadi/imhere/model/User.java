package com.fadi.imhere.model;

import com.fadi.imhere.Utils.ObjectUtils;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class User implements Serializable {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    private boolean active;

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "first_name")
    private String firstname;

    @Column
    private String username;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_connection")
    private Date firstConnection;

    @Column(name = "last_connection")
    private Date lastConnection;

    @Column(name = "avatar")
    private boolean avatar;

    @Column //(nullable = false)
    private String password;

    @Column//(nullable = false, length = 20)
    private  String bio;

    @Column(name = "mail")
    private String mail;;

    private String email;;
    //private LocalDateTime createdDate;

    @Column(name = "age")
    private int age;

    public User(String firstname, String username, String email, String password) {
        this.firstname = firstname;
        this.username = username;
        this.email = email;
        this.password = password;
    }




}
