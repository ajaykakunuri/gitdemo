package ajayintro;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
