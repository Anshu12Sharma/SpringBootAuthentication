package com.learn.controllers;

import com.learn.models.User;
import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserService userService;
        //ALL USERS
        @GetMapping("/")
        public List<User> getAllUsers(){
            return this.userService.getAllUsers();

        }
        @GetMapping("/{username}")
        public User getUser(@PathVariable(" username")String username){
            return this.userService.getUser(username);
        }
        @PostMapping("/")
        public User add(@RequestBody User user){
            return this.userService.addUser(user);
        }
    }


