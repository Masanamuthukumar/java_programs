package interview;

public class findnumbersinarray {
	
	void find_number()
	{
		int[] number = {1,2,3,4,5,6,3};
		int find=3;
		int add=0;
		for(int i=0;i<number.length;i++)
		{
			if(find==number[i])
			{
				add++;
			
			}
		}	System.out.println(find+" number present in this array "+add+" times.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findnumbersinarray obj = new findnumbersinarray();
		obj.find_number();	}

}
