package com.cognologix.entity;

public class Employee {
	private Integer EmpId;
	private String EmpName;
	private String EmpDept;
	private Integer EmpSalary;

	public Employee(Integer empId, String empName, String empDept, Integer empSal) {
		EmpId = empId;
		EmpName = empName;
		EmpDept = empDept;
		EmpSalary = empSal;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public Integer getEmpSalary() {
		return EmpSalary;
	}

	@Override
	public String toString() {
		return java.text.MessageFormat.format(
				"Employee ID: {0} {4} Employee Name: {1} {4} Employee Department: {2} {4} Employee Salary: {3} {4}",
				this.getEmpId(), this.getEmpName(), this.getEmpDept(), this.getEmpSalary(), System.lineSeparator());
	}

}
