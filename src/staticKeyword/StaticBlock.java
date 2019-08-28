package staticKeyword;

public class StaticBlock
{

	static
	{
		System.out.println("It is invoked before the main method");
	}
	public static void main(String[] args)
	{
 		
System.out.println("It is invoked after static block");
	}
	
}

/*Can we execute java program without main method?
No, one of the ways was the static block, but it was possible 
till JDK 1.6. Since JDK 1.7, it is not possible to execute a 
java class without the main method.*/
