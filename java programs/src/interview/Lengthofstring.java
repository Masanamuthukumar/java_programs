package interview;

public class Lengthofstring {
	
	void string_length()
	{
		String name= "Masa";
		char[] array_name = name.toCharArray();
		int length=0;
		for(char dummy:array_name)
		{
			length++;
		}System.out.println(length);
	}
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lengthofstring obj = new Lengthofstring();
	obj.string_length();
	}

}
