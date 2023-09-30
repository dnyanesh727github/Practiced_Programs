package com.array;
import java.util.Arrays;
public class ReverseArray {
	
	public static void getReverseArray(int []arr, int startpoint, int endpoint) {
		
		int temp;
		while(startpoint < endpoint) {
			temp = arr[startpoint];
			arr[startpoint]=arr[endpoint];
			arr[endpoint]=temp;
			startpoint++;
			endpoint--;
		}	
	}
	
	public static void printReverse(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print( arr[i] + " "); 
		}
	}
	public static void main(String[] args) {
		
			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			System.out.println("Array : " + Arrays.toString(arr));
			getReverseArray(arr, 0, 9);
			System.out.print("Reverse Array : ");
		    printReverse(arr, 10);		
	}
}
