package interview;

public class stringcount {
	
	void using_string()
	{
	String name = "xyyyzzx";
	int countx=0,county=0,countz=0;
	boolean flagx,flagy,flagz;
	char[] name1 = name.toCharArray();
	//System.out.print(name1[0]);
	for(int i=0;i<name.length();i++)
	{
	if(name.charAt(0)==name1[i])
	{
		countx=countx+1;
		flagx=true;
	}
	if(name.charAt(1)==name1[i])
	{
		county=county+1;
		flagx=true;
	}
	if(name.charAt(4)==name1[i])
	{
		countz=countz+1;
		flagx=true;
	}
	}System.out.println("y :"+county);
	System.out.println("x :"+countx);
	System.out.println("z :"+countz);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringcount obj = new stringcount();
		obj.using_string();

	}

}
