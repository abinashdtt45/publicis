package com.abinash.emp;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee("Muskesh", "Vegetable Seller", 1), new Employee("Ramesh", "Retailer", 2),
				new Employee("Suresh", "Homemaker", 4));
	}
}

