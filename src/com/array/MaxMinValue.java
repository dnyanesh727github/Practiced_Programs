package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinValue {

	public static void main(String[] args) {
		
		int arr[] = {12,44,66,85,16,18,20,35};
		
		// Initialize min and max with the first element of the array
		
		int min = arr[0];
		int max = arr[0];
		
		// Initialize min and max with the first element of the array
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];      // Update min if a smaller value is found
			}
			if(arr[i] > max) {
				max = arr[i];      // Update max if a larger value is found
			}
		}
		System.out.println(" Max Value : " + max );
		System.out.println(" Min Value : " + min );
		System.out.println(" ************** "  );
	
	
//	****************************************************************************************
             Integer []a = {1,3,4,6,5,2,7,9,8};
             
             // create object of ArrayList and convert Array into list using Arrays.asList and add it into al
             ArrayList<Integer> al = new ArrayList<>(Arrays.asList(a));
             
             // Find the min and max values
             Integer minValue = Collections.min(al);
             Integer maxValue = Collections.max(al);
             
             Arrays.sort(a);                                            // Arrays.ssort method is used to sort array
             System.out.println(" Array : " + Arrays.toString(a));      // this will give you the string representation 
             
             System.out.println(" Max Value : " + maxValue );
     		 System.out.println(" Min Value : " + minValue );
                   
	}       
}

