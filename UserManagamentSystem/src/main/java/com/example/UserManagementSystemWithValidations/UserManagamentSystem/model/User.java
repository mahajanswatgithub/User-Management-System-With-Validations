package com.example.UserManagementSystemWithValidations.UserManagamentSystem.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @NotNull
    private LocalDate userDOB;

    @Email(message = "Given email id is invalid")
    private String userEmail;

    @Pattern(regexp = "^\\d{12}$")
    private String userPhoneNumber;


    private LocalDate date;
    private LocalTime time;
}
