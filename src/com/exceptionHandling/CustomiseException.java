package com.exceptionHandling;

class MarksException extends Exception{
	MarksException(String msg){
		System.out.println(msg);
	}
}
public class CustomiseException {
	public static void main(String[] args) {
	
		int marks = 30;
		try {
			marksCheck(marks);
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
	private static void marksCheck(int marks) throws MarksException {
		
		if (marks < 35) {
			throw new MarksException("You are Failed in a Exam");
		}else {
			System.out.println("You passed the Exam");
		}		
	}
}
