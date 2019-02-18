package com.fadi.imhere.controller;

import com.fadi.imhere.dtos.UserDto;
import com.fadi.imhere.model.ApiResponse;
import com.fadi.imhere.model.User;
import com.fadi.imhere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //SignUp
    @PostMapping
    public ApiResponse<User> saveUser(@RequestBody UserDto user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }

    @GetMapping
    public ApiResponse<List<User>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<User> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDto> update(@RequestBody UserDto userDTO) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDTO));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public User saveUser2(@RequestBody UserDto user){
        return userService.save(user);
    }



    @PostMapping("/user/add")
    User addUser(@RequestBody UserDto user){

        LocalDateTime today = LocalDateTime.now();

        return userService.save(user);
    }
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
