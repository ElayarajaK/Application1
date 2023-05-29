package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeServices;
import com.example.demo.services.EmpolyeeServiceImplementation;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServices employeserve;
	
	@PostMapping("/addemployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString() +"listing ..");
	return employeserve.saveEmployeeData(employee);
	}
}
