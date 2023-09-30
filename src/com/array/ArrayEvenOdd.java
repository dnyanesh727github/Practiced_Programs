package com.array;

// input int []arr = {2,4,1,5,6,7,8,10,9,11,12} Segregate array odd even

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		int []arr = {12,4,1,5,6,7,8,10,9,11,2};
		int []a = new int[arr.length];
		int index = 0;
		
		for (int i = 0; i<a.length; i++) {
			if (arr[i] % 2 == 0 ) {
				a[index]=arr[i];
				index++;
			}
		}
		for (int i =0; i<a.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " , ");
		}
	}

}
