package interview;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b=0;
		int c=1;
		int num =10;
		
		for (int i=0; i<num;i++)
		{
		a=b;
		b=c;
		c=a+b;
		
		System.out.println(a);
		
		}
		
	}

}
