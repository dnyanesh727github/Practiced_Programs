package com.demo;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		
		String original = "454";
		String reverse = "";
		
		for(int i = original.length()-1; i>=0; i--) 
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse)) 
			System.out.println("it is palindrome number");
		else 
			System.out.println("it is not a palindrome number");
	
	}

}
