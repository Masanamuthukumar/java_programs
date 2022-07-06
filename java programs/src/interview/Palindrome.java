package interview;

public class Palindrome {
	
String original = "aksa";
String rev = "";

void palindrome1()
{
for(int i=original.length()-1;i>=0;i--)
{
	rev = rev+original.charAt(i);
	
}

if(rev.equals(original))
	{
	System.out.println("Its a palindrome");
	}
	else
	{
		System.out.println("Its not a palindrome");	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj = new Palindrome();
		obj.palindrome1();
	}

}
