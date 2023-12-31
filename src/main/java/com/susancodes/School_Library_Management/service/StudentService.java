package com.susancodes.School_Library_Management.service;

import com.susancodes.School_Library_Management.payload.request.StudentRequest;
import com.susancodes.School_Library_Management.payload.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse registerNewStudent(StudentRequest studentRequest);
    StudentResponse getById(Long id);

    List<StudentResponse> listOfStudents();
}
