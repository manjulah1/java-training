package com.cognologix.solution;

import java.util.List;
import java.util.Map;
import com.cognologix.controllers.EmployeeOperations;

public class Main {
	public static void main(String[] args) {

		try {
			String[] inputData = { "22, Rajan Anand, Engineering, 1600000", "23, Swati Patil, Testing, 800000",
					"27, Vijay Chawda, Engineering, 800000", "29, Basant Mahapatra, Engineering, 600000",
					"32, Ajay Patel, Testing, 350000", "34, Swaraj Birla, Testing, 350000" };
			EmployeeOperations empinfo = new EmployeeOperations(inputData);

			// map employees to employee list
			empinfo.mapEmployeesToEmployeeList();

			// get departments from employee list
			final List<String> deptList = empinfo.getDepartmentsFromEmployeeList();

			// iterate on deptList and employeeList to get the highest salary for each dept
			final Map<String, Integer> highestSalaryArr = empinfo.calcHighestSalary(deptList);

			// print the result
			empinfo.printHighestSalariedEmployeeIds(highestSalaryArr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
