package ajayintro;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		int count=0;
		
		int s=0;
		while(n>0)
		{
			s=s+n%10;
			n=n/10;
			count++;
		}
		
System.out.println(s);
System.out.println(count);
	

}
}
