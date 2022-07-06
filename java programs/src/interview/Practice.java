package interview;

public class Practice {
	
	void reverse_string()
	{
		String name="masana";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	
	void builder_reverse()
	{
		StringBuilder one = new StringBuilder();
		one.append("masa");
		one.reverse();
		System.out.println(one);
	}
	void array_reverse()
	{
		String name="masa";
		char[] list = name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(list[i]);
		}
	}
	
	void duplicate()
	{
		String name="java";
		char[] list =name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(j));
				}
			}
		}
	}
	
	void fibonacci()
	{
		int number=7;
		int a=0,b=0,c=1;
		for(int i=0;i<number;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
	void greatnumber()
	{
		int[] num= {600,20000,300,480,50};
		
		int max = num[0];
		for(int i=0;i<num.length;i++)
			{
				if(max<num[i])
				{
					max=num[i];
				}
			
		}System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice obj = new Practice();
	//	obj.reverse_string();
		//obj.builder_reverse();
		//obj.array_reverse();
		obj.duplicate();
	obj.fibonacci();
	obj.greatnumber();
	}
}
