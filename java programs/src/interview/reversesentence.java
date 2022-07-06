package interview;

public class reversesentence {
	
	void sentence()
	{
		String name = "I am a tester and a dev";
		String reverse="";
		String[] original = name.split(" ");
		
		for(int i=original.length-1;i>=0;i--)
		{
			System.out.print(original[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reversesentence obj = new reversesentence();
		obj.sentence();	}

}
