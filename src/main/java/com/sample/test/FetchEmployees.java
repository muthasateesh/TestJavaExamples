package com.sample.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FetchEmployees {

	public static void main(String[] args) {
		//Fetch Employees based on there Age , where Age > 25
		List<Employee> empList=EmployeeData.createEmployeeList();
		List<Employee> empAgeList=empList.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList());
		empAgeList.forEach(emp->System.out.println(emp));
		
		//Fetch All Employee Names
		List<String> EmpByname=empList.stream().map(Employee::getEmpName).collect(Collectors.toList());
		EmpByname.forEach(emp->System.out.println(emp));
		
		//Fetch Employees Group By City 
		Map<String,List<Employee>> groupByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		groupByCity.forEach((k,v)->{ System.out.println("City "+k);  v.forEach(System.out::println);	});
		
		// 2nd Highest Salary
		Optional<Double> secondHighSal=empList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("2nd Highest sal = "+secondHighSal.get());
		// or
		Optional<Double> secondHighSal2=empList.stream().map(e->e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("2nd Highest sal = "+secondHighSal2.get());
		
		

	}

}
