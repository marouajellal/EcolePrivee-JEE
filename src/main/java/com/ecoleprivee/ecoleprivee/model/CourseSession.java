package com.ecoleprivee.ecoleprivee.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ecoleprivee.ecoleprivee.model.Client;
import com.ecoleprivee.ecoleprivee.model.Course;
import com.ecoleprivee.ecoleprivee.model.Location;

@Entity
@Table(name="course_session")
public class CourseSession implements Serializable{

	private static final long serialVersionUID = 3700943670949393783L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	@Column(name="startDate")
	private Date startDate ;
	
	@Column(name="endDate")
	private Date endDate ;
	
	@Column(name="max")
	private int max ;

	@ManyToOne
	@JoinColumn(name="locationId")
	private Location location ;
	
	@ManyToOne
	@JoinColumn(name="courseCode ")
	private Course course ;
	
	@OneToMany(mappedBy="courseSession")
	private List<Client> clients ;
	
	@Transient
	private int taux = 0;
	
	@Transient
	public int getTaux() {
		return taux;
	}
	
	@Transient
	public void setTaux(int taux) {
		this.taux = taux;
	}



	public CourseSession() {
		
	}
	
	public CourseSession( Date startDate, Date endDate, int max, Location location, Course course) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.max = max;
		this.location = location;
		this.course = course;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}


	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CourseSession [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", max=" + max
				+ ", location=" + location + ", course=" + course + "]";
	}

	

	
	
	
}

