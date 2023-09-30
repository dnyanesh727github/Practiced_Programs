package com.array;

public class DifferenceArray {
	
	
	public static boolean getDifferenceArray (int []a, int diff) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if (a[i]-a[j]==diff) {
					System.out.println(" " + a[i] + " - " + a[j] + " = " + diff );
			}
		}
	}
		return true;
	}

	public static void main(String[] args) {
		
			int []a = {1,2,4,8,5,3};
			int diff = 5;
			getDifferenceArray(a, diff);
	}

}
