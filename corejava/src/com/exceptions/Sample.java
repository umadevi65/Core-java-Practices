package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
	int value;
public static void main(String[] args) throws IOException,FileNotFoundException {
	System.out.println("Enter the input integer value");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int value =br.read();
Throwable th;
	try {
		testException(value);
		//testException(value);
	}	
	
	catch(FileNotFoundException e) {
		e.printStackTrace();
		e.getLocalizedMessage();
		e.getMessage();
		e.getCause();
		e.toString();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Relesaing Resources ");
	}
	testException(value);
}
public static void testException(int value)throws IOException {
	if(value<0) {
		System.out.println("negative value");
	}
	else if(value>0) {
		System.out.println("positive value");
	}
}
}
