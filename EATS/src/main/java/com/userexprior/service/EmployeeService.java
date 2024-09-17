package com.userexprior.service;

import java.util.List;

public interface EmployeeService {
	public void save(List<String> result);
	public List<Object[]> findAllEmployee();
}
