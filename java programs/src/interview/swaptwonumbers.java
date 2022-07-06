package interview;

public class swaptwonumbers {
	
	void swap()
	{
		int a=10;
		int b = 20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value is a= "+a);
		System.out.println("b value is b= "+b);
	}
	
	void without_third_variable()
	{
		int a=10;
		int b =20;
		a= a-b;
		b= a+b;
		a= b-a;
		System.out.println("a value is a= "+a);
		System.out.println("b value is b= "+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swaptwonumbers obj = new swaptwonumbers();
	obj.swap();
	obj.without_third_variable();
	}

}
