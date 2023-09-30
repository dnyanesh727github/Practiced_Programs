package com.exceptionHandling;

public class NullpointerExceptionhandling {

	public static void main(String[] args) {


		try {
			
			int variable = (Integer) null;
			System.out.println(variable);
			
//			String a = null;
//			System.out.println(a.length());
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
