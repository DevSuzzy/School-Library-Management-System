package com.susancodes.School_Library_Management.repository;

import com.susancodes.School_Library_Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
