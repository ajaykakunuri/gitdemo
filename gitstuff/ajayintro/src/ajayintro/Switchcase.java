package ajayintro;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input1");
		System.out.println("input2:");
		System.out.println("enter operator");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		char oper=sc.next().charAt(0);
		int n;
		switch(oper)
		{
		case '+':
			n=n1+n2;
			
			break;
		case '-':
			n=n1-n2;
			
			break;
	 default:
		 System.out.println("sorry");
		 return;
		 
			
		}
		System.out.println(n1+""+oper+""+n2+"="+n);
		
		
			
		}
		
		

	}


