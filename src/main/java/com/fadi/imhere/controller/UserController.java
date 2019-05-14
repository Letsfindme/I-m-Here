package com.fadi.imhere.controller;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {







    /*



    @GetMapping("/user")
    public List<User> displayRegister() {

        return userService.findAll();
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

    */


}
