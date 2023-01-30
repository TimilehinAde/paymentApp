package com.timmy.paymentApp.validators;

import org.springframework.stereotype.Component;

@Component
public class Validators {
    public static boolean isValidEmailAddress(String email){
        return email.contains("@");
    }
    public static boolean isValidPassword(String password){
        return password.matches("[a-zA-Z0-9+!@#$%^&*_?><()]{8,20}");
    }
//    public static boolean isValidPhoneNumber(String phoneNumber){
//        return phoneNumber.length()== 11;
//    }
}
