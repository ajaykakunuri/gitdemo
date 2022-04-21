import java.util.Scanner;

public class First20fibbonnacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		
		int a=0,b=1,c;
		
		if(n==1)
		{System.out.println(a);
		}
		else if(n==2)
		{
			System.out.println(a+""+b);
		}
		else if(n>2)
		{
			System.out.println(a+""+b);
			for(int i=3;i<=n;i++)
			{
			c=a+b;
System.out.println(c+"");
a=b;
b=c;
			}
		}
		else
		{
			System.out.println("invalid");
		}
				
			
		}

	}


