package polymorphismMethodOverloading;
class Addition
{
public static double add(int a,double b)
{
return 	a+b;
}
public static double add(double a, int b)
{
return a+b;	
}
}
public class ChangingOrder
{

	public static void main(String[] args)
	{
		System.out.println(Addition.add(10, 12.34));
		System.out.println(Addition.add(12.45, 32));

	}

}
