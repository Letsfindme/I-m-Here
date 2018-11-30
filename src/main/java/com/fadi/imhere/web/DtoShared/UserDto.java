package com.fadi.imhere.web.DtoShared;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString

public class UserDto implements Serializable {


    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false, length = 15)
    private String firstName;

    @Column(nullable = false, length = 15)
    private String lastName;

    @NotNull
    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 20)
    private  String bio;

    private  String email;





}
