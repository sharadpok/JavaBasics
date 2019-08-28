package polymorphismMethodOverriding;
class Parent1
{
	/*Covariant return type is applicable only for object types
			but not for the premitive datat types*/
	public Number m1()
	{
		return 5;
	}
}
class Child1 extends Parent1
{
public Integer m1()
{
return 34;	
}
}
public class CovariantMethodOverriding2 {

	public static void main(String[] args) {
		
		Child1 c=new Child1();
		System.out.println(c.m1());

	}

}
