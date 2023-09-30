package com.demo;

public class PalindromeNumberRange {

	public static void main(String[] args) {
		int range1 = 10;
		int range2 = 200;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("palindrome numbers between " + range1 + " and " + range2 + " are : ");
		for (int i = range1; i<=range2; i++) {
			num1 = i;
			num2 = 0;
		while (num1 !=0) {
			int r = num1%10;
			num2 = (num2*10)+ r;
			num1 = num1/10;
		}
		if (i==num2) {
			System.out.print(i+ ", ");
		}
	}
    
  }

}
