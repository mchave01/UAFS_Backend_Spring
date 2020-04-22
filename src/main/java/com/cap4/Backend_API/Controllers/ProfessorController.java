package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.Professors;
import com.cap4.Backend_API.Repository.ProfessorsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProfessorController {
    @Autowired
    private ProfessorsRepository professorsRepository;

    @GetMapping("/professors")
    public List<Professors> getAllProfressors() {
        return professorsRepository.findAll();
    }

    @GetMapping("/professors/{id}")
    public ResponseEntity<Professors> getProfressorsById(@PathVariable(value = "id") int professorId)
      throws Exception {
    Professors professor =
        professorsRepository
            .findById(professorId)
            .orElseThrow(() -> new Exception("Professor not found on :: " + professorId));
    return ResponseEntity.ok().body(professor);
    }
}