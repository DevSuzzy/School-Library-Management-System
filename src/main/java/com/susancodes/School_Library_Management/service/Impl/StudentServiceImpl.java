package com.susancodes.School_Library_Management.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.susancodes.School_Library_Management.entity.Student;
import com.susancodes.School_Library_Management.exceptions.StudentNotFoundException;
import com.susancodes.School_Library_Management.payload.request.StudentRequest;
import com.susancodes.School_Library_Management.payload.response.StudentResponse;
import com.susancodes.School_Library_Management.repository.StudentRepository;
import com.susancodes.School_Library_Management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper mapper;
    private final ObjectMapper objectMapper;

    @Override
    public StudentResponse registerNewStudent(StudentRequest studentRequest) {
        Student student = mapToEntity(studentRequest);
        studentRepository.save(student);
        return mapToResponse(student);
    }

    @Override
    public StudentResponse getById(Long id) {
        Student student = studentRepository.findById(id).
                orElseThrow(()-> new StudentNotFoundException("Student not found exception"));
        return mapToResponse(student);
    }

    private StudentResponse mapToResponse(Student student) {
        return mapper.map(student, StudentResponse.class);
    }

    private Student mapToEntity(StudentRequest studentDto){
        return mapper.map(studentDto, Student.class);
    }
}
