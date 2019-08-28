package interfaceTopic;
interface It1
{
void m1();
void m2();
void m3();
}

public class Case1 implements It1 
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
		Case1 obj=new Case1();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
