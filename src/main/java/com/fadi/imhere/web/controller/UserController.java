package com.fadi.imhere.web.controller;

import com.fadi.imhere.model.User;
import com.fadi.imhere.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

//@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user")
    public List<User> displayRegister() {

        return userRepository.findAll();
    }

    @GetMapping("/user/{ID}")
    ResponseEntity<User> getUserById(@PathVariable long ID) {
        User user = userRepository.findOne(ID);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/user/add")
    User addUser(@RequestBody User user){

        LocalDateTime today = LocalDateTime.now();
        // Mise à jour du lien avec la date
        user.setCreatedDate(today);


        return userRepository.save(user);
    }
}
