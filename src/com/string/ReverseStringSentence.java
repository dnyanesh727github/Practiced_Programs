package com.string;

public class ReverseStringSentence {

	public static void main(String[] args) {
		
		String []s = " Practice Makes Man Perfect".split(" ");
		String result = "";
		
		for (int i = s.length-1; i>0; i--) {
			result = result + s[i]+ " ";
		}
		System.out.println(result.substring(0, (result.length()-1)));
	}

}
