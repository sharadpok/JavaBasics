package interfaceTopic;
interface It6
{
void m1();	
}
interface It7 extends It6
{
	void m2();
}
interface It8 extends It7
{
void m3();	
}
class Test5 implements It6
{
public void m1()
{
System.out.println("M1-method");	
}
}
class Test6 extends Test5 implements It7
{
public void m2()
{
System.out.println("M2-Method");	
}
}
public class Case4 extends Test6 implements It8
{
	public void m3()
	{
		System.out.println("M3-Method");
	}
public static void main(String[] args)
	{
		Case4 obj=new Case4();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
