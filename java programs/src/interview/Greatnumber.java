package interview;

public class Greatnumber {
	
	void greatestnumber()
	{
		int[] numbers = {100,200,30,40,50};
		int max = numbers[0];
		int sec=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(max<numbers[i])
			{
				sec= max;
				max = numbers[i];
			}
		}System.out.print(max+""+sec);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greatnumber obj = new Greatnumber();
		obj.greatestnumber();
		
	}

}
