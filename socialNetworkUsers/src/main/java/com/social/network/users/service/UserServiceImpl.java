package com.social.network.users.service;

import com.social.network.users.domain.UserDto;
import com.social.network.users.domain.UserEntity;
import com.social.network.users.mappers.UserMapper;
import com.social.network.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDto createUser(final UserDto dto) {
        final String encryptedPassword = encryptPassword(dto.getPassword());
        dto.setEncryptedPassword(encoder.encode(dto.getPassword()));
        return saveUser(dto);
    }

    private UserDto saveUser(final UserDto dto) {
        final UserEntity userEntity = userMapper.toUserEntityFromUserDto(dto);
        final UserEntity persisted = userRepository.save(userEntity);
        return userMapper.toUserDtoFromEntity(persisted);
    }

    private String encryptPassword(final String password) {
        return "Encrypted" + password;
    }

}
