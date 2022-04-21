import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int a= sc.nextInt();
		int n,g=a;
		int  c=0;
		
		while(a>0)
			
		{
			
			n=a%10;
			a=a/10;
			
			c=c+n*n*n;
			
		}
		if(g==c)
		
			System.out.println("armstrong");
		
		else
		
			System.out.println("not");
			
			
		
				
			
			
	
		}
		

	}


