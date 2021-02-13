package com.cognizant.springlearnemployee.Entity;

public class Employee {

	private String name;
	private String department;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", location=" + location + "]";
	}

}
