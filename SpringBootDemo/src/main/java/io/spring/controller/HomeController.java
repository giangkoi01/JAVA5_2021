package io.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cuchuoi.Employee;

@RestController
public class HomeController {
	
	@Autowired
	private HttpServletRequest request;
	
//	@Autowired
//	public HomeController(
//			HttpServletRequest request,
//			@Qualifier("Employee1") Employee employee,
//			@Qualifier("Employee2") Employee employee2) {
//		this.employee =  employee;
//		this.employee2 =  employee2;
//	}
	
	@Autowired
	private Employee employee;
	
	@Autowired
	@Qualifier("Employee2")
	private Employee employee2;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/hello/j4/v1")
	public String helloJava4(HttpServletRequest request) {
		String name = request.getParameter("name");
		return String.format("Hello %s %s!", name, employee2.getName() );
	}
	
	@GetMapping("/hello/j4/v2")
	public String helloJava4V2() {
		String name = request.getParameter("name");
		return String.format("Hello %s %s!", name, employee.getName() );
	}
	

}
