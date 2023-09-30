package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		
		String s = "Dnyanesh, Nimbalkar";
		s= s.toLowerCase();
		char []ch = s.toCharArray();
		int count=0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for ( int i =0; i<ch.length; i++) {
			if (map.containsKey(ch[i])) {
				count = map.get(ch[i]);
				map.put(ch[i], ++count);				
			}else {
				map.put(ch[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println("Character " + entry.getKey() + " = " + entry.getValue());
			}
			
		}

	}

}
