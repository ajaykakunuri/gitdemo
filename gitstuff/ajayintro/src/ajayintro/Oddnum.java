package ajayintro;

import java.util.Scanner;

public class Oddnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number"+i);
			
			}
			else
			{
				System.out.println("even"+i);
			
			}
		}

	}

}
