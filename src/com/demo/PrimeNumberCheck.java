package com.demo;

// write prime numbers between given two numbers

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		int start = 1;
		int end = 50;
		
		for (int i = start; i<= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
	}

	private static boolean isPrime(int n) {
		
		if (n<=1) {
			return false;
		}else {
			for (int i=2; i<=n/2; i++) {
				if (n%i ==0) {
					return false;
				}
			}
			return true;
		}
	}

}
