package com.cap4.Backend_API;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "classes")
@EntityListeners(AuditingEntityListener.class)
public class Classes {
    @Id
    private long classId;
    private String status;
    private int crn;
    private String title;
    private int courseNum;
    private String sectionNum;
    private int credits;
    private String meetingDays;
    private Time startTime;
    private Time endTime;
    private Date startDate;
    private Date endDate;
    private String building;
    private String roomNum;
    private int capacity;
    private int accepted;
    private int remaing;
    private int waitlisted;
    private String professorName;
    private int weeks;

    public Classes(long classId, String status, int crn, String title, int courseNum, String sectionNum, int credits,
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
        this.remaing = remaing;
        this.waitlisted = waitlisted;
        this.professorName = professorName;
        this.weeks = weeks;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
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
        return remaing;
    }

    public void setRemaing(int remaing) {
        this.remaing = remaing;
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