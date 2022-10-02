package com.cognologix.mapper;

import com.cognologix.entity.Employee;

public class EmployeeMapper {
	public static Employee getEmployeeMapped(String employee) {
		Employee employeeObject = null;
		try {
		String employeeArray[] = employee.split(", ");

		Integer employeeId = Integer.parseInt(employeeArray[0]);
		String employeeName = employeeArray[1];
		String employeeDepartment = employeeArray[2];
		Integer employeeSalary = Integer.parseInt(employeeArray[3]);

		employeeObject = new Employee(employeeId, employeeName, employeeDepartment, employeeSalary);
		} catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return employeeObject;
	}
}
