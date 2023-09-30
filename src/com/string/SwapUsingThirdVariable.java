package com.string;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {


		String s1 = " Dnyanesh";
		String s2 = " Nimbalkar";
		System.out.println("Strings Before Swapping : " + s1 + s2);
		String temp;
		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("Strings After Swapping : " + s1 + s2);

	}

}
