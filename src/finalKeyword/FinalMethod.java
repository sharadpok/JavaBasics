package finalKeyword;
//If we declared the method as a final we cannot override it
class Bike1
{
public final void run()
{
System.out.println("Bike is running safely");	
}
}
class Honda extends Bike1 
{
/*public final void run()  //C.E.--Cannot override final method
{
System.out.println("Honda is running safely");
}*/
}
public class FinalMethod 
{

	public static void main(String[] args)
	{
	  Honda h=new Honda();
	  h.run();

	}

}
