package interfaceTopic;
interface It2
{
void m1();
void m2();
void m3();
}
abstract class Test implements It2
{
	public void m1()
	{
		System.out.println("M1-Method");
	}
}
abstract class Test1 extends Test
{
public void m2()
{
System.out.println("M2-Method");	
}
}

public class Case2 extends Test1
{
 public void m3()
 {
	 
	 System.out.println("M3-Method");
 }
	public static void main(String[] args)
	{
		Case2 obj=new Case2();
		obj.m1();
		obj.m2();
		obj.m3();
		

	}

}
