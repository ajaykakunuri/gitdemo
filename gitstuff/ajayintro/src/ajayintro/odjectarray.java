package ajayintro;

public class odjectarray {

	public static void main(String[] args) {
		
		Object a[][]=new Object[3][2];
		a[0][0]=10;
		a[0][1]="ajay";
		a[1][0]=20;
		a[1][1]=0.2;
		a[2][0]='s';
		a[2][1]=30;
		
		for(Object i[]:a)
		{
			for(Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
				
				
				
		
			}
		}
		
				
		

	}


