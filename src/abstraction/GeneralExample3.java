package abstraction;
abstract class Bank
{
abstract public int getRateOfInterest();	
}
class ICICI extends Bank
{
public int getRateOfInterest()
{
return 8;	
}
}
class AXIS extends Bank
{
public int getRateOfInterest()
{
return 9;	
}
}
public class GeneralExample3 {

	public static void main(String[] args)
	{
		Bank b;
		b=new ICICI();
		;
		System.out.println("icici: "+b.getRateOfInterest());
		b=new AXIS();
		System.out.println("AXIS: "+b.getRateOfInterest());

	}

}
