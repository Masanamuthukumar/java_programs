package interview;

public class positionofstring {
	
	void position()
	{
		String name = "abcd";
		char position_to_find= 'd';
		
		char[] original = name.toCharArray();
		for(int i=0;i<original.length;i++)
		{
			if(name.charAt(i)==position_to_find)
			{
				System.out.print(name.indexOf(position_to_find));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		positionofstring obj = new positionofstring();
		obj.position();	}

}
