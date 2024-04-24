package com.john.springsecdemo.controller;

import com.john.springsecdemo.model.User;
import com.john.springsecdemo.service.JwtService;
import com.john.springsecdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /* User Service get from service */
    @Autowired
    private UserService service;

    /* Authentication Service */
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    /* JWT Service */
    private JwtService jwtService;

    /* Register */
    @PostMapping("register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }

    /* Login */
    @PostMapping("login")
    public String login(@RequestBody User user){
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        } else
            return "Login Failed";
    }
}
