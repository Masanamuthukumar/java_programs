package interview;

public class smallestnumber {
	
	void smallnumber()
	{
		int[] number = {7,10,20,30,5,40,50,2};
		int min=number[0];
		int max=number[0];
		int second=0;
		for(int i=0;i<number.length;i++)
		{
			if(min>number[i])
			{
				min=number[i];
			}
			if(max<number[i])
			{
				second=max;
				max=number[i];
				
			}
		}System.out.println("Minimum value = "+min);
		System.out.println("Maximum value = "+max);
		System.out.println("Second Maximum value = "+second);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestnumber obj = new smallestnumber();

	obj.smallnumber();
	}

}
