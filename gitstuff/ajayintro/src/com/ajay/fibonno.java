package com.ajay;

import java.util.Scanner;

public class fibonno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int s=sc.nextInt();
		int a=0;
		int b=1;
		if(s==1)
		{
			System.out.print(a);
			
		}
		else if(s==2)
		{
			System.out.println(a+""+b);
		}
		else if(s>2)
		{
			System.out.println(a+""+b);
		
		for(int i=3;i<=s;i++)
		{
			int c=a+b;
			System.out.println(c+"");
		a=b;
		b=c;
		}
		}
		else
		{
			System.out.println("invalid");
		}
	
	
		
			
		

	}

}
