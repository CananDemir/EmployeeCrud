package com.example.springboot.crud.service;

import java.util.List;

import com.example.springboot.crud.model.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmployees();
}
