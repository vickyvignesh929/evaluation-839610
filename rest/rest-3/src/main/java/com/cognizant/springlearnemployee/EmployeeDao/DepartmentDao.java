package com.cognizant.springlearnemployee.EmployeeDao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearnemployee.Entity.Department;

@Component
public class DepartmentDao {

	private static ArrayList<Department> department_list;
	
	@SuppressWarnings({ "resource", "unchecked" })
	DepartmentDao()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-departments.xml");
		DepartmentDao.department_list = context.getBean("departmentList", java.util.ArrayList.class);
	}

	public static ArrayList<Department> getDepartment_list() {
		return department_list;
	}
	
	public ArrayList<Department> getAllDepartments()
	{
		return department_list;
	}
}
