package com.array;

import java.util.Arrays;

// find the largest number in array

public class LargestArrayNumber {
	
	public static void getLargestArrayNumber(int []a) {
		
		Arrays.sort(a);		
		for (int i=a.length-3; i>=0; i--) {
			if (a[i] != a.length) {                                           // second largest for(int i=a.length-2; i>=0; i--)
				System.out.println(" Largest array Number is : " + a[i]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		
			int []a = { 15, 25, 85, 95, 55, 65, 75, 35, 45};
			getLargestArrayNumber(a);
	}

}
