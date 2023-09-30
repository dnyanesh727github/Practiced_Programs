package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Merge given two array using array list

public class MergeArray {

	
	public static void main(String[] args) {
		
		String []a = {"a", "b", "c"};
		String []b = {"d", "e",};
		
		// first we need to create object of arrayList class so that we can access the methods of that class like add or addAll
		
		//List list = new ArrayList();                 // it is best industrial practice to use list here so that it wont be tightly coupled. 
		                                               // if we use ArrayList insted of List then it will become tightly coupled
		
	
		List list = new ArrayList(Arrays.asList(a));  // by using Array.asList we are converting String array a into list and adding elements in list
		list.addAll(Arrays.asList(b));                // here we have added all elements of b into list
		                                                  
		System.out.println(list);        // here will get the ans in list form
		Object []c = list.toArray();    // here we are converting list back into array and used Object as a return type bz we don't know the type of array
		System.out.println(c);   // there is some problem, need to fiix
	} 

}
