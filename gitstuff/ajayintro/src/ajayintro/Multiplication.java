package ajayintro;

public class Multiplication {

	public static void main(String[] args) {
		int a=2;
		int i=0;
		int res;
		while(i<10)
		{
			res=a+a*i;
			i++;
			System.out.println(a+"*"+i+"="+res);
		}
	}
}