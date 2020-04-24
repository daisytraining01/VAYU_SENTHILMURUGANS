package com.subjective.test;

public class program5comparstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2 = new String("Maveric");
		String str3 =new String("Systems");
		String str4 = new String("Maveric");
		String str5 =new String("Systems");
		System.out.println("comparing"+str2+"and"+str3+":"+str2.equalsIgnoreCase(str3));
		System.out.println("comparing"+str2+"and"+str4+":"+str2.equalsIgnoreCase(str4));
		System.out.println("comparing"+str3+"and"+str4+":"+str3.equalsIgnoreCase(str4));
		System.out.println("comparing"+str3+"and"+str5+":"+str3.equalsIgnoreCase(str5));
	}

}
