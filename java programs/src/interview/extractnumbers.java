package interview;

public class extractnumbers {
	
	void charcters()
	{
		String name = "crmase24";
		
		char[] original = name.toCharArray();
		
		int total=0;
		
		for(int i=0;i<original.length;i++)
		{
			
			if(Character.isDigit(original[i]))
			{
			total=total+Character.getNumericValue(original[i]);	
			}
		}System.out.println(total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extractnumbers obj = new extractnumbers();
		obj.charcters();	}

}
