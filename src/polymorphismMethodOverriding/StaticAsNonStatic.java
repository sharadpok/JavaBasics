package polymorphismMethodOverriding;
class StaticMethod
{
public static void m1()
{
System.out.println("It is a static method");	
}
}
class NonStaticMethod extends StaticMethod
{
//public void m1()  Wecannot override static method as a non-static
{
	
}
}
public class StaticAsNonStatic {

	public static void main(String[] args)
	{
		

	}

}
