package interfaceTopic;
interface It9
{
void m1();	
}
interface It10
{
void m2();	
}
interface It11 extends It9,It10
{
void m3();	
}
public class Case5 implements It11 
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
		Case5 obj=new Case5();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
