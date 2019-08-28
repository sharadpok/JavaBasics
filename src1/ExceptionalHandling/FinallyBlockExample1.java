package ExceptionalHandling;

public class FinallyBlockExample1
{

	public static void main(String[] args)
	{
		try
		{
			int res=78/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}

	}

}
