package com.cap4.Backend_API;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "STUDENTS")
@EntityListeners(AuditingEntityListener.class)

public class Students {

}