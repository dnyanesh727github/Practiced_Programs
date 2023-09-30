package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println("Array = " + list);
		System.out.println("\n******************");
		
		int collectionA = Collections.frequency(list, "a");
		int collectionB = Collections.frequency(list, "b");
		int collectionC = Collections.frequency(list, "c");
		int collectionD = Collections.frequency(list, "d");
		
		System.out.println("Frequency of A : " + collectionA);
		System.out.println("Frequency of B : " + collectionB);
		System.out.println("Frequency of C : " + collectionC);
		System.out.println("Frequency of D : " + collectionD);
	}

}
