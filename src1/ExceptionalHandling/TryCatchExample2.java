package ExceptionalHandling;

public class TryCatchExample2 {

	public static void main(String[] args)
	{
		//Here i am using Exception,RuntimeException and ArithmeticException classes.
		
		try
		{
			int res=56/0;
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		/*catch(RuntimeException e)
		{
			System.out.println(e);
		}*/
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the program");

	}

}
