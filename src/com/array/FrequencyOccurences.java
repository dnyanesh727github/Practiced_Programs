package com.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOccurences {
	
	public static void getFrequency(int []a) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		System.out.println("\n**********************");
		
		// or
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue()+ ", ");
		}
		System.out.println("\n**********************");
		
		//or
		
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
	      
	      for (int i = 0; i<a.length; i++) {
	    	  if (hm1.containsKey(a[i])) {
	    		  hm1.put(a[i], hm1.get(a[i])+1);
	    	  }else {
	    		  hm1.put(a[i], 1);
	    	  }
	      }
	      System.out.println(hm1);
		
	}

	public static void main(String[] args) {

       int []a = {10, 15, 10, 20, 25, 20, 15, 10, 20, 10};
       getFrequency(a);
		
	}

}
