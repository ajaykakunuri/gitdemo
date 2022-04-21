package ajayintro;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		int count1=0;
		int count2=0;
		int s;
		while(n>0)
		{
			s=n%10;
			
			if(s%2==0)
				count1++;
		
		else
		{
			count2++;
	}
			n=n/10;
		}
		
System.out.println(count1);
System.out.println(count2);
	}

}
