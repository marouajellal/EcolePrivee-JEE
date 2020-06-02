package com.ecoleprivee.ecoleprivee.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecoleprivee.ecoleprivee.model.CourseSession;

public interface CourseSessionRepository extends JpaRepository<CourseSession, Integer> {
	public List<CourseSession> findByCourseTitleLikeAndLocationCityAndStartDateAfter(String title, String city, Date startDate);
	

}
