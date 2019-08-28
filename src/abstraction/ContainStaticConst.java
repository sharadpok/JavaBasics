package abstraction;
abstract class Bike3
{
 abstract void run();

Bike3()
{
System.out.println("Bike is created");
}
public void changeGrear()
{
System.out.println("Gear changed");	
}
public static void staticMethod()
{
System.out.println("This is static method");	
}
public final void finalMethod()
{
System.out.println("This is final method");	
}
}
class Honda1 extends Bike3
{
public void run()
{
System.out.println("Bike is running safely");	
}
}
public class ContainStaticConst
{

	public static void main(String[] args)
	{
		Honda1 h=new Honda1();
		h.changeGrear();
		Bike3.staticMethod();  // Called using direcly class name
		h.staticMethod();      // called by using creating object
		h.finalMethod();

	}

}
