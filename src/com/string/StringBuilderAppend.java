package com.string;

public class StringBuilderAppend {

	public static void main(String[] args) {
		//1
		StringBuilder sb = new StringBuilder("Dnyanesh ");
		sb.append("Nimbalkar");
		System.out.println(sb);
		
		//2
		sb.insert(8	, " Maruti");
		sb.toString();
		System.out.println(sb);
		
		//3
		String str = "PratapNimbalkar";
		String s = str.substring(0, 6);
		System.out.println(s);
		
		String s1 = str.substring(6);
		System.out.println(s1);

	}

}
