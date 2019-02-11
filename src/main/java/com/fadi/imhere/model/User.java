package com.fadi.imhere.model;

import com.fadi.imhere.Utils.ObjectUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id", columnDefinition = "RAW(16)")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "exp")
    private int experience;

    @Column(name = "first_connection")
    private Date firstConnection;

    @Column(name = "last_connection")
    private Date lastConnection;

    @Column(name = "avatar")
    private boolean avatar;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "tos_date")
    private Date tosDate;

    @Column(name = "\"uid\"")
    private String uid;

    @Column //(nullable = false)
    private String password;

    @Column//(nullable = false, length = 20)
    private  String bio;

    @Column(name = "mail")
    private String mail;;

    //private LocalDateTime createdDate;

    @Column(name = "age")
    private int age;

    public Date getTosDate() {
        return ObjectUtils.cloneDate(tosDate);
    }

    public void setTosDate(Date tosDate) {
        this.tosDate = ObjectUtils.cloneDate(tosDate);
    }


}
