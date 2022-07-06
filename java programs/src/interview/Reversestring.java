package interview;

public class Reversestring {
	
	void using_string()
	{
		String name ="java";
		char[] reverse = name.toCharArray();
		
		for(int i=name.length()-1;i>=0;i--)
		{
		System.out.print(reverse[i]);
		
		}System.out.println();
	}
		void using_builder()
		{		
			StringBuilder rev = new StringBuilder();
			rev.append("java");
			System.out.print(rev.reverse());	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reversestring obj = new Reversestring();
		obj.using_string();
obj.using_builder();
	}

}
