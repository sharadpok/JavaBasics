package ExceptionalHandling;

public class TryCatchExample1
{

	public static void main(String[] args)
	{
		// If exception is occurred in the try block then remaining 
		//code will not be execute.Hence always note that do not include the statements which are not throwing the exception in the try block.
		
		try
		{
		int res=45/0;
		System.out.println("Rest of the code");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
