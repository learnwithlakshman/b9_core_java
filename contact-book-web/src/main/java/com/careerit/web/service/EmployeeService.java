package com.careerit.web.service;

import com.careerit.web.domain.Employee;

public interface EmployeeService {

		Page<Employee> getAllEmployees(int page,int size);
}
