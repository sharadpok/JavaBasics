package abstraction;
abstract class Bike
{
abstract public void run();	
}
class Honda extends Bike
{
public void run()
{
System.out.println("Bike is running safely");	
}
}
public class GeneralExample {

	public static void main(String[] args)
	{
	  Honda h=new Honda();
	  h.run();

	}

}
