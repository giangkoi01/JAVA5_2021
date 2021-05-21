package io.spring.model;

import org.springframework.stereotype.Component;

@Component(value = "Employee")
public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
