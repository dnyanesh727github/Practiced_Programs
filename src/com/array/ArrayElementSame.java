package com.array;

import java.util.Arrays;
import java.util.List;

public class ArrayElementSame {
	
	
	public static boolean ArrayElemnetSame (List<String> b){
	     return b.stream().distinct().count() <=1;
	}

	
	public static boolean ArrayElemnetsSame (List<String> b){
	     return b.isEmpty() || b.stream().allMatch(b.get(0) :: equals);
	}
	
	public static void main(String[] args) {
		
		List<String> b= Arrays.asList("1","1","1","1","1");
		
		boolean list = ArrayElementSame.ArrayElemnetSame(b);
		System.out.println(list);
		
		boolean list1 = ArrayElementSame.ArrayElemnetsSame(b);
		System.out.println(list1);
		
		
	}

}
