package interfaceTopic;
class A
{
interface It1
{
	void m1();
}
}
public class InterfaceWithinClass implements A.It1
{
public void m1()
{
System.out.println("M1-Method");	
}
	public static void main(String[] args)
	{
		InterfaceWithinClass obj=new InterfaceWithinClass();
		obj.m1();

	}

}
