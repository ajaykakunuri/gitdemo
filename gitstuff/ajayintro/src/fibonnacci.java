import java.util.Scanner;

public class fibonnacci {
	private static long[] fibonnacciCache;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input:");
		int n=sc.nextInt();
		fibonnacciCache=new long[n+1];
		System.out.println(fibonnacci(n));
		
		
				

	}

	private static  long fibonnacci(int n) {

if(n<=1)
{
	return n;
	}
if(fibonnacciCache[n]!=0)
	return fibonnacciCache[n];

long nthfibannaccino=fibonnacci(n-1)+fibonnacci(n-2);
fibonnacciCache[n]=nthfibannaccino;
return nthfibannaccino;

	
	
		
	}

}
