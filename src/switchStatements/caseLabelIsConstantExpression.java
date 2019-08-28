package switchStatements;

public class caseLabelIsConstantExpression {

	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		switch(x+1) // Expression can be used
		{
		case 11:System.out.println("11");
		break;
		
		case 10+20+10:System.out.println("40");// we can use constant expression
		break;
		}

	}

}
