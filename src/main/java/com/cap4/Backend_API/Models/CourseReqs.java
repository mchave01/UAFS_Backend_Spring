package com.cap4.Backend_API.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.ibm.db2.cmx.annotation.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "COURSEREQS")
@EntityListeners(AuditingEntityListener.class)
public class CourseReqs 
	{


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int CourseReqId;

		@Column(name = "DEGREEPLAN_ID", nullable = false)
		private int DegreePlanId;

		@Column(name = "CLASS_ID", nullable = false)
		private int ClassId;


	public CourseReqs(int CourseReqId, int DegreePlanId, int ClassId)
	{

		this.CourseReqId = CourseReqId;
		this.DegreePlanId = DegreePlanId;
		this.ClassId = ClassId;

	}

    public int getCourseReqId() {
        return CourseReqId;
    }

    public void setCourseReqId(int courseReqId) {
        CourseReqId = courseReqId;
    }

    public int getDegreePlanId() {
        return DegreePlanId;
    }

    public void setDegreePlanId(int degreePlanId) {
        DegreePlanId = degreePlanId;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }
}