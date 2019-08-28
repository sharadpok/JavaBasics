package polymorphismMethodOverloading;
class Add
{
public static int addition(int a,int b)
{
	return a+b;
}
public static float addition(float a,float b)
{
return a+b;	
}
}
public class ChangingDataTypes
{

	public static void main(String[] args)
	{
		System.out.println(Add.addition(10, 20));
		System.out.println(Add.addition(12.45f,43.56f));

	}

}
