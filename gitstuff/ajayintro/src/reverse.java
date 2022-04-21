import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		int num=sc.nextInt();
		int a=0;
		while(num>0)
		{
			a=a*10+num%10;
		
			num=num/10;
		}
		System.out.println(a);
		
	
		
		

	}

}
