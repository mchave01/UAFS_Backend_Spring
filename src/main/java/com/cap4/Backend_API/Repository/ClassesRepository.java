package com.cap4.Backend_API.Repository;

import com.cap4.Backend_API.Models.Classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer>{}