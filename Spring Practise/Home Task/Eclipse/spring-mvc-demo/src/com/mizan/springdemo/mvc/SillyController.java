package com.mizan.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SillyController {
	@RequestMapping("/showForm") // Sub/Method Mapping(relative to parent mapping)
	public String displayTheForm() {

		return "silly";
	}

}
