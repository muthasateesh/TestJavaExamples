package com.sample.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployees {

	public static void main(String[] args) {
		List<Employee> empList=EmployeeData.createEmployeeList(); // Assigning data to Employee
		System.out.println("Before Sorting ");
		empList.forEach(emp->System.out.println("Employee Name :"+emp.getEmpName()+" City :"+emp.getCity()));
		// Sort based on Employee Names
		empList.sort(Comparator.comparing(Employee::getEmpName));
		System.out.println("After Sorting ");
		empList.forEach(emp->System.out.println("Employee Name :"+emp.getEmpName()+" City :"+emp.getCity()));
		
		// Reverse the Employee List
		empList.sort(Comparator.comparing(Employee::getEmpName).reversed());
		System.out.println("After Reverse Sorting ");
		empList.forEach(emp->System.out.println("Employee Name :"+emp.getEmpName()+" City :"+emp.getCity()));
		
		// Group By Employee City and Employee Name
		Comparator<Employee> groupbyCityAndName=Comparator.comparing(Employee::getCity).thenComparing(Employee::getEmpName);
		empList.sort(groupbyCityAndName);
		System.out.println("After groupbyCityAndName Sorting ");
		empList.forEach(emp->System.out.println("Employee Name :"+emp.getEmpName()+" City :"+emp.getCity()));
		
		// Sort by Department Name
		List<Employee> sortedByDept=sortByDeptName(empList);
		System.out.println("After Sorting by Department ");
		sortedByDept.forEach(System.out::println);
	}
	
	public static List<Employee> sortByDeptName(List<Employee> employees){
		
		return employees.stream().sorted((e1,e2) -> {
			int deptComparition = e1.getDepartment().compareTo(e2.getDepartment());
			return deptComparition !=0? deptComparition:e1.getEmpName().compareTo(e2.getEmpName());
		}).collect(Collectors.toList());
		
		
	}

}
