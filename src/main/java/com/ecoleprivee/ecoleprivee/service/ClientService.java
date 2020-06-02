package com.ecoleprivee.ecoleprivee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoleprivee.ecoleprivee.model.Client;
import com.ecoleprivee.ecoleprivee.model.CourseSession;
import com.ecoleprivee.ecoleprivee.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public void addClientToCourseSession(Client client) {
		clientRepository.save(client);
	}
	
	public void tauxDeRemplissage( List<CourseSession> sessions){
		for(CourseSession session : sessions) {
			session.setTaux( clientRepository.findByCourseSessionId(session.getId() ).size() );
		}
	}
}
