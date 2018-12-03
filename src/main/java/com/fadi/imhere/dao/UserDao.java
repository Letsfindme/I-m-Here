package com.fadi.imhere.dao;


import com.fadi.imhere.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDao extends JpaRepository<User, Integer> {





    User findByUsername(String username);


}
