package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrtoList {
public static void main(String[] args) {
	String [] values= {"uma","bannu","srinu`"};
	ArrayList<String> names=new ArrayList<>(Arrays.asList(values));
	names.add("UA");
	System.out.println("names:"+names);
}
}


