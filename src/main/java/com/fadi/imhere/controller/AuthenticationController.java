package com.fadi.imhere.controller;


import com.fadi.imhere.config.JwtTokenUtil;
import com.fadi.imhere.model.ApiResponse;
import com.fadi.imhere.model.AuthToken;
import com.fadi.imhere.model.LoginUser;
import com.fadi.imhere.model.User;
import com.fadi.imhere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


/**
 *
 * controller is exposed to create token on user behalf and if you noticed in WebSecurityConfig.java
 * we have configured this url to have no authentication
 * so that user can generate JWT token with valid credentials.
 *
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    //we send user name and pass by LoginUser
    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser) throws AuthenticationException {

        //UsernamePasswordAuthenticationToken gets user name and password then returns a token
        /**
         * This constructor can be safely used by any code that wishes to create a
         * <code>UsernamePasswordAuthenticationToken</code>, as the {@link #isAuthenticated()}
         * will return <code>false</code>.
         *
         */

        /**
         * Attempts to authenticate the passed {@link Authentication} object, returning a
         * fully populated <code>Authentication</code> object (including granted authorities)
         * if successful*/
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        final User user = userService.findOne(loginUser.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success",new AuthToken(token, user.getUsername()));
    }




}
