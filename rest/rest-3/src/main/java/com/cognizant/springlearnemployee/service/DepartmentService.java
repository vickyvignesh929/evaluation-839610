package com.cognizant.springlearnemployee.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearnemployee.EmployeeDao.DepartmentDao;
import com.cognizant.springlearnemployee.Entity.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	@Transactional
	public ArrayList<Department> getAllDepartments()
	{
		return departmentDao.getAllDepartments();
	}
}
