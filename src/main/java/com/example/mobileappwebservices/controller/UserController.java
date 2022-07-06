package com.example.mobileappwebservices.controller;

import com.example.mobileappwebservices.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping()
    public String getUser(){
        return "na me be this";
    }

    @PostMapping()
    public String addUser(@RequestBody UserDTO userDTO){
        return "user added";
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
