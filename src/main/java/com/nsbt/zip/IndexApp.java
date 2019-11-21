package com.nsbt.zip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexApp {

	@Autowired
	PrefectureService service;

	@GetMapping
	public ModelAndView get() {
		return new ModelAndView("index", "prefectures", service.findAll());
	}
}
