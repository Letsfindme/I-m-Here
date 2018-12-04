package com.fadi.imhere.service;


import com.fadi.imhere.model.User;
import com.fadi.imhere.model.UserDTO;

import java.util.List;


public interface UserService  {

    /*
    User findUserByEmail(String email);
    void createUserAccount(UserDTO user);
    */

    User save(UserDTO user);

    List<User> findAll();

    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDTO update(UserDTO userDTO);
}
