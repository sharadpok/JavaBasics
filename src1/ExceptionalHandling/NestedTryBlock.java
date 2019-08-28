package ExceptionalHandling;

public class NestedTryBlock {

	public static void main(String[] args)
	{
		try
		{
			try
			{
				System.out.println("Going to divide");
				int res=56/0;
			}catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception: "+e);
			}
			try
			{
				System.out.println("Calculating the length");
				String s=null;
				System.out.println(s.length());
			}catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringBound Exception: "+e);
			}
			}
			catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Normal flow");

	}

}
