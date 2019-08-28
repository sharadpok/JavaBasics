package ExceptionalHandling;

public class StringIndexOutOfBounds {

	public static void main(String[] args)
	{
		try
		{
		String s="sharad";
		System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the program");

	}

}
