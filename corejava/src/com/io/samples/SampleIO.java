package com.io.samples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SampleIO {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Srinivas\\Desktop\\Delete.txt"));
		BufferedWriter writ = new BufferedWriter(new FileWriter("C:\\Users\\Srinivas\\Desktop\\Bannu.txt"));

		String line;
		while ((line = reader.readLine()) != null) {
			writ.write(line);
			System.out.println("Fact:" + line);
		}
		reader.close();
		writ.close();
	}
}
