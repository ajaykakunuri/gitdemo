package ajayintro;

import java.util.Scanner;

public class Subtraction12 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("input1:");
		System.out.println("input2:");
		System.out.println("input3:");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		sub(n,a,b);
	}
	
	public static void sub(int n,int a,int b)
	{
		
		
		int sum = n-a-b;
	
		System.out.println(sum);
	
	
	}	

	}


