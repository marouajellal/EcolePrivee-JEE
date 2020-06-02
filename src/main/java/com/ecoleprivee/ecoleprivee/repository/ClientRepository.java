package com.ecoleprivee.ecoleprivee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecoleprivee.ecoleprivee.model.Client;

public interface ClientRepository extends JpaRepository<Client, String> {
	
	public List<Client> findByCourseSessionId(int id);
}
