package com.array;

// same program is for the multiplication array and for the division array 

public class AdditionArray {
	
	public static boolean getAdditionArray(int []a, int add) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==add) {
					System.out.println(" " + a[i] + " + " + a[j] + " = " + add);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
	
			int []a= {1,2,4,8,5,3};
			int add = 5;
			getAdditionArray(a,add);
	}

}
