package com.fadi.imhere.repository;

import com.fadi.imhere.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepositoryy extends JpaRepository<User, Long> {
   // User getUserByUsername(String username);
    User findByEmail(String email);
}
