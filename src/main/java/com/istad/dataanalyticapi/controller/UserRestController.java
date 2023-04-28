package com.istad.dataanalyticapi.controller;

import com.istad.dataanalyticapi.model.User;
import com.istad.dataanalyticapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {
    private final UserService userService;
    UserRestController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/allusers")
    List<User>getAllUser(){
        return userService.allUsers();
    }
    @GetMapping("/{id}")
    public User findUserById(@PathVariable int id){
        return  userService.findUserById(id);
    }
    @PostMapping("/new-user")
    public String createUser(@RequestBody User user){
       try{
           int affectRow = userService.createNewUser(user);
           if (affectRow>0)
               return "Create user successfully !";
           else
               return "Create user successfully !";
       }catch (Exception exception){
        return exception.getMessage();
       }
    }
    }




