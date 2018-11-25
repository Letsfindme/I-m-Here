package com.fadi.imhere.controller;

import com.fadi.imhere.model.User;
import com.fadi.imhere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Objects;

@RestController
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    private UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public RegisterController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @PostMapping
    public User registerUser(@RequestParam("username") String username, @RequestParam("password") String password,
                             @RequestParam("bio") String Bio, HttpServletRequest request) {

        User user = new User();

        user.setUsername(username);

        user.setBio(Bio);

        user.setPassword(password);
        user.setPassword(passwordEncoder.encode(password));

        user.setCreatedDate(LocalDateTime.now());


        return userRepository.save(user);

    }
}