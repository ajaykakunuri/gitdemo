package com.ajay;

public class GrestesSmallestinArray {

	public static void main(String[] args) {
	int a[]= {1,2,3,45,6};
	int b=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>b)
		{
			b=a[i];
			
			
		}
		System.out.println(b);
	}
		
	}

	}


