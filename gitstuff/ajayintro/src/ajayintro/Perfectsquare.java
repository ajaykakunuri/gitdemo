package ajayintro;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		int n=sc.nextInt();
		int a=5;
		if(n==a*a)
		{
			System.out.println("perfect square");
		}
		else
			System.out.println("not");
	}

}
