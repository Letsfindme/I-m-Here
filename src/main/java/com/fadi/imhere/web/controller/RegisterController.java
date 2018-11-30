package com.fadi.imhere.web.controller;

import com.fadi.imhere.model.User;
import com.fadi.imhere.service.UserService;
import com.fadi.imhere.web.DtoShared.UserDto;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    private UserService userService;





/*
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @PostMapping
    public User registerUser(@RequestParam("username") String username, @RequestParam("password") String password,
                             @RequestParam("bio") String Bio, HttpServletRequest request) {

    // HttpServletRequest request
        return registerService.registerUser(username, password, Bio, request);


        //return userRepository.save(user);
    }*/


    @PostMapping
    public void createNewUser(@Valid @RequestBody final UserDto accountDto, BindingResult bindingResult, final HttpServletRequest request) {


        System.out.println(accountDto.toString());
        /*try {
            captchaService.processResponse(response);
        } catch (NullPointerException e) {
            modelAndView.setViewName("registrations");
        }*/


        User userExists = userService.findUserByEmail(accountDto.getEmail());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }

            userService.createUserAccount(accountDto);
            /*
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("successRegister");
            LOGGER.debug("Registering user account with information: {}", accountDto);*/

    }
}