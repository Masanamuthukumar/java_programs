package interview;

public class Duplicateinstring {
	
	void duplicate_in_string()
	{
		String name = "java";
		System.out.println("Duplicates are : ");
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.print(name.charAt(i));
				}
			}
			
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duplicateinstring obj = new Duplicateinstring();
		obj.duplicate_in_string();
		
	}

}
