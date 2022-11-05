package com.social.network.users.service;

import com.social.network.users.domain.UserDto;
import com.social.network.users.domain.UserRequestModel;

public interface UserService {

     UserDto createUser(final UserDto dto);

}
