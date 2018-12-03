package com.fadi.imhere.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class AuthToken {

    private String token;
    private String username;



    public AuthToken(String token){
        this.token = token;
    }




}
