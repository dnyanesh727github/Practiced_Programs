package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudentMobileNumbers {
	
	public static void main (String [] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile number for 5 Students : ");
		
		for ( int i = 1; i<=5; i++) {
			System.out.println("Student " + i + " Mobile Number is : ");
			String mobileNumber = sc.nextLine();
			al.add(mobileNumber);
		}
		sc.close();
		System.out.println("Students Mobile Numbers Are : ");
		
		for (int i =0; i<al.size(); i++) {
			System.out.println("Student " + (i+1) + " Mobile Number : " + al.get(i));
		}
	}

}
