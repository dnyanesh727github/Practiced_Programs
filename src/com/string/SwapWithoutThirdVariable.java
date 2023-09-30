package com.string;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		String s1="Dnyanesh";
		String s2="Nimbalkar";
		
		System.out.println(" String Before Swapping = "+ s1 + " "+ s2);
		
		s1 = s1+s2;  // Dnyanesh Nimbalkar ase ale
		s2 = s1.substring(0, (s1.length()-s2.length())); // Dnyanesh ase ale. ethe s2 swap zhala
		                                                 // ethe apan s2 = s1.substring(s2.length()) ase pn lihu shakto
		s1 = s1.substring(s2.length());
		
		System.out.println(" String After Swapping = "+ s1 + " "+ s2);
		

	}

}
