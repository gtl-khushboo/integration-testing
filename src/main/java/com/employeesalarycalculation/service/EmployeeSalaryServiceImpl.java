package com.employeesalarycalculation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeesalarycalculation.model.EmployeeSalary;
import com.employeesalarycalculation.repository.EmployeeSalaryRepository;

@Service
public class EmployeeSalaryServiceImpl implements EmployeeSalaryService {

	@Autowired
	private EmployeeSalaryRepository employeeSalaryRepository;
	

	@Override
	public EmployeeSalary getEmployeeSalary(String id) {
		EmployeeSalary empSalaryDetail = employeeSalaryRepository.getById(id);
		empSalaryDetail.setSalary(getEmpSalary(empSalaryDetail.getSalGrade()));
		return empSalaryDetail;
	}

	@Override
	public List<EmployeeSalary> getAllEmployeeSalaries() {
		List<EmployeeSalary> empls = employeeSalaryRepository.findAll();
		for(EmployeeSalary emp : empls)
		{
			emp.setSalary(getEmpSalary(emp.getSalGrade()));
		}
		return empls;
	}

	@Override
	public void createSalaryRecordForEmployee(EmployeeSalary employeeSalary) {
		employeeSalaryRepository.save(employeeSalary);
	}
	
	public Long getEmpSalary(String salGrade)
	{
		if(salGrade.equalsIgnoreCase("A"))
		{
			return 10000L;
		}
		else if(salGrade.equalsIgnoreCase("B"))
		{
			return 20000L;
		}
		else if(salGrade.equalsIgnoreCase("C"))
		{
			return 30000L;
		}
		else
		{
			return 0L;
		}
		
	}

}
