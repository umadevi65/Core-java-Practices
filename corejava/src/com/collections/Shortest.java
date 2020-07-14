package com.collections;

import java.util.*;

class Shortest {
	public static void main(String args[]) {

		int m; // m is no. of blocks of platinum
		Scanner ob = new Scanner(System.in);
		String line="";
		Integer sum=0;
		Integer indian=Integer.valueOf(line);
		
		if(indian<2||indian>1000000000) {
			System.out.println("You have choosen out of range.please choose between 1 and 100000000");
			
		}
		else if(indian==2) {
			System.out.println("you can exchange"+ indian +"for "+indian+"money");
			
			
		}
		
		else {
			sum=indian/2+indian/3+indian/4;
			System.out.println("you can excahnge"+indian+ "");
		}
		System.out.println(
				"enter the no of blocks of platinum you want to exchange between 2 and 1000,000,000 included:");
		m = ob.nextInt();
		if(m<2 || m>1000000000 ) {
			System.out.println("You have entered a number out of the range    specified! \n");
			System.out.println("Please Enter number between 1 and 1000000000 included: \n");
		} else if (m == 2) {
			System.out.println("you can exchange " + m + " blocks of platinum for " + m + " units of currency");
			System.exit(0);
		} else

		{
			System.out.println("no of blocks of platinum you want to exchange:" + m);
		}
		int a = m / 2;
		int b = m / 3;
		int c = m / 4;
		int d = a + b + c;
		System.out.println("you can exchange " + m + " blocks of platinum for " + d + " units of currency");
	}
}
