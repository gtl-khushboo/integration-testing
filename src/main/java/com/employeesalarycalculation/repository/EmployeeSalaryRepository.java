package com.employeesalarycalculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeesalarycalculation.model.EmployeeSalary;

@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalary, String> {
}
