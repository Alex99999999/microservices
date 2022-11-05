package com.social.network.users.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String encryptedPassword;

    @Column(nullable = false)
    private String email;

}
