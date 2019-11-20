package com.nsbt.zip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexApp {

	@GetMapping
	public String get() {
		return "index";
	}
}
