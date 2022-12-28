package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "student")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
