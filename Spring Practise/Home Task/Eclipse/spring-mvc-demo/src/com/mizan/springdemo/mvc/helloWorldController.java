package com.mizan.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Parent?Controller Mapping
public class helloWorldController {

	// need a controller to show the initial HTML form
	@RequestMapping("/showForm") // Sub/Method Mapping(relative to parent mapping)
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}

	// new a controller method to read data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo") 
	public String letShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey My friend from V3! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
