package com.demo;

import org.hibernate.validator.constraints.SafeHtml;

//import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class Employee {
//	@NotNull
	@SafeHtml
	String name;
//	@NotNull
	String department;
	
	
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
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
	
	

}
