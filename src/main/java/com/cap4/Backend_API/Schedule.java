package com.cap4.Backend_API;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

	@Column(name = "CLASS_ID", nullable = false)
	private int classId;

	@Column(name = "STUDENT_ID", nullable = false)
	private int studentID;

	public Schedule(int classId, int scheduleID, int studentId){
		this.classId = classId;
		this.scheduleId = scheduleID;
		this.studentID = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}