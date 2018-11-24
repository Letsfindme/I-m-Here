package com.fadi.imhere.controller;

import com.fadi.imhere.model.User;
import com.fadi.imhere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @GetMapping
    public String displayRegister(Model model) {
        return "register";
    }

    @PostMapping
    public View registerUser(@RequestParam("username") String username, @RequestParam("password") String password,
                             @RequestParam("Bio") String Bio, HttpServletRequest request) {
        String contextPath = request.getContextPath();
        User user = new User();
        if (userRepository.getUserByUsername(username) == null) {
            user.setUsername(username);

            if (Objects.equals(Bio, ""))
                user.setBio(null);
            else
                user.setBio(Bio);

            user.setPassword(password);
            user.setPassword(passwordEncoder.encode(password));
            //problem
            user.setCreatedDate(LocalDateTime.now());
            userRepository.save(user);

            return new RedirectView(contextPath + "/login");
        } else
            return new RedirectView(contextPath + "/register");
    }
}
