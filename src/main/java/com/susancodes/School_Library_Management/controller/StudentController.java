package com.susancodes.School_Library_Management.controller;

import com.susancodes.School_Library_Management.payload.request.StudentRequest;
import com.susancodes.School_Library_Management.payload.response.ApiResponse;
import com.susancodes.School_Library_Management.payload.response.StudentResponse;
import com.susancodes.School_Library_Management.service.StudentService;
import com.susancodes.School_Library_Management.utils.ApplicationUrl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping (ApplicationUrl.BASE_URL)
public class StudentController {
    private final StudentService studentService;


@PostMapping(ApplicationUrl.REGISTER_NEW_STUDENT)
    public ResponseEntity<ApiResponse<StudentResponse>>registerStudent(@RequestBody StudentRequest studentRequest){
    ApiResponse<StudentResponse> studentResponseApiResponse = new ApiResponse<>(studentService.registerNewStudent(studentRequest));
    return new ResponseEntity<>(studentResponseApiResponse, HttpStatus.CREATED);
}

@GetMapping(ApplicationUrl.FIND_STUDENT)
    public ResponseEntity<ApiResponse<StudentResponse>>getStudentById(@PathVariable Long id) {
    ApiResponse<StudentResponse> studentResponseApiResponse = new ApiResponse<>(studentService.getById(id));
    return new ResponseEntity<>(studentResponseApiResponse, HttpStatus.OK);

}
@GetMapping(ApplicationUrl.FIND_ALL_STUDENT)
public ResponseEntity<ApiResponse<List<StudentResponse>>> getStudent(){
    ApiResponse<List<StudentResponse>> apiResponse = new ApiResponse<>(studentService.listOfStudents());
    return  new ResponseEntity<>(apiResponse,HttpStatus.OK);

    }

}

