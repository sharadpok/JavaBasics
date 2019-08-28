package switchStatements;

public class SimpleExample {

	public static void main(String[] args)
	{
		int number=30;// Declaring the variable for the switch expression
		// similarly, we can use byte, short as well
		switch(number)
		{
		case 10:System.out.println("10");
		break;
		
		case 20:System.out.println("20");
		break;
		
		case 30:System.out.println("30");
		break;
		
		default:System.out.println("Not in 10, 20, 30");
		
		}

	}

}
