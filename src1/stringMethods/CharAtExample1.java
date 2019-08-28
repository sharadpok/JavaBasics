package stringMethods;

public class CharAtExample1
{

	public static void main(String[] args)
	{
		String s="Welcome";
		char ch=s.charAt(10);// StringIndexOutOfBoundsException
		System.out.println(ch);

	}

}
