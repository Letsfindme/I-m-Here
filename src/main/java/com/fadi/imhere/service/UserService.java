package com.fadi.imhere.service;


import com.fadi.imhere.model.User;
import com.fadi.imhere.model.UserDto;

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

    UserDto update(UserDto userDto);
}
