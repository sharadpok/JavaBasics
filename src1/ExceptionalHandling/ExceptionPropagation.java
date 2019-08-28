package ExceptionalHandling;

public class ExceptionPropagation
{
public void m1()
{
int res=90/0;	
}
public void m2()
{
m1();	
}
public void m3()
{
try
{
m2();	
}catch(Exception e)
{
System.out.println(e);	
}
}
	public static void main(String[] args)
	{
		ExceptionPropagation ref=new ExceptionPropagation();
		ref.m3();
			

	}

}
