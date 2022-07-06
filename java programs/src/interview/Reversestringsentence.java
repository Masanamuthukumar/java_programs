package interview;

public class Reversestringsentence {
	
	void using_string()
	{
	
		String sentence ="I am a tester";
		String reversed="";
		String[] array_sentence = sentence.split(" ");
		for(int i=array_sentence.length-1;i>=0;i--)
		{
			//reversed=reversed+array_sentence[i];
			System.out.print(array_sentence[i]+" ");	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reversestringsentence obj = new Reversestringsentence();
	obj.using_string();
	}

}
