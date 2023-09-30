package com.array;

import java.util.*;

// write a program to combine two arrayList elements and then travers it by using forEach method or by Iterator

public class MergeArrayListIterater {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(40);
		al1.add(50);
		al1.add(30);
		
		al.addAll(al1);                          // added all the elements from al1 to al
		System.out.println(al);                  // this will give the ans in list form
		
		// by using Iterator interface
		Iterator<Integer> itr = al.iterator();   // it is used to iterate the list		
		while(itr.hasNext()) {                  // hasNext to check if there is next element is present
			System.out.println(itr.next());     // print the next integer element
		}
		
//		 By using for each method
//				for (int i : al) {
//					System.out.println(" " + i);
//				}
	    }	
		
	}


