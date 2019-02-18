package com.fadi.imhere.model;

import com.fadi.imhere.Utils.ObjectUtils;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column
    private String username;

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

    private String email;;
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
