package polymorphismMethodOverriding;
/*We cannot override static method as a non-static method and vice versa
But if both methods are static then method hiding is happened
instead of the method overriding.*/
class Parent2
{
public static void property()
{
System.out.println("land,House");	
}
}
class Child2  extends Parent2
{
public static void property()
{
System.out.println("Car,job");	
}
}
public class OverridingForStaicMethod {

	public static void main(String[] args)
	{
		Child2 ch=new Child2();
		ch.property();  //Child
		
		Parent2 p=new Parent2();
		p.property();  // parent
		
		Parent2 p1=new Child2();
		p1.property(); // parent
	}

}
