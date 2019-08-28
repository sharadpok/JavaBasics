package polymorphismMethodOverriding;
class Parent
{
public Object m1()
{
return null;	
}
}
class Child extends Parent
{
public String m1()
{
return null;	
}
}
public class CovariantReturnType {

	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println(c.m1());

	}

}
