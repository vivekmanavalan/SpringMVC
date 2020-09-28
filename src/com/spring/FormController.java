package com.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	//The below request mapping is used to access the form
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping("/viewform")
	
	//below is the sample model class 
	public String viewForm(HttpServletRequest request, Model model) {
		//this will fetch the value entered in the firstname field using the getparameter
		String name = request.getParameter("firstname");
		String dob = request.getParameter("dob");
		
		//we can set the values in the attributes and retrieve it in another jsp
		model.addAttribute("name", name);
		model.addAttribute("dob", dob);
		
		//viewform is the name of the jsp that is the final view that is rendered to the browser
		return "viewform";
	}
}
