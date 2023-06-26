package com.example.UserManagementSystemWithValidations.UserManagamentSystem.controller;

import com.example.UserManagementSystemWithValidations.UserManagamentSystem.model.User;
import com.example.UserManagementSystemWithValidations.UserManagamentSystem.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //read
    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    //create many users
    @PostMapping("users")
    String addUsers(@RequestBody @Valid List<User> users)
    {
        return userService.createUsers(users);
    }
    //create a user
    @PostMapping("user")
    String addUser(@Valid @RequestBody User user)
    {
        return userService.createUser(user);
    }
    //Update user by
    @PutMapping("update/{id}/{emailId}")
    String updateEmail(@PathVariable Integer id, @PathVariable @Email String emailId)
    {
        return userService.updateEmail(id,emailId);
    }
    //delete user
    @DeleteMapping("user/{id}")
    String removeUser(@PathVariable Integer id)
    {
        return userService.removeUser(id);
    }

}
