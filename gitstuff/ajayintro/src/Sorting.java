import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		int a=0,b=0,c=0;
		for(int i=0;i<=n;i++)
		{
			if(n>0)
			{
				a=n%10;
				b=n/10;
			}
		}
				if(a>b)
				{
					c=a;
				a=b;
				b=c;
				System.out.println(a+""+b);
				}
				else
				
					System.out.println(a+""+b);
			}
			
		}
					
			
				
			
		
		
		
		

	


