package com.ecoleprivee.ecoleprivee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoleprivee.ecoleprivee.repository.LocationRepository;

@Service
public class HomeService {
	
	@Autowired 
	private LocationRepository locationRepository;
	public List<String> getLocations(){
		return locationRepository.findLocations();
	}
	
}
