package polymorphismMethodOverriding;
class Main
{
Main get()
{
return this;	
}
}
class SubMain extends Main
{
SubMain get()
{
System.out.println("Covariant return type");
return this;
}
}
public class CovariantReturnType1
{

	public static void main(String[] args)
	{
        SubMain sm=new SubMain();
        sm.get();
        // We can write the above statement is like below
        new SubMain().get();
	}

}
