package com.employeesalarycalculation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesalarycalculation.model.EmployeeSalary;
import com.employeesalarycalculation.service.EmployeeSalaryService;

@RestController
@RequestMapping("/v1")
public class EmployeeSalaryController {

	@Autowired
	private EmployeeSalaryService employeeSalaryService;

	@GetMapping("/welcome")
	public String getWelcome() {
		return "welcome";
	}

	@GetMapping("/employee/salary/{id}")
	public EmployeeSalary getSalary(@PathVariable("id") String id) {
		return employeeSalaryService.getEmployeeSalary(id);
	}

	@GetMapping("/employee/salary")
	public List<EmployeeSalary> getSalary() {
		return employeeSalaryService.getAllEmployeeSalaries();
	}

	@PostMapping("/employee/salary")
	public void createSalaryRecord(@RequestBody EmployeeSalary employeeSalary) {
		employeeSalaryService.createSalaryRecordForEmployee(employeeSalary);
	}

}
