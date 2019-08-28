package ExceptionalHandling;
/*If the superclass method declares an exception, subclass 
overridden method can declare subclass exception. */


class Parent4
{
public void m1() throws RuntimeException
{
System.out.println("Parent method");	
}
}
public class ExceptionOverriding5 extends Parent4
{
	public void m1() throws ArithmeticException
	{
	System.out.println("Child method");	
	}
	public static void main(String[] args) 
	{
		ExceptionOverriding5 ref=new ExceptionOverriding5();
		ref.m1();

	}

}

