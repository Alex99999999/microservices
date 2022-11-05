package com.social.network.users.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {

    private Long userId;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String encryptedPassword;

}
