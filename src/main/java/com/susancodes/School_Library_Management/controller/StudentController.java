package com.susancodes.School_Library_Management.controller;

import com.susancodes.School_Library_Management.payload.request.StudentRequest;
import com.susancodes.School_Library_Management.payload.response.ApiResponse;
import com.susancodes.School_Library_Management.payload.response.StudentResponse;
import com.susancodes.School_Library_Management.repository.StudentRepository;
import com.susancodes.School_Library_Management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/api/v1/student")
public class StudentController {
    private final StudentService studentService;


@PostMapping
    public ResponseEntity<ApiResponse<StudentResponse>>registerStudent(@RequestBody StudentRequest studentRequest){
    ApiResponse<StudentResponse> studentResponseApiResponse = new ApiResponse<>(studentService.registerNewStudent(studentRequest));
    return new ResponseEntity<>(studentResponseApiResponse, HttpStatus.CREATED);
}




}

