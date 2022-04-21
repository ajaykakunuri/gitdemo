import java.util.Scanner;

public class Whilefactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int a=sc.nextInt();
		int n=1;
		
		while(a>0)
		{
			n=n*a;
		
			a--;
			
			
			
		}
		System.out.println(n);

	}

}
