package polymorphismMethodOverloading;

public class TypePromotionCase4
{
public void m1(int a,float b)
{
System.out.println("int-float version");	
}
public void m1(float b,int a)
{
System.out.println("float-int version");	
}
	public static void main(String[] args)
	{
		TypePromotionCase4 ref=new TypePromotionCase4();
		ref.m1(10, 23.5f); // int-float
		ref.m1(34.5f, 12); // float-int
		//ref.m1(12, 12); //  mbiguous due o trying type promotion.

	}

}
