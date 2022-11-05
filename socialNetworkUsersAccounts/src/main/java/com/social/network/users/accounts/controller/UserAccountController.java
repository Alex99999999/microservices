package com.social.network.users.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
public interface UserAccountController {

    @GetMapping("/test")
    String test();

}
