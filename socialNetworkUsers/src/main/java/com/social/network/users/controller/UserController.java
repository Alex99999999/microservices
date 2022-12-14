package com.social.network.users.controller;

import com.social.network.users.domain.UserRequestModel;
import com.social.network.users.domain.UserResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/users")
public interface UserController {

    @GetMapping("/status")
    String check();

    @PostMapping
    ResponseEntity<UserResponseModel> createUser(@Valid @RequestBody UserRequestModel userRequestModel);
}
