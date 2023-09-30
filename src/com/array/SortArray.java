package com.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int arr[] = {-6,2,4,8,6,5,3,7};
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		Arrays.sort(arr);
		System.out.print("\n Sorted Array : ");
		System.out.println(  Arrays.toString(arr));

	}

}
