package com.cg.employee.fetch.service;

import java.util.List;

import com.cg.employee.fetch.entity.Employee;

public interface EmployeeService {

	List<Employee> fetchAll();

	Employee fetchByid(Integer id);

}
