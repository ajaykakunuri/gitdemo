package ajayintro;

public class Primenumber {

	public static void main(String[] args) {
		 int num=12;
		 int a=0;
		 
for(int i=2;i<=num;i++)
{
	if(num%i==0)
		a=a++;
		
}
if(a==2)
{
	System.out.println("prime");
}
	else
	{
		System.out.print("not prime");
	}
		 

	}


}