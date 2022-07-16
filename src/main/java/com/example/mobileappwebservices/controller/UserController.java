package com.example.mobileappwebservices.controller;

import com.example.mobileappwebservices.DTO.UserRequest;
import com.example.mobileappwebservices.DTO.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping()
    public String getUser(){
        return "na me be this";
    }

    @PostMapping()
    public UserResponse addUser(@RequestBody UserRequest userRequest){
        return null;
    }

    @PutMapping()
    public String updateUser(){
        return "user updated";
    }

    @DeleteMapping()
    public String deleteUser(){
        return "user deleted";
    }
}
