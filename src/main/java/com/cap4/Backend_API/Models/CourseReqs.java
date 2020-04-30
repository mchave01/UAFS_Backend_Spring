package com.cap4.Backend_API.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibm.db2.cmx.annotation.Id;
import com.ibm.db2.cmx.annotation.JoinColumn;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "COURSE_REQS")
@EntityListeners(AuditingEntityListener.class)
public class CourseReqs 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
        private int CourseReqId;
        
		@ManyToOne
        @JoinColumn(name="DEGREE_PLAN_ID")
        private DegreePlans degreePlans;

        @ManyToOne
        @JoinColumn(name="CLASS_ID")
        private Classes classes;
        
	public CourseReqs(int CourseReqId, int ClassId)
	{

		this.CourseReqId = CourseReqId;

	}

    public int getCourseReqId() {
        return CourseReqId;
    }

    public void setCourseReqId(int courseReqId) {
        CourseReqId = courseReqId;
    }

}