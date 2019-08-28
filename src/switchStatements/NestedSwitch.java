package switchStatements;

public class NestedSwitch {

	public static void main(String[] args)
	{
		int x=20,y=20;
		switch(x)
		{
		case 10: System.out.println("10");
		break;
		
		case 20:
			switch(y)
			{
			case 10:System.out.println("U are in inner switch-10");
			break;
			
			case 20: System.out.println("U are in inner switch-20");
			break;
			
			default: System.out.println("Not valid number");
			}
			break;
		default: System.out.println("Invalid Number");	
		}

	}

}
