package com.subjective.test;

import java.util.Scanner;

public class program2fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci Series of:");
		n=sc.nextInt();
		int f1=0,f2=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(f1+" ");
			int sum=f1+f2;
			f1=f2;
			f2=sum;
		}
		
	}

}
