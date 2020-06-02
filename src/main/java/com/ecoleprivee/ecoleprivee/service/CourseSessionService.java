package com.ecoleprivee.ecoleprivee.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.ecoleprivee.ecoleprivee.model.CourseSession;
import com.ecoleprivee.ecoleprivee.repository.CourseSessionRepository;

public class CourseSessionService {
	
	@Autowired
	private CourseSessionRepository courseSessionRepository;
	
	public CourseSession getSession (int id) {
		return courseSessionRepository.findById(id).orElse(null);
	}
}
