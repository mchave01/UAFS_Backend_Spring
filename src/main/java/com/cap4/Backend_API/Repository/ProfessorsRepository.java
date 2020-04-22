package com.cap4.Backend_API.Repository;

import com.cap4.Backend_API.Models.Professors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorsRepository extends JpaRepository <Professors, Integer>{}
