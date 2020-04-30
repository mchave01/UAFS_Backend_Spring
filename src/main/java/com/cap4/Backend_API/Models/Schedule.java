package com.cap4.Backend_API.Models;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibm.db2.cmx.annotation.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "SCHEDULE")
@EntityListeners(AuditingEntityListener.class)

public class Schedule{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;

    @ManyToOne
    @JoinColumn(name="STUDENT_ID")
    private Students studentId;

    @ManyToOne
    @JoinColumn(name="CLASS_ID")
    private Classes classes_sch;

	public Schedule(int scheduleID){
		this.scheduleId = scheduleID;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

}