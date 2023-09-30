package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapintoArray {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap();
		
		hashMap.put("Dnyanesh", "Pune");
		hashMap.put("Ashish", "Akluj");
		hashMap.put("Vishwas", "Kettur");
		hashMap.put("Akash", "Khopoli");
		hashMap.put("Vishal", "Sangamner");
		hashMap.put("Vishal", "Satara");
		hashMap.put("akash", "Mumbai");
		
			
		System.out.println(hashMap);
		System.out.println("====================================================");
		
		Iterator it = hashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("====================================================");
		    
		    
        List<String> hashmapKey = new ArrayList<String>(hashMap.keySet());
        System.out.println(" Hashmap Keys " + hashmapKey.size());
        System.out.println(hashmapKey);
        System.out.println("====================================================");
        
        List<String> hashmapValue = new ArrayList<String>(hashMap.values());
        System.out.println("Hashmap Values " + hashmapValue.size());
        System.out.println(hashmapValue);
        System.out.println("====================================================");    
	}

}
