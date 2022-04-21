package com.ajay;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("input:");
	 int n=sc.nextInt();
	 int b=1;
	 int i=1;
	while(i<=n)
	 {
		
		
		 b=b*i;
		 i++;
		 
		 
	 }
		 
System.out.println(b);
	}

}
