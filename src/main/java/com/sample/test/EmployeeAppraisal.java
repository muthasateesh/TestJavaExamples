package com.sample.test;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAppraisal {

	public static void main(String[] args) {
		
		List<Employee> empList=EmployeeData.createEmployeeList();
		
        List<Employee> updatedEmployees = empList.stream().map(e -> {
            switch (e.getRating()) {
                case "A":
                    e.setSalary(e.getSalary() * 1.10);
                    break;
                case "B":
                    e.setSalary(e.getSalary() * 1.07);
                    break;
                case "C":
                    e.setSalary(e.getSalary() * 1.03);
                    break;
            }
            return e;
        }).collect(Collectors.toList());

        updatedEmployees.forEach(System.out::println);

	}

}
