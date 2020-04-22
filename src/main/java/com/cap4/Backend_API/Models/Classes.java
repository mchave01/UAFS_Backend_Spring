package com.cap4.Backend_API.Models;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.ibm.db2.cmx.annotation.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "CLASSES")
@EntityListeners(AuditingEntityListener.class)
public class Classes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classId;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "CRN", nullable = false)
    private int crn;

    @Column(name = "TITLE", nullable = false)
    private String title;
    
    @Column(name = "COURSE_NUMBER", nullable = false)
    private int courseNum;

    @Column(name = "SECTION_NUMBER", nullable = false)
    private String sectionNum;
    
    @Column(name = "CREDITS", nullable = false)
    private int credits;

    @Column(name = "MEETING_DAYS", nullable = false)
    private String meetingDays;
    
    @Column(name = "START_TIME", nullable = false)
    private Time startTime;

    @Column(name = "END_TIME", nullable = false)
    private Time endTime;

    @Column(name = "START_DATE", nullable = false)
    private Date startDate;
    
    @Column(name = "END_DATE", nullable = false)
    private Date endDate;
    
    @Column(name = "BUILDING", nullable = false)
    private String building;
    
    @Column(name = "ROOM_NUMBER", nullable = false)
    private String roomNum;
    
    @Column(name = "CAPACITY", nullable = false)
    private int capacity;
    
    @Column(name = "ACCEPTED", nullable = false)
    private int accepted;
    
    @Column(name = "REMAINING", nullable = false)
    private int remaining;

    @Column(name = "WAIT_LISTED", nullable = false)
    private int waitlisted;
    
    @Column(name = "PROFESSOR_NAME", nullable = false)
    private String professorName;
    
    @Column(name = "WEEKS", nullable = false)
    private int weeks;

    public Classes(int classId, String status, int crn, String title, int courseNum, String sectionNum, int credits,
            String meetingDays, Time startTime, Time endTime, Date startDate, Date endDate, String building,
            String roomNum, int capacity, int accepted, int remaing, int waitlisted, String professorName, int weeks) {
        this.classId = classId;
        this.status = status;
        this.crn = crn;
        this.title = title;
        this.courseNum = courseNum;
        this.sectionNum = sectionNum;
        this.credits = credits;
        this.meetingDays = meetingDays;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.building = building;
        this.roomNum = roomNum;
        this.capacity = capacity;
        this.accepted = accepted;
        this.remaining = remaing;
        this.waitlisted = waitlisted;
        this.professorName = professorName;
        this.weeks = weeks;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(String sectionNum) {
        this.sectionNum = sectionNum;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getMeetingDays() {
        return meetingDays;
    }

    public void setMeetingDays(String meetingDays) {
        this.meetingDays = meetingDays;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public int getRemaing() {
        return remaining;
    }

    public void setRemaing(int remaing) {
        this.remaining = remaing;
    }

    public int getWaitlisted() {
        return waitlisted;
    }

    public void setWaitlisted(int waitlisted) {
        this.waitlisted = waitlisted;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }
    
}