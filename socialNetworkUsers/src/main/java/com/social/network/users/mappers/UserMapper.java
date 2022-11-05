package com.social.network.users.mappers;

import com.social.network.users.domain.UserDto;
import com.social.network.users.domain.UserEntity;
import com.social.network.users.domain.UserRequestModel;
import com.social.network.users.domain.UserResponseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDtoFromRequestModel(UserRequestModel model);

    UserDto toUserDtoFromEntity(UserEntity entity);

    UserEntity toUserEntityFromUserDto(UserDto dto);

    UserRequestModel toUserRequestModelFromUserDto(UserDto dto);

    UserRequestModel toUserRequestModelFromEntity(UserEntity persisted);

    UserResponseModel toUserResponseFromUserDto(UserDto dto);
}
