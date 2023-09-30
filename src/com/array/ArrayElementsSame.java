package com.array;

// input..##      int []b = {1,1,1,1,1} Elements are same //    not solved yet

public class ArrayElementsSame {
	
	public static boolean areSame(int []b) {
		int first = 1;
		for (int i =0; i<b.length; i++) {
			if(b[i]==first)
				  return true;
		}
	  return false;
	}
	
	public static void main(String[] args) {
		
		int []b = {1,1,1,1,1,1,5};
		if (areSame(b)) {
			System.out.println("they are same");
		}else {
			System.out.println("they are not same");
		}
	}

}
