package com.timmy.paymentApp.dtos.request;

import lombok.Data;

@Data
public class UserRegisterationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
