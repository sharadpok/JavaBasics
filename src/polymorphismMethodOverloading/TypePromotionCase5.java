package polymorphismMethodOverloading;

public class TypePromotionCase5
{
public void m1(int x)
{
System.out.println("Genral Method");	
}
public void m1(int...x)
{
System.out.println("var..arg Method");	
}
	public static void main(String[] args)
	{
		TypePromotionCase5 ref=new TypePromotionCase5();
		ref.m1();// var-arg
		ref.m1(10,20);  //var-arg
		ref.m1(12);// general-method

	}

}
