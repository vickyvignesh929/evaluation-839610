package com.cognizant.springlearnemployee.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearnemployee.Entity.Department;
import com.cognizant.springlearnemployee.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(path="/departments")
	public ArrayList<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
}
