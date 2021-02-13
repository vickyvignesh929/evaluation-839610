package com.cognizant.springlearn;

public class Country {

	private String code;
	private String name;

	Country() {
		System.out.println("Inside Country Constructor");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
		System.out.println("Inside Code Setter");
		System.out.println(code);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside Name Setter");
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}
