package switchStatements;

public class CaseLableIsConstant {

	public static void main(String[] args)
	{
		int x=10;
		final int y=20;
		switch(x)
		{
		case 10: System.out.println("10");
		break;
		
		//case y: System.out.println("20");-- Case expression must be
		//constant expression
		case y:System.out.println("20"); // As it is final
		break;
		}

	}

}
