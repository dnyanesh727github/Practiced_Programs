package com.string;

// replace or remove all special characters from the string

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String s = "D@n#y$%a&n*e!sh!$w&ar Ni&*m%ba$#lk%@ar";
		
		String str = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(str);
		
		// [^a-z A-Z 0-9] this replace all function replace all the special characters with empty string except characters written in the [] box.
		// if you want to replace all letters and numbers except special characters then just remove '^' from the box e.g [a-z A-Z 0-9]
		
//*********************************************************************************************************************************************//
		
		System.out.println("\t");
		
		String str1 = s.replaceAll("[a-z A-Z 0-9]", "");
		System.out.println(str1);
		
	}

}
