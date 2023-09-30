package com.string;

public class StringReverseByStringBuilder {

	public static void main(String[] args) {
		
		String string = StringReverseByStringBuilder.stringBuilder("dnyanesh");
		System.out.println(string);
	}
		
		public static String stringBuilder(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();

	}


}
