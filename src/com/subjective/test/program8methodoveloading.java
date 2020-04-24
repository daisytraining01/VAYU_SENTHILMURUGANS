package com.subjective.test;

class program8methodoveloading {
	static int add(int a,int b) {return a+b;}
	static int add(int a,int b,int c) {return a+b+c;}
}	
class overloading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(program8methodoveloading.add(10,9));
		System.out.println(program8methodoveloading.add(10, 10, 10));

	}
}


