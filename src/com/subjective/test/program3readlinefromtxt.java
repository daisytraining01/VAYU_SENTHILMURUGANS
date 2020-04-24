package com.subjective.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class program3readlinefromtxt {

	public static void main(String[] args) throws Throwable, Exception {
		// TODO Auto-generated method stub
        File file1 =new File("resources\\sample.txt");
        try(BufferedReader bf= new BufferedReader(new FileReader(file1))){
        	String readLine;
        	int line=0;
        	while((readLine =bf.readLine()) !=null) {
        		if(line % 2 !=0) {
        			System.out.println(readLine);
        		}
        		line++;
        	}
        }
	}

}
