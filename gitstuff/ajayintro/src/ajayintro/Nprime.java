package ajayintro;

import java.util.Scanner;

public class Nprime {
	
	public static boolean prime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int num=sc.nextInt();
		int n=1;
		int count=1;
		
		while(count<=num)
		{
		n++;
		if(Nprime.prime(n))
		{
		System.out.println(n);
					count++;
					
					
				}
			}
			
		}
		
		
		

	}


