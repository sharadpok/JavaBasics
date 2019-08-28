package thisKeyword;
class A
{
A()
{
System.out.println("Default Const");	
}
A(int x)
{
this();
System.out.println(x);
}
}
public class callingDefaultConstFromParaConst
{

	public static void main(String[] args)
	{
		new A(10);

	}

}
