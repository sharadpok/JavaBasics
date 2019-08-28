package accessModifiers;
class A
{
private int data=10;
private void msg()
{
System.out.println("Hello");
}
}
public class Private {

	public static void main(String[] args)
	{
		A obj=new A();
//as data members are private we cannot access them.		
//System.out.println(obj.data);
		//obj.msg();

	}

}
