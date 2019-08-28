package ExceptionalHandling;
/*Rule: If the superclass method does not declare an exception, 
subclass overridden method cannot declare
the checked exception. */
import java.io.IOException;

class Parent
{
public void m1()
{
System.out.println("Parent method");	
}
}
public class ExceptionOverriding1 extends Parent1
{
//public void m1() throws IOException   Compile time error
{
System.out.println("Child Method");	
}
	public static void main(String[] args)
	{
		ExceptionOverriding1 obj=new ExceptionOverriding1();
			obj.m1();

	}

}
