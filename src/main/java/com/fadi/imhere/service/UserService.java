package com.fadi.imhere.service;


import com.fadi.imhere.dtos.UserDto;
import com.fadi.imhere.model.User;

import java.util.List;


public interface UserService  {

    /*
    User findUserByEmail(String email);
    void createUserAccount(UserDto user);
    */

    User save(UserDto user);

    List<User> findAll();

    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDTO);
}
