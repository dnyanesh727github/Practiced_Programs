package com.patterns;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		
		System.out.println("For X Pattern Enter the number here : " );
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int k = number*2-1;
		
		for (int i =1; i<=k; i++) {
			for (int j=1; j<=k; j++) {
				if(j==i || j==k-i+1) {
					System.out.print("**");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
