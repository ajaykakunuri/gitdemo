import java.util.Scanner;

public class palandrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		int a=0,r=0;
		int t;
		t=n;
		
		while(n>0)
			{
				a=n%10;
				r=(r*10)+a;
				n=n/10;
				
			}
				
			
					if(t==r)
					
						System.out.println("palindrome");
					
					else
					
						System.out.println("invalid");
					
					
			
			}
		}

	


