package com.string;

public class SortString {

	public static void main(String[] args) {
		
		String s = "CEDFHGBA";
		char []a = s.toCharArray();
		char temp;
		
		for (int i = 0; i< a.length; i++) {
			for ( int j = i+1; j< a.length; j++) {
				if ( a[i] > a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}	
		}
		System.out.println(a);
	}

}
