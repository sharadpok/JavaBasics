package constructor;
class Parent1
{

	Parent1()
	{
		System.out.println("This is parent class");
	}
}	
class Child1 extends Parent1
{
	
	Child1()
	{
		
		System.out.println("This is child class");
	}
	

}
public class SuperAndThisMethods
{
public static void main(String[] args)
	{
	  Child1 c=new Child1();
	  

	}

}
