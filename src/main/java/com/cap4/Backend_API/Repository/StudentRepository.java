package com.cap4.Backend_API.Repository;

import com.cap4.Backend_API.Models.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Students, Integer>{}
