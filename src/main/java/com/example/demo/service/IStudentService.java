package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public interface IStudentService extends IGenericService<StudentDTO, Long> {
}
