package com.fadi.imhere.service;


import com.fadi.imhere.model.User;
import com.fadi.imhere.repository.UserRepository;

import java.util.List;


public interface UserService  {

    /*
    User findUserByEmail(String email);
    void createUserAccount(UserRepository user);
    */

    User save(UserRepository user);

    List<User> findAll();

    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserRepository update(UserRepository userRepository);
}
