package com.ecoleprivee.ecoleprivee.Controller;

import java.sql.Date;
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

@Controller
public class HomeController {
	

	@Autowired
	private HomeService homeService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired 
	private CourseSessionRepository courseSessionRepository;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<String> locations= homeService.getLocations();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("locations", locations);
		return mv;
	}
	
	@RequestMapping("/search")
	public ModelAndView chercher(@RequestParam String title, @RequestParam String city, @RequestParam Date startDate) {
		List<CourseSession> sessions = courseSessionRepository.findByCourseTitleLikeAndLocationCityAndStartDateAfter("%"+title+"%", city, startDate);
		clientService.tauxDeRemplissage(sessions);
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("listeSessions");
		 mv.addObject("sessions", sessions);
		 List<String> locations= homeService.getLocations();
		 mv.addObject("locations", locations);
		 return mv ;
	}
}
