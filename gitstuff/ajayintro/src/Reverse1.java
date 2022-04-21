import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		int b=0;
		while(n>0)
		{
			b=b*10+n%10;
			n=n/10;
		}
		
System.out.println(b);
		
	}

}
