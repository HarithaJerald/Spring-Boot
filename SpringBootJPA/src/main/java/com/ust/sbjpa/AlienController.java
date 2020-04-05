package com.ust.sbjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ust.sbjpa.dao.AlienRepo;

@Controller
public class AlienController {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "display.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Alien alien = repo.findById(aId).orElse(new Alien());
		
		System.out.println(repo.findByaName("navin"));
		System.out.println(repo.findByaIdGreaterThan(102));
		System.out.println(repo.findByaNameSorList("java"));
		mv.addObject(alien);
		return mv;
		
	}
	
}
