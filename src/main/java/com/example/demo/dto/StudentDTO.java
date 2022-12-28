package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public StudentDTO(){

    }
    public StudentDTO(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
