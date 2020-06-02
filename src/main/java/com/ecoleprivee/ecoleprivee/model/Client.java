package com.ecoleprivee.ecoleprivee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ecoleprivee.ecoleprivee.model.CourseSession;

@Entity
@Table(name="client")

public class Client implements Serializable {
	
	
	private static final long serialVersionUID = 7843343684808580978L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	@Column(name="firstName")
	private String firstName ;
	
	@Column(name="lastName")
	private String lastName ;
	
	@Column(name="address")
	private String address ;
	
	@Column(name="phone")
	private String phone ;
	
	@Column(name="email")
	private String email ;
	
	
	@ManyToOne
	@JoinColumn(name="course_session_id")
	private CourseSession courseSession ;
	
	public Client () {
		
	}
	
	public Client( String firstName, String lastName, String address, String phone, String email,
			 CourseSession courseSession) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.courseSession = courseSession;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public CourseSession getCourseSession() {
		return courseSession;
	}

	public void setCourseSession(CourseSession courseSession) {
		this.courseSession = courseSession;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", courseSession=" + courseSession + "]";
	}
}