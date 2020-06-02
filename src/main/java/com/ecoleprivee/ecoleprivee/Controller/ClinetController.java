package com.ecoleprivee.ecoleprivee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecoleprivee.ecoleprivee.service.ClientService;
import com.ecoleprivee.ecoleprivee.service.HomeService;
import com.ecoleprivee.ecoleprivee.model.CourseSession;
import com.ecoleprivee.ecoleprivee.repository.CourseSessionRepository;
import com.ecoleprivee.ecoleprivee.model.Client;

@Controller
public class ClinetController {
	
	@Autowired
	private ClientService clientService;
	@Autowired
	private CourseSessionRepository courseSessionRepository;
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam int idSession) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		mv.addObject("idSession", idSession);
		List<String> locations= homeService.getLocations();
		mv.addObject("locations", locations);
		return mv;
	}
	
	@RequestMapping("/registering")
	public ModelAndView registerClient(@RequestParam String nom ,@RequestParam String prenom,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String email,@RequestParam int idSession) {
		CourseSession courseSession = courseSessionRepository.findById(idSession).orElse(null);
		Client client= new Client (nom,prenom,adresse,telephone,email,courseSession);
		clientService.addClientToCourseSession(client);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		List<String> locations= homeService.getLocations();
		mv.addObject("locations", locations);
		return mv;
	}
	
}
