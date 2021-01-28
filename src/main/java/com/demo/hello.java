package com.demo;

import javax.validation.Valid;

import org.hibernate.validator.constraints.SafeHtml;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang.StringEscapeUtils;
@RestController

public class hello {

	
	@PostMapping("/hello")
	public ResponseEntity<EmployeeResponse> hello(
			@Valid
			@RequestBody Employee emp) {
		
		EmployeeResponse n= new EmployeeResponse();
		n.setName(emp.getName());
		n.setDepartment(emp.getDepartment());
		return ResponseEntity.ok()
				.header("X-Content-Type-Options", "nosniff")
				.header("Content-Security-Policy", "script-src 'self'")
				.body(n);
	}
	
	@GetMapping(path="/test")
	public ResponseEntity<String> helloE(@RequestParam(name="name") String name,@RequestParam(name="message") String message) {
		String n="hi "+name+ " Message: " +message;;
		return ResponseEntity.ok()
				.body(n);	
	}
	
	
	
}
