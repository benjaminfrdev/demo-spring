package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<StudentDTO> getListStudent() {
        return List.of(new StudentDTO(1L, "Marian", "marian@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21));
    }
}
