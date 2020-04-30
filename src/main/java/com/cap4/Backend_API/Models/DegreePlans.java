package com.cap4.Backend_API.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ibm.db2.cmx.annotation.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "DEGREE_PLANS")
@EntityListeners(AuditingEntityListener.class)
public class DegreePlans 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DegreePlanId;

	@Column(name = "NAME", nullable = false)
	private String Name;

	@Column(name = "YEAR", nullable = false)
	private String Year;

    @OneToMany(mappedBy = "degreePlans")
    private List<CourseReqs> courseReqs;
    
	public DegreePlans(int DegreePlanId, String Name, String Year)
	{
		this.DegreePlanId = DegreePlanId;
		this.Name = Name;
		this.Year = Year;
	
	}

    public int getDegreePlanId() {
        return DegreePlanId;
    }

    public void setDegreePlanId(int degreePlanId) {
        DegreePlanId = degreePlanId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }



}