package interview;

public class characteroccurance {
	
	void charcters()
	{
		String name = "Masa";
		name=name.toLowerCase();
		char[] original = name.toCharArray();
		int add=0;
		for(int i=0;i<original.length;i++)
		{
			if((original[i]=='a')||(original[i]=='e')||(original[i]=='i')||(original[i]=='o')||(original[i]=='u'))
			{
				add++;
				original[i]='*';
				
			}System.out.print(original[i]);

		}System.out.println();
		System.out.println("Number of vowels present in the string "+add); 		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		characteroccurance obj = new characteroccurance();
		obj.charcters();	}

}
