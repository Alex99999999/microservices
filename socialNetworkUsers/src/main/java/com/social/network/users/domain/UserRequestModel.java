package com.social.network.users.domain;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
public class UserRequestModel {

    @NotBlank(message = "First name cannot be null")
    @Size(min = 1, message = "First name must be greater that 1")
    private String firstName;

    @NotBlank(message = "Last name cannot be null")
    @Size(min = 1, message = "Last name must be greater that 1")
    private String lastName;

    @NotBlank(message = "Last name cannot be null")
    @Size(min = 4, max = 20, message = "Password must be at least 4 and at most 20 letters long")
    private String password;

    @NotBlank(message = "Email cannot be null")
    @Email
    private String email;

}
