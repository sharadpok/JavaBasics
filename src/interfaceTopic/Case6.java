package interfaceTopic;
interface It12
{
void m1();
void m2();
}
interface It13
{
void m2();	
}
public class Case6 implements It12,It13
{
public void m1()
{
System.out.println("M1-Method");	
}
public void m2()
{
System.out.println("M2-Method");	
}
	public static void main(String[] args)
	{
		Case6 obj=new Case6();
		obj.m1();
		obj.m2();
		

	}

}
