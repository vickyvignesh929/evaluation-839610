package com.cognizant.springlearnemployee.service;

import java.util.ArrayList;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearnemployee.EmployeeDao.EmployeeDao;
import com.cognizant.springlearnemployee.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public ArrayList<Employee> getAllEmployees()
	{
		return employeeDao.getAllEmployees();
	}
}
