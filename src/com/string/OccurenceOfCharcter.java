package com.string;

public class OccurenceOfCharcter {

	public static void main(String[] args) {
		
		String str = "dnyaneshwar maruti nimbalkar";
		int count=0, count1=0;
		
		for ( int i = 0; i< str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
				continue;
			}else if ( str.charAt(i) == ' ') {
				count1++;
			}
		}
		System.out.println("Occurences of 'a' in String are = " + count);
		System.out.println("Occurences of Space in String are = " + count1);
	}

}
