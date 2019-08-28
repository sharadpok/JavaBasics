package ExceptionalHandling;
/*If the superclass method declares an exception, subclass 
 method declares no any exception. */


class Parent5
{
public void m1() throws ArithmeticException
{
System.out.println("Parent method");	
}
}
public class ExceptionOverriding6 extends Parent5
{
	public void m1() 
	{
	System.out.println("Child method");	
	}
	public static void main(String[] args) 
	{
		ExceptionOverriding6 ref=new ExceptionOverriding6();
		ref.m1();

	}

}
