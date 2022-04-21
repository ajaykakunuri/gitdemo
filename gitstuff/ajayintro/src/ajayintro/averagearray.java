package ajayintro;

import java.util.Scanner;

public class averagearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value:");
		int[] array=new int[5];
		
		int i=0;
		int sum=0;
		
		
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		
		
		}
		while(i>=array.length)
		{
			sum=sum+i;
			
		}	
		
		
		
		
		
		
		
		System.out.println(sum);

	
				
}
}

