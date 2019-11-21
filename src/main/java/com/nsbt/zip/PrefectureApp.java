package com.nsbt.zip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrefectureApp {

	@GetMapping("{prefecture}")
	public ModelAndView get(@PathVariable("prefecture") String prefecture) {
		return new ModelAndView("prefecture", "name", prefecture);
	}
}
