package interview;

public class trianglepatterns {
	
	void triangle_pattern()
	{
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}
		
	}
	void triangle_pattern_reverse()
	{
		
		for(int i=6;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		trianglepatterns obj = new trianglepatterns();
	//obj.triangle_pattern();
	obj.triangle_pattern_reverse();
	}

}
