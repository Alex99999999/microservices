package com.social.network.users.controller;

import com.social.network.users.domain.UserDto;
import com.social.network.users.domain.UserRequestModel;
import com.social.network.users.domain.UserResponseModel;
import com.social.network.users.mappers.UserMapper;
import com.social.network.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserMapper userMapper;
    private final UserService userService;

    @Override
    public String check() {
        return "I am OK";
    }

    @Override
    public ResponseEntity<UserResponseModel> createUser(final UserRequestModel model) {
        final UserDto resultDro = this.userService.createUser(userMapper.toUserDtoFromRequestModel(model));
        return new ResponseEntity<>(userMapper.toUserResponseFromUserDto(resultDro), HttpStatus.OK);
    }

}
