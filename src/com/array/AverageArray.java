package com.array;

// input find out the average of the array

public class AverageArray {

	public static void main(String[] args) {
		
		double []arr = {10,5.5,5.5,1,10};
		double sum = 0;
		
		for ( double n : arr) {
			sum = sum+n;
		}
		
		double average = sum/arr.length;
		
		System.out.println(" " + average);

	}

}
