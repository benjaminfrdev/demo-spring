package com.example.demo.service.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.impl.StudentMapper;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Autowired
    private StudentMapper mapper;


    @Override
    public List<StudentDTO> getALl() {
        List<StudentDTO> liststudent = mapper.mapToListDTO(studentRepository.findAll());
        return  liststudent;
    }

    @Override
    public void upsert(StudentDTO studentDTO) {
        studentRepository.save(mapper.mapToEntity(studentDTO));
    }

    @Override
    public void upsertBulk(List<StudentDTO> studentDTOS) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public StudentDTO getById(Long id) {
        return null;
    }
}
