package com.cap4.Backend_API.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "PROFESSORS")
@EntityListeners(AuditingEntityListener.class)

public class Professors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "PROFESSOR_ID", nullable = false)
    private int professorId;

    @Column(name = "PROFESSOR_NAME", nullable = false)
    private String professorName;

    public Professors(int professorId, String professorName) {
		this.professorId = professorId;
		this.professorName = professorName;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
    
}