package interfaceTopic;
/*Implementation class has to implement all the methods of the
interface though user has not enough knowledge about all the methods
Hence adaptor class is used which acts as a bridge between interface
and the implementation class*/
interface Interface2
{
void m1();
void m2();
}
class Adaptor implements Interface2
{
public void m1() {}
public void m2() {}
}
public class AdaptorClass extends Adaptor
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
	  AdaptorClass obj=new AdaptorClass();
	  obj.m1();
	  obj.m2();
	

	}

}
