package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1, "Ram", 9000));
		al.add(new Employee(2, "Shyam", 3000));
		al.add(new Employee(3, "Ajay", 8000));
		al.add(new Employee(4, "Vinay", 5000));
		
		Collections.sort(al, new ExtraClassComparator());
		
		//System.out.println(al.toString());
		
		for (Employee e : al) {
			System.out.println("Id : " + e.getId());
			System.out.println("Name : " + e.getName());
			System.out.println("Salary : " + e.getSalary());
			System.out.println("***********");
		}

	}

}
