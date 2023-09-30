package com.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// 1st method = using this method you will get result but order is not preserved
		String s = "dnyaneshwar nimbalkar";
		
		Set<Object> set = new HashSet<>();     // here if I use set<Object> set = new LinkedHashSet<>(); then i will get preserved order. 
		                                       // because in linked hash set oder is preserved
		
		for (int i= 0; i< s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Object b : set) {
			System.out.print(b + " ");
		}
		System.out.println("\n  ***************************");
		
//============================================================================//
		
		// 2nd method = by using lambda function
		
		StringBuilder sb = new StringBuilder();
		s.chars().distinct().forEach(o-> sb.append((char)o));
		System.out.println("  " + sb);
		
		//The append method is mainly used to append or add data in a file.
		//You can add characters, Booleans, string, integer, float, etc., to the data in a program	
		

	}

}
