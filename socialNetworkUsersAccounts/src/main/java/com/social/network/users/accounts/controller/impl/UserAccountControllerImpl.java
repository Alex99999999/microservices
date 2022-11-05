package com.social.network.users.accounts.controller.impl;

import com.social.network.users.accounts.controller.UserAccountController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountControllerImpl implements UserAccountController {

    @Override
    public String test() {
        return "Hi from users account controller";
    }

}
