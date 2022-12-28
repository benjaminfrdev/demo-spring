package com.example.demo.mapper.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper implements com.example.demo.mapper.StudentMapper {
    @Override
    public StudentDTO mapToDTO(StudentEntity studentEntity) {
        return StudentDTO.builder()
                .age(studentEntity.getAge())
                .dob(studentEntity.getDob())
                .email(studentEntity.getEmail())
                .name(studentEntity.getName())
                .id(studentEntity.getId())
                .build();
    }

    @Override
    public StudentEntity mapToEntity(StudentDTO studentDTO) {
        return StudentEntity.builder()
                .age(studentDTO.getAge())
                .dob(studentDTO.getDob())
                .email(studentDTO.getEmail())
                .id(studentDTO.getId())
                .name(studentDTO.getName())
                .build();
    }

    @Override
    public List<StudentDTO> mapToListDTO(List<StudentEntity> studentEntities) {
        if(studentEntities.size() > 0){
            return studentEntities.stream().map(this::mapToDTO).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
    @Override
    public List<StudentEntity> mapToListEntity(List<StudentDTO> studentDTOS) {
        return null;
    }
}
