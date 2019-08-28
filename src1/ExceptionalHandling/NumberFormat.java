package ExceptionalHandling;

public class NumberFormat {

	public static void main(String[] args)
	{
		try
		{
		String s="ten";
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the program");

	}

}
