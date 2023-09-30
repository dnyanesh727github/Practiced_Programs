package com.string;

public class CharacterPresentOrNot {

	public static void main(String[] args) {
		
		String str = "dnyanesh";
		CharSequence ch = "d";
		
		boolean b = str.contains(ch);
		
		System.out.println(ch + " is prent in string " + "(" + str + ") : " + b);
		

	}

}
