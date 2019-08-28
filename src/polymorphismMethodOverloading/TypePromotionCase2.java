package polymorphismMethodOverloading;

public class TypePromotionCase2
{
public void m1(String s)
{
System.out.println("String Version");	
}
public void m1(Object o)
{
System.out.println("Object Version");	
}

	public static void main(String[] args)
	{
		TypePromotionCase2 ref= new TypePromotionCase2();
		ref.m1("sharad");
		ref.m1(new Object());
		ref.m1(null); // Because it gives first preference to the child

	}

}
