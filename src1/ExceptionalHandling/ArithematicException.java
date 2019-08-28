package ExceptionalHandling;

public class ArithematicException {

	public static void main(String[] args)
	{
		try {
		int res=100/0;
		System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");

	}

}
