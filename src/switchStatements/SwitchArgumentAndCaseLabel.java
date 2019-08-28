package switchStatements;

public class SwitchArgumentAndCaseLabel {

	public static void main(String[] args)
	{
	byte b=10;
	switch(b+1)
	{
	case 11: System.out.println("11");
	break;
	
	case 1000: System.out.println("1000"); // because b+1=int result hence it will take int range
	break;
	
	}

	}

}
