package com.example.demo.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about" , method = RequestMethod.GET)
	public String aboutPage(Model model) {
		System.out.println("Inside About us page...");
		model.addAttribute("name", "Rakesh Choudhary");
		model.addAttribute("currentDate",new Date().toString());
		return "about";
	}
	
	@GetMapping("/iterate-loops")
	public String iterateLoop(Model m) {
		System.out.println("Inside Iterate-loop page...");
		List<String> names = List.of("rakesh","rahul","vivek","sumit");
		m.addAttribute("names", names);
		return "iterate";
	}
	
	//Handling Conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "F");
		List<Integer> list = List.of(2,3,4,5,6);
		m.addAttribute("list", list);
		return "condition";
	}
	
	//Fragments Example
	@GetMapping("/fragment")
	public String fragment(Model m) {
		m.addAttribute("title", "MyNameIsRakesh");
		return "fragment";
	}
}