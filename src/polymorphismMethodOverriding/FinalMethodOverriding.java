package polymorphismMethodOverriding;
class SuperClass
{
	public final void m1()
	{
		System.out.println("parent final method");
		
	}
}
public class FinalMethodOverriding extends SuperClass
{
//public final void m1()  //C.E= Cannot override final method
{
System.out.println("Child class final method");	
}
	public static void main(String[] args)
	{
		FinalMethodOverriding ref=new FinalMethodOverriding();
		ref.m1();

	}

}
