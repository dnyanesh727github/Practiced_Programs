package com.string;

import java.util.HashMap;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		
		String s= "potato";
		int count;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = s.length()-1; i>=0; i--) {
			if (hm.containsKey(s.charAt(i))) {
				count = hm.get(s.charAt(i));
				hm.put(s.charAt(i), ++count);
			}else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
	}

}
