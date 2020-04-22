package com.cap4.Backend_API.Repository;

import com.cap4.Backend_API.Models.CourseReqs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseReqsRepository extends JpaRepository<CourseReqs, Integer> {}