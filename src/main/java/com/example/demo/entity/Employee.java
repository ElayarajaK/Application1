package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long E_id;
	private String E_name;
	private String E_Address;
	private int E_Salary;
	
	public Employee() {
		
	}
	public Employee(long e_id, String e_name, String e_Address, int e_Salary) {
		
		E_id = e_id;
		E_name = e_name;
		E_Address = e_Address;
		E_Salary = e_Salary;
	}
	public long getE_id() {
		return E_id;
	}
	public void setE_id(long e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_Address() {
		return E_Address;
	}
	public void setE_Address(String e_Address) {
		E_Address = e_Address;
	}
	public int getE_Salary() {
		return E_Salary;
	}
	public void setE_Salary(int e_Salary) {
		E_Salary = e_Salary;
	}
	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_Address=" + E_Address + ", E_Salary=" + E_Salary
				+ "]";
	}
	
	
	
	

}
