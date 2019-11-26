package com.nsbt.zip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrefectureApp {

	@Autowired
	CityService service;

	@GetMapping("{prefecture}")
	public ModelAndView get(@PathVariable("prefecture") String prefecture) {
		ModelAndView mov = new ModelAndView("prefecture", "cities", service.find(0));
		mov.addObject("name", prefecture);
		return mov;
	}
}
