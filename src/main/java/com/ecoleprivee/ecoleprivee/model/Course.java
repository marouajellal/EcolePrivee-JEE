package com.ecoleprivee.ecoleprivee.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ecoleprivee.ecoleprivee.model.CourseSession;

@Entity
@Table(name="course")

public class Course implements Serializable{
	
	
	private static final long serialVersionUID = -4591878422566228390L;

	@Id
    private String code ;
	
	@Column(name="title")
	private String title ;
	
	@OneToMany(mappedBy="course")
	private List <CourseSession> courseSessions ;
	
	public Course () {
			
	}

	public Course(String code, String title, List<CourseSession> courseSessions) {
		super();
		this.code = code;
		this.title = title;
		this.courseSessions = courseSessions;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<CourseSession> getCourseSessions() {
		return courseSessions;
	}

	public void setCourseSessions(List<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", title=" + title + ", courseSessions=" + courseSessions + "]";
	}

	
	
	
	
}
