package com.susancodes.School_Library_Management.payload.response;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentResponse {
   private String firstName;
   private String lastName;
   private String email;
   private String phone;
   private String address;
   private String className;

}
