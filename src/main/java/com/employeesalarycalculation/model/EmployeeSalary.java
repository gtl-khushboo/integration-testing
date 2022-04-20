package com.employeesalarycalculation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeSalary {
	@Id
	private String id;
	@CreationTimestamp
	private Date date;
	private String salGrade;
	private Long salary;
}
