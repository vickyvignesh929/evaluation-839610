package com.cognizant.springlearnemployee.EmployeeDao;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearnemployee.Entity.Employee;

@Component
public class EmployeeDao {

	private static ArrayList<Employee> employee_list;

	@SuppressWarnings({ "resource", "unchecked" })
	EmployeeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-departments.xml");
		EmployeeDao.employee_list = context.getBean("employeeList", java.util.ArrayList.class);
	}

	public static ArrayList<Employee> getEmployee_list() {
		return employee_list;
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		return employee_list;
	}
}
