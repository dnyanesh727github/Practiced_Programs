package com.string;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "dnyanesh";
		String reversed = "";
		
		for (int i = str.length()-1; i>=0; i--) {
			reversed = reversed + str.charAt(i);		
		}
		System.out.println(reversed);
	}

}
