package accessModifiers;
/*Rule: If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception 
but can declare unchecked exception*/
class Parent
{
public void m1()
{
System.out.println("Parent Method");	
}
}
public class ExceptionOverriding2 extends Parent
{
public void m1() throws ArithmeticException
{
System.out.println("Child Method");	
}
	public static void main(String[] args)
	{
		ExceptionOverriding2 ref=new ExceptionOverriding2();
		ref.m1();

	}

}
