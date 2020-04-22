package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.Students;
import com.cap4.Backend_API.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Students> getStudentById(@PathVariable(value = "id") int studentId)
      throws Exception {
    Students students =
        studentRepository
            .findById(studentId)
            .orElseThrow(() -> new Exception("Student not found on :: " + studentId));
    return ResponseEntity.ok().body(students);
    }

}