package com.timmy.paymentApp.controller;

import com.timmy.paymentApp.dtos.request.UserRegisterationRequest;
import com.timmy.paymentApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegisterationRequest userRegisterationRequest){
        return new ResponseEntity<>(userService.register(userRegisterationRequest), HttpStatus.OK);
    }


}
