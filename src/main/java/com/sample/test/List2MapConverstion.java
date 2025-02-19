package com.sample.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2MapConverstion {

	public static void main(String[] args) {
		List<Employee> empList=EmployeeData.createEmployeeList();
// Convert List of Objects to Map and handle Duplicate keys (Duplicate keys should be removed)

		Map<String,Employee>map=empList.stream().collect(Collectors.toMap(Employee::getEmpName, e->e,(oldValue,newValue)->newValue));
		
		map.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	
		// Convert list of integers to Map by removing duplicated key and value is the occurrence of element
		
		List<Integer> list=Arrays.asList(3,4,7,3,8,2,9,4);
		Map<Object, Integer> countMap=list.stream().collect(Collectors.toMap(i->i, i->1,Integer::sum));
		
		countMap.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
	}

}
