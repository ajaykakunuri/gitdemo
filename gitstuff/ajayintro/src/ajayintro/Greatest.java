package ajayintro;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input1:");
		System.out.println("input2:");
		System.out.println("input3:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a);
		}
		else if(b>a&&b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		
		}

	}


