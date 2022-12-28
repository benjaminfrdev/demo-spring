package com.example.demo.mapper.impl;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.IUserMapper;
import org.thymeleaf.expression.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper implements IUserMapper {
    @Override
    public UserDTO mapToDTO(UserEntity userEntity) {
        return UserDTO.builder()
                            .username(userEntity.getUsername())
                            .password(userEntity.getPassword())
                            .build();

    }

    @Override
    public UserEntity mapToEntity(UserDTO userDTO) {
        return UserEntity.builder()
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .build();
    }



    @Override
    public List<UserDTO> mapToListDTO(List<UserEntity> userEntities) {
        return userEntities.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public List<UserEntity> mapToListEntity(List<UserDTO> userDTOS) {
        return userDTOS.stream().map(this::mapToEntity).collect(Collectors.toList());
    }
}
