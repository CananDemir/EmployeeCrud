package com.example.springboot.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.crud.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployees());
		System.out.println("sonuc :"+employeeService.getAllEmployees().size());
		return "index";
	}
}
