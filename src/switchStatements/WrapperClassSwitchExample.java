package switchStatements;

public class WrapperClassSwitchExample {

	public static void main(String[] args)
	{
		Integer age=10;// using wrappr class for int type
		/*// similalry we can use wrapper class for
		1. short=Short
		2. byte= Byte
		3. char= Character*/
		switch(age)
		{
		case 16: System.out.println("You are under 18");
		break;
		
		case 18: System.out.println("You are eligible for the vote");
		break;
		
		case 65: System.out.println("You are senior citizen");
		break;
		
		default: System.out.println("please give the valid age");
		}
		

	}

}
