package com.ecoleprivee.ecoleprivee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecoleprivee.ecoleprivee.model.Course;

public interface CourseRepository extends JpaRepository<Course, String> {
}
