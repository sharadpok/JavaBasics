package switchStatements;

public class CaseLabelOutOfRange {

	public static void main(String[] args)
	{
		byte b=10;
		switch(b)
		{
		case 10: System.out.println("10");
		break;
		
		//case 128: System.out.println("128");// It is out of range. But we can perform type casting over there
		case (byte)129:System.out.println("129");
		break;
		
		}

	}

}
