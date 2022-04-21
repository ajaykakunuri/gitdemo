package ajayintro;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("num:");
		int a =sc.nextInt();
		int i=1;
		int result;
		for(i=1;i<=10;i++)
		{
			result=a*i;
			System.out.println(a+"*"+i+"="+result);
		}
	}

}
