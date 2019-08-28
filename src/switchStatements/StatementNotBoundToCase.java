package switchStatements;

public class StatementNotBoundToCase {

	public static void main(String[] args)
	{
		/*Each and every sttement inside the switch should be under 
		the case.and If not then it will give complie time error.
		*/
		switch(1)
		{
		//int x=10;
		// syso-- It is writable over there and will give the error
		case 1:
			int x=10;
			System.out.println(x);
		}

	}

}
