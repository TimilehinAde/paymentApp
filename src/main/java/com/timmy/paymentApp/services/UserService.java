package com.timmy.paymentApp.services;

import com.timmy.paymentApp.dtos.request.UserRegisterationRequest;

public interface UserService {
    String register(UserRegisterationRequest userRegisterationRequest);

}
