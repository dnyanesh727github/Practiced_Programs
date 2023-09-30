package com.string;

import java.util.Arrays;

// String anagrams means other string has the same letters as first one but in another order  e.g DMN@ , D@NM

public class StringAnagrams {

	public static void main(String[] args) {
		
		String s1 = "cdba";
		String s2 = "ABCD";
		System.out.println(" Check if the s1 and s2 are Anagram to each other : "+getAnagram(s1 , s2));	
	}
	
	public static boolean getAnagram(String s1, String s2) {
		
		char []str1 = s1.toUpperCase().toCharArray();
		char []str2 = s2.toUpperCase().toCharArray();
		
	    Arrays.sort(str1);
		Arrays.sort(str2);
		
		return Arrays.equals(str1, str2);
	}

}
