package ajayintro;

import java.util.Scanner;

public class counting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("num:");
				int n=sc.nextInt();
				int count=0;
				/*while(n>0)
				{
					n=n/10;
					count++;
					
				}*/
				for(int i=0;i<=n;i++)
				{
					n=n/10;
					count++;
				}
		System.out.println(count);
		

	}

}
