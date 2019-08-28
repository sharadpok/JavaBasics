package switchStatements;

public class DefautCaseRules {

	public static void main(String[] args)
	{
		/*Following are the rules for the default case:
			1. We can take default case at most once
			2. It will execute only if no any case is matched
			3. We can write default case anywhere, but is it recomonded
			to write it in the last.*/
		int x=10;
		switch(x)
		{
		case 10: System.out.println("10");
		
		default: System.out.println("Default case");
		//default :System.out.println("Default");-- CE: The default case is already defined.
		}
		
		int y=10;
		switch(y)
		{
		default: System.out.println("Invalid number");
		break;
		
		case 12: System.out.println("12");
		}

	}

}
