package polymorphismMethodOverloading;
class Adder
{
public static int add(int a,int b)
{
return a+b;	
}
public static int add(int a,int b,int c)
{
return a+b+c;	
}
}
public class ChangingNoOfArguments
{

	public static void main(String[] args)
	{
			System.out.println(Adder.add(11, 11));
			System.out.println(Adder.add(11, 11,11));

	}

}
