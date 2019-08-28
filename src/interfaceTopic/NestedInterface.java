package interfaceTopic;
interface It15
{
interface It16
{
void m1();	
}
}
public class NestedInterface implements It15.It16
{
public void m1()
{
System.out.println("M1-Method");	
}
	public static void main(String[] args)
	{
		NestedInterface obj=new NestedInterface();
		obj.m1();

	}

}
