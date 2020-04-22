package com.cap4.Backend_API.Repository;

import com.cap4.Backend_API.Models.DegreePlans;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreePlansRepository extends JpaRepository<DegreePlans, Integer>{}