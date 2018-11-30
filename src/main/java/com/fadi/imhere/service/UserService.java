package com.fadi.imhere.service;


import com.fadi.imhere.model.User;
import com.fadi.imhere.web.DtoShared.UserDto;





public interface UserService  {

    User findUserByEmail(String email);
    void createUserAccount(UserDto user);
}
