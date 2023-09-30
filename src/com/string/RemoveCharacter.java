package com.string;

public class RemoveCharacter {

	public static void main(String[] args) {


		//Q1
		String s1 = "Dnyapnepshp";
		// char ch = 'p';   he lihinyachi garaj nahi
		String str = s1.replace("p", "");
		System.out.println(str);
		
		//Q2
		String s2 = "AY7014";
		String str1 = s2.replace("AY", "88");
		System.out.println(str1);

	}

}
