package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmpolyeeServiceImplementation implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeerepository;
	
	@Override
	public Employee saveEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

}
