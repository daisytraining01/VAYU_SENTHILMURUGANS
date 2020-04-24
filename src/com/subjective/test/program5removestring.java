package com.subjective.test;

public class program5removestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "REST ASSURED";
		System.out.println(charRemoveAt(str,2,3));
	}
	public static String charRemoveAt(String str, int p, int i) {
		return str.substring(0,p)+str.substring(p+1)+str.substring(0,i)+str.substring(i+1);
		
	}

}
