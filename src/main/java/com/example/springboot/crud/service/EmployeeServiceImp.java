package com.example.springboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.crud.model.Employee;
import com.example.springboot.crud.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService{

	
	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

}
