package com.ecoleprivee.ecoleprivee.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ecoleprivee.ecoleprivee.model.CourseSession;

@Entity
@Table(name="location")
public class Location  implements Serializable{

	private static final long serialVersionUID = 6975333993913651227L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	@Column(name="city")
	private String city ;
	
	@OneToMany(mappedBy="location")
	private List<CourseSession> courseSessions ;
	
	public Location() {
		
	}

	public Location( String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public List<CourseSession> getCourseSessions() {
		return courseSessions;
	}

	public void setCourseSessions(List<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", city=" + city + "]";
	}
	
	

}

