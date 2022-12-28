package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.impl.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "User APIS")
@RequestMapping(value = "api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Operation(description= "Xem danh sách User", responses = {
            @ApiResponse(content = @Content(array = @ArraySchema(schema = @Schema(implementation = StudentDTO.class))),responseCode = "200")
    })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Thành công"),
            @ApiResponse(responseCode = "401", description = "Chưa xác thực"),
            @ApiResponse(responseCode = "403", description = "Truy cập bị cấm"),
            @ApiResponse(responseCode = "404", description =  "Không tìm thấy")
    })
    @GetMapping
    public List<StudentDTO> getStudents(){
        List<StudentDTO> list = studentService.getALl();
        return studentService.getALl();
    }
    @PostMapping
    public ResponseEntity<?> upsertStudents(@RequestBody StudentDTO studentDTO){
        studentService.upsert(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
