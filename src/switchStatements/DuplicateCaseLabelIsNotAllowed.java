package switchStatements;

public class DuplicateCaseLabelIsNotAllowed {

	public static void main(String[] args)
	{
		int number=97;
		switch(number)
		{
		case 97:System.out.println("97");
		break;
		
		case 'b':System.out.println("98");
		break;
		
		//case 'a': System.out.println("97");-- It is duplicate case.
		
		/*case label notes:
			1. It should be constant Expression
			2. The value should be in the range of switch argument types
			3. It should not be duplicate*/
		}

	}

}
