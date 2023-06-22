package com.example.companysystem.controller;

import com.example.authmanage.entity.UserEntity;
import com.example.authmanage.model.User;
import com.example.authmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
   private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/admin/add")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')" )
    public UserEntity createAdmin(@RequestBody UserEntity user) {
        return userService.createAdmin(user);
   }
}
