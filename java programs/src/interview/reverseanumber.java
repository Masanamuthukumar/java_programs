package interview;

public class reverseanumber {
	
	void reverse_a_number()
	{
		
		int original = 12;
		int reverse=0;
		while((original!=0))
		{
		reverse = reverse*10;
		reverse= reverse + original%10;
		original = original/10;
		
		}System.out.println(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseanumber obj = new reverseanumber();
	obj.reverse_a_number();
	}

}
