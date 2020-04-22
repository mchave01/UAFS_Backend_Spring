package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.Classes;
import com.cap4.Backend_API.Repository.ClassesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClassesController {
    @Autowired
    private ClassesRepository classesRepository;

    @GetMapping("/classes")
    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    @GetMapping("/classes/{id}")
    public ResponseEntity<Classes> getClassesById(@PathVariable(value = "id") int classesId)
      throws Exception {
    Classes classes =
            classesRepository
            .findById(classesId)
            .orElseThrow(() -> new Exception("Class not found on :: " + classesId));
    return ResponseEntity.ok().body(classes);
    }
}