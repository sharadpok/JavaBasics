package constructor;
class Parent
{
int x=100;	
}
class Child extends Parent
{
int x=200;
public void display()
{
	
	System.out.println(this.x);  //calling child class instance variable
	System.out.println(super.x);//Calling parent class instance variable
}
}
public class SuperAndThisKeywords {

	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();

	}

}
