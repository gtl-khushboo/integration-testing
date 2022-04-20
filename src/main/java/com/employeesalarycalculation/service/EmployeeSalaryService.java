package com.employeesalarycalculation.service;

import java.util.List;

import com.employeesalarycalculation.model.EmployeeSalary;

public interface EmployeeSalaryService {

	EmployeeSalary getEmployeeSalary(String id);

	List<EmployeeSalary> getAllEmployeeSalaries();

	void createSalaryRecordForEmployee(EmployeeSalary employeeSalary);
	
	

}
