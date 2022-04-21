package ajayintro;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		int n=sc.nextInt();
		int a;
		int b=0;
		int temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			b=b+(a*a*a);
			
		}
if(b==temp)
{
	System.out.println("armstrong");
}
else
	System.out.println("not armstrong");
	}

}
