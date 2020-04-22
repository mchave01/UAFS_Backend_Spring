package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.CourseReqs;
import com.cap4.Backend_API.Repository.CourseReqsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CourseReqsController {
    @Autowired
    private CourseReqsRepository courseReqRepository;

    @GetMapping("/classes")
    public List<CourseReqs> getAllCourseReqs() {
        return courseReqRepository.findAll();
    }

    @GetMapping("/classes/{id}")
    public ResponseEntity<CourseReqs> getClassesById(@PathVariable(value = "id") int courseReqId)
      throws Exception {
    CourseReqs courseReqs =
            courseReqRepository
            .findById(courseReqId)
            .orElseThrow(() -> new Exception("Course not found on :: " + courseReqId));
    return ResponseEntity.ok().body(courseReqs);
    }
}