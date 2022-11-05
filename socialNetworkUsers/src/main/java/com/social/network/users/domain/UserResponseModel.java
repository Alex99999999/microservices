package com.social.network.users.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserResponseModel {

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

}
