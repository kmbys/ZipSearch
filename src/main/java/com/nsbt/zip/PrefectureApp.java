package com.nsbt.zip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrefectureApp {

	@GetMapping("hokkaido")
	public String get() {
		return "prefecture";
	}
}
