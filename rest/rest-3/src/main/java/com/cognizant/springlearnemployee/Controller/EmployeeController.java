package com.cognizant.springlearnemployee.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearnemployee.Entity.Employee;
import com.cognizant.springlearnemployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path="/employees")
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
}
