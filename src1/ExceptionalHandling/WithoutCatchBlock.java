package ExceptionalHandling;

public class WithoutCatchBlock {

	public static void main(String[] args)
	{
		try
		{
			int res=78/0;
		}
		finally
		{
			System.out.println("Always Excuted");
		}

	}

}
