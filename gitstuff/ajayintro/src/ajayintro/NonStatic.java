package ajayintro;

import java.util.Scanner;

public class NonStatic {

	public static void main(String[] args) {
		NonStatic s=new NonStatic();
		Scanner sc=new Scanner(System.in);
		System.out.println("input1:");
		System.out.println("input2:");
		System.out.println("input3:");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		  s.add(n,a,b);
	}
	
	public   void add(int n,int a,int b)
	{
		
		
		int sum = n+a+b;
	
		System.out.println(sum);
	
	
		

	

	}

}
