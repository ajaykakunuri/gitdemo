import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input");
		String s=sc.nextLine();
		String b="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
		b=b+s.charAt(i);
		}
		System.out.println(b);
		}
		
		

	}


