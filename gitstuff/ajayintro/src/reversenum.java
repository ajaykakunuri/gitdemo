import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		System.out.println("input1:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a=n1*n2;
		int b=0;
		while(a>0)
		{
			
			
				b=b*10+a%10;
				a=a/10;
						
			}
		
		
		System.out.println(b);
	}


}