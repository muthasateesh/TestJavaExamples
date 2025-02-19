package com.sample.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	
	public static List<Employee> createEmployeeList(){
		List<Employee> empList=new ArrayList<>();
		Employee e1=new Employee("16", "Arun", "Hyderabad", 35, 35000.0, "Male","HR","A");
		Employee e2=new Employee("12", "Mahesh", "Banglore", 25, 45000.0, "Male","Software Engineer","B");
		Employee e3=new Employee("13", "Ritik", "Hyderabad", 21, 55000.0, "Male","Manager","C");
		Employee e4=new Employee("11", "Aruna", "Pune", 32, 65000.0, "Female","Team Lead","A");
		Employee e5=new Employee("9", "Kavya", "Noida", 31, 25000.0, "Female","HR","C");
		Employee e6=new Employee("1", "Pavan", "Pune", 21, 35029.0, "Male","Software Engineer","B");
		Employee e7=new Employee("8", "Arjun", "Mysore", 22, 95000.0, "Male","Finance","C");
		Employee e8=new Employee("2", "Kamal", "Hyderabad", 23, 75000.0, "Male","Finance","A");
		Employee e9=new Employee("18", "Kamala", "Mysore", 34, 15000.0, "Female","Software Engineer","A");
		Employee e10=new Employee("19", "Madhu", "Noida", 33, 85000.0, "Male","HR","B");
		Employee e11=new Employee("21", "Madhuri", "Mumbai", 30, 135000.0, "Female","Finance","B");
		Employee e12=new Employee("10", "Praveen", "Hyderabad", 26, 235000.0, "Male","Junior Engineer","A");
		Employee e13=new Employee("3", "Bhuvana", "Chennai", 22, 635000.0, "Female","Senior Engineer","C");
		Employee e14=new Employee("5", "Raju", "Hyderabad", 23, 835000.0, "Male","Manager","B");
		Employee e15=new Employee("15", "Aruna", "Chennai", 45, 245000.0, "Female","HR","A");
		Employee e16=new Employee("14", "Shilaja", "Hyderabad", 36, 265000.0, "Female","Project Manager","B");
		Employee e17=new Employee("24", "Rajini", "Hyderabad", 37, 315000.0, "Male","Manager","A");
		Employee e18=new Employee("34", "Bhuvana", "Hyderabad", 37, 315000.0, "Male","Manager","A");
		Employee e19=new Employee("41", "Madhuri", "Hyderabad", 37, 315000.0, "Male","Manager","A");
		Employee e20=new Employee("22", "Rajini", "Hyderabad", 37, 315000.0, "Male","Manager","A");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		empList.add(e11);
		empList.add(e12);
		empList.add(e13);
		empList.add(e14);
		empList.add(e15);
		empList.add(e16);
		empList.add(e17);
		empList.add(e18);
		empList.add(e19);
		empList.add(e20);
		
		return empList;
	}

}
