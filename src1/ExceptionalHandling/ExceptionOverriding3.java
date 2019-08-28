package ExceptionalHandling;
/*If the superclass method declares an exception, subclass 
overridden method cannot declare parent exception. */
class Parent2
{
public void m1() throws ArithmeticException
{
System.out.println("Parent Method");	
}
}
public class ExceptionOverriding3 extends Parent2
{
	//public void m1() throws Exception  Compile time error
	{
	System.out.println("Child Method");	
	}
	public static void main(String[] args)
	{
		

	}

}
