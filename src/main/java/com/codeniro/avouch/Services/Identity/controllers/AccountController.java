package com.codeniro.avouch.Services.Identity.controllers;

import com.codeniro.avouch.Services.Identity.DTOs.RegisterModel;
import com.codeniro.avouch.Services.Identity.entities.User;
import com.codeniro.avouch.Services.Identity.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("auth")
public class AccountController {

    private final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody @Valid RegisterModel userModel, final HttpServletRequest request) {
        User user = userService.saveUser(null);
//        publisher.publishEvent(new RegistrationCompleteEvent(
//                user,
//                applicationUrl(request)
//        ));
        return ResponseEntity.created(null).body(user);
    }
}
