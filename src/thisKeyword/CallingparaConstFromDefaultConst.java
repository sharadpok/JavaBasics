package thisKeyword;
class Test
{
Test()
{
this(10);
System.out.println("This is Default Const");	
}
Test(int x)
{
	System.out.println(x);
}
}
public class CallingparaConstFromDefaultConst
{

	public static void main(String[] args)
	{
	   Test t=new Test();

	}

}
