package com.array;

import java.util.Arrays;

// check the given number is available in the array.

public class NumberAvaiableInArray {
	
	public static void getNumber(Integer[] a, int b) {
		
		boolean check = Arrays.asList(a).contains(b);
		System.out.println("is " + b + " is present in Array ? = " + check);
	}

	public static void main(String[] args) {
		
		Integer[] a = {10,20,300,40,45,65,55,25,32,45};
		System.out.println("Array : " + Arrays.toString(a));
		int b = 250;
		getNumber(a,b);
		

	}

}
