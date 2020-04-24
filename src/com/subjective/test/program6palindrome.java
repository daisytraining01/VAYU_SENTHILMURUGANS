package com.subjective.test;

import java.util.Scanner;

public class program6palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		str =sc.nextLine();
		int length = str.length();
		for (int i = length-1; i>=0; i--) 
		{
			reverse=reverse + str.charAt(i);
		}
			if (str.equalsIgnoreCase(reverse)) {
				System.out.println(str+" is a palindrome");
			} else {
				System.out.println(str+" is not palindrome");
			}
				
		}

	}

