package interfaceTopic;
interface It3
{
void m1();	
}
interface It4 extends It3
{
void m2();	
}
interface It5 extends It4
{
void m3();	
}
class Test3 implements It3
{
public void m1()
{
System.out.println("M1-Method");	
}
}
class Test4  implements It4
{
	public void m1()
	{
	System.out.println("M1-Method");	
	}
	public void m2()
	{
	System.out.println("M2-Method");	
	}
}
public class Case3 implements It5
{
	public void m1()
	{
	System.out.println("M1-Method");	
	}
	public void m2()
	{
	System.out.println("M2-Method");	
	}
	public void m3()
	{
	System.out.println("M3-Method");	
	}
	public static void main(String[] args)
	{
		Case3 obj=new Case3();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
