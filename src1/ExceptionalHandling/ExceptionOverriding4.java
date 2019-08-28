package ExceptionalHandling;
/*If the superclass method declares an exception, subclass 
overridden method can declare same exception. */


class Parent3
{
public void m1() throws ArithmeticException
{
System.out.println("Parent method");	
}
}
public class ExceptionOverriding4 extends Parent3
{
	public void m1() throws ArithmeticException
	{
	System.out.println("Child method");	
	}
	public static void main(String[] args) 
	{
		ExceptionOverriding4 ref=new ExceptionOverriding4();
		ref.m1();

	}

}
