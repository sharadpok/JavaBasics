package polymorphismMethodOverloading;

public class TypePromotionCase1
{
public void m1(int a)
{
System.out.println("int-arg");	
}
public void m1(float a)
{
System.out.println("flaot-arg");	
}
	public static void main(String[] args)
	{	
		TypePromotionCase1 ref=new TypePromotionCase1();
		ref.m1(10); // int-arg
		ref.m1(12.45f); // float-arg
		ref.m1('a');// promote to integer= int-arg
		ref.m1(10l); // promote to float=float-arg
		
        /*Automatic promotion cases and flow
		byte-->short-->int-->long-->float-->double
		char-->int*/
	}

}
