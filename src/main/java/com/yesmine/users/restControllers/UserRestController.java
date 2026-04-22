package com.yesmine.users.restControllers;

import com.yesmine.users.entities.User;
import com.yesmine.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @CrossOrigin(origins = "*")
    public class UserRestController {
        @Autowired
        UserService userService;
        @GetMapping("all")
        public List<User> getAllUsers() {
            return userService.findAllUsers();
        }}

