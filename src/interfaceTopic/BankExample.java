package interfaceTopic;
interface Bank
{
int getRateOfInterest();	
}
class ICICI implements Bank
{
public int getRateOfInterest()
{
return 7;	
}
}
class AXIS implements Bank
{
public int getRateOfInterest()
{
return 6;	
}
}
public class BankExample {

	public static void main(String[] args)
	{
		AXIS a=new AXIS();
		System.out.println(a.getRateOfInterest());
		ICICI i=new ICICI();
		System.out.println(i.getRateOfInterest());
		

	}

}
