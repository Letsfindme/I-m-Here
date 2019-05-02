package com.fadi.imhere;



import com.fadi.imhere.model.Role;
import com.fadi.imhere.model.User;
import com.fadi.imhere.service.UserServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class Application {



    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

    }

}
