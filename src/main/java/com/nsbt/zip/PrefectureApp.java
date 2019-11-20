package com.nsbt.zip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrefectureApp {

	@GetMapping("hokkaido")
	public ModelAndView get() {
		return new ModelAndView("prefecture");
	}
}
