package com.cognologix.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cognologix.entity.Employee;
import com.cognologix.mapper.EmployeeMapper;

public class EmployeeOperations {
	private String[] employeeData;
	List<Employee> employeeList;

	public EmployeeOperations(final String[] employeeData) {
		this.employeeData = employeeData;
	}
	// calculate highest salary
	public Map<String, Integer> calcHighestSalary(final List<String> deptartmentList) {
		Integer highestSalary = 0;
		Employee highestPaidEmployee = null;
		Map<String, Integer> salaryMap = new HashMap<>();
		try {
			for (String deptartment : deptartmentList) {
				for (Employee employee : this.employeeList) {
					if (deptartment.equalsIgnoreCase(employee.getEmpDept())) {
						if (employee.getEmpSalary() > highestSalary) {
							highestSalary = employee.getEmpSalary();
							highestPaidEmployee = employee;
						}
					}
				}
				salaryMap.put(deptartment, highestPaidEmployee.getEmpId());
				highestSalary = 0;
			}
		} catch (NullPointerException nullPointerException) {
			throw new RuntimeException(nullPointerException);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return salaryMap;
	}
	
	// get departments from employee list
	public List<String> getDepartmentsFromEmployeeList() {
		List<String> list = new ArrayList<String>();
		for (Employee employee : this.employeeList) {
			if (list.contains(employee.getEmpDept()) == false) {
				list.add(employee.getEmpDept());
			}
		}
		return list;
	}

	// map employees from string array to employee list
	public void mapEmployeesToEmployeeList() {
		for (String employee : employeeData) {
			Employee employeeObject = EmployeeMapper.getEmployeeMapped(employee);
			this.employeeList.add(employeeObject);
		}
	}

	// print the result
	public void printHighestSalariedEmployeeIds(final Map<String, Integer> highestSalaryArr) {
		System.out.println("The Highest salaried Employee Id's in each department are: " + System.lineSeparator()
				+ highestSalaryArr);
	}
}
