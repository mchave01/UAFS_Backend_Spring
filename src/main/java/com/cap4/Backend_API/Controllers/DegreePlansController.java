package com.cap4.Backend_API.Controllers;

import java.util.List;

import com.cap4.Backend_API.Models.DegreePlans;
import com.cap4.Backend_API.Repository.DegreePlansRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DegreePlansController {

    @Autowired
    private DegreePlansRepository degreePlanRepo;

    @GetMapping("/degrees")
    public List<DegreePlans> getAllDegrees(){
        return degreePlanRepo.findAll();
    }

    @GetMapping("/degrees/{id}")
    public ResponseEntity<DegreePlans> getDegreeById(@PathVariable(value = "id") int dpID) throws Exception { 
        DegreePlans dp = degreePlanRepo
                            .findById(dpID)
                            .orElseThrow(() -> new Exception("Degree Plan not found by :: " + dpID));

        return ResponseEntity.ok().body(dp);
    }
    
}