package com.demo;

public class ReverseNumber {

	public static void main(String[] args) {
		int r, sum = 0 ; 
		int n = 123456789;
		System.out.println("original Number : " + n );
		while (n !=0) {
			r = n%10;
			sum = (sum*10)+ r;
			n = n/10;
		}
			System.out.println( "reversed Number : " + sum);
	}

}
