package com.timmy.paymentApp.services;

import com.timmy.paymentApp.dtos.request.UserRegisterationRequest;
import com.timmy.paymentApp.models.User;
import com.timmy.paymentApp.repositories.UserRepositories;
import com.timmy.paymentApp.validators.Validators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public String register(UserRegisterationRequest userRegisterationRequest) {
        if (!Validators.isValidEmailAddress(userRegisterationRequest.getEmail())) throw new RuntimeException("invalid email");
        if (!Validators.isValidPassword(userRegisterationRequest.getPassword())) throw new RuntimeException("invalid password");
        if (userRepositories.findUserByEmail(userRegisterationRequest.getEmail())
                .isPresent()) throw new IllegalStateException("email already exists");

        User user = new User();
        user.setFirstName(userRegisterationRequest.getFirstName());
        user.setLastName(userRegisterationRequest.getLastName());
        user.setEmail(userRegisterationRequest.getEmail());
        user.setPassword(userRegisterationRequest.getPassword());
        userRepositories.save(user);

        return "successful registration";
    }
}
