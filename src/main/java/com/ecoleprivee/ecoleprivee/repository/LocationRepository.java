package com.ecoleprivee.ecoleprivee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecoleprivee.ecoleprivee.model.Location;

public interface LocationRepository extends JpaRepository<Location, String> {
	@Query(value = "SELECT DISTINCT CITY FROM LOCATION", nativeQuery = true)
    List<String> findLocations();
}
