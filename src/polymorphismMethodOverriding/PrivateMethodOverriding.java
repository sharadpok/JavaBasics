package polymorphismMethodOverriding;
class BaseClass
{
private void m1()
{
System.out.println("Parent class private method");	
}
}
public class PrivateMethodOverriding extends BaseClass
{
private void m1()
{
System.out.println("Child Class Private method");	
}
	public static void main(String[] args)
	{
		PrivateMethodOverriding ref=new PrivateMethodOverriding();
		ref.m1();
		
		BaseClass obj=new BaseClass();
		//obj.m1();  As method is private it is not visible here.
		
		BaseClass obj1=new PrivateMethodOverriding();
		//obj1.m1(); Again it is not visible

	}

}
