package com.timmy.paymentApp.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String id;
    @NotBlank(message = "this field cannot be empty")
    @NotNull(message = "this field cannot be empty")
    private String firstName;
    @NotNull(message = "this field cannot be empty")
    @NotBlank(message = "this field cannot be empty")
    private String lastName;
    @NotBlank(message = "this field cannot be empty")
    @NotNull(message = "this field cannot be empty")
    private String email;
    @NotNull(message = "this field cannot be empty")
    @NotBlank(message = "this field cannot be empty")
    private String password;
    }
