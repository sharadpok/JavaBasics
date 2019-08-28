package ExceptionalHandling;

public class FinallyBlockExample2 {

	public static void main(String[] args)
	{
		// As we are not handling the exception hence, finally block
		//is executing and then exception is occuring.
		try
		{
			int res=90/0;
			
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("it is always executed");
		}

	}

}
