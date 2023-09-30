package com.array;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		double numArray[] = {10.0, 20, 5.5, 20.5, 30, 10.5};
		double largest = numArray[0];
		
		for(double n : numArray) {
			if (largest < n) {     // if you use (largest > b) then you will get the smallest number array.
				largest = n;
			}
		}
		System.out.println("Largest number is : " + largest);
	}

}
