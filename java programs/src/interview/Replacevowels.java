package interview;

public class Replacevowels {
	
	void charcters()
	{
		String name = "MASANA";
		char[] original = name.toCharArray();
		
		int count=0;
		for(int i=0;i<original.length;i++)
		{
			if(name.charAt(i)=='A')
			{
				count++;
			}
		}System.out.println(count+" times occurance happened in string.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Replacevowels obj = new Replacevowels();
		obj.charcters();	}

}
