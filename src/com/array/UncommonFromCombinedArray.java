package com.array;

import java.util.*;

// find uncommon numbers from both array= find numbers which aree not present in both array
//   Output = [2,4,,8,10];

public class UncommonFromCombinedArray {

	public static void main(String[] args) {
		
		Integer [] a = {1,2,3,4,5,6,7,8,9};
		Integer [] b = {1,3,5,7,9,10};
		
			List<Integer> listA = new ArrayList<Integer>(Arrays.asList(a));
			List<Integer> listB = new ArrayList<Integer>(Arrays.asList(b));
			List<Integer> listC = new ArrayList<Integer>();
			
			for (Integer i : listA) {    
				if (!listB.contains(i)) {     // if you remove ! then you will get the common numbers and one for loop is sufficiant
					listC.add(i);
				}
			}
			for (Integer i : listB) {
				if (!listA.contains(i)) {
					listC.add(i);
				}
			}
			System.out.println(listC);
	}

}
