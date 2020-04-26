package com.rhea.controller;

import com.rhea.domian.Password;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    @Value("${info.username}")
    private String username;
    @Value("${info.userpassword}")
    private String userpassword;
    @RequestMapping("/password")
    public Password password(){
        Password password = new Password();
        password.setUsername(username);
        password.setUserpassword(userpassword);
        return password;

    }

}
