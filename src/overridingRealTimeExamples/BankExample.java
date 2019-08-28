package overridingRealTimeExamples;
class Bank
{
public int getRateOfInterest()
{
return 0;	
}
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
}class SBI extends Bank
{
public int getRateOfInterest()
{
return 7;	
}
}
public class BankExample
{

	public static void main(String[] args)
	{
		Bank b;
		b=new ICICI();
		System.out.println("ICICI:"+b.getRateOfInterest());
		b=new SBI();
		System.out.println("ICICI:"+b.getRateOfInterest());
		b=new AXIS();
		System.out.println("ICICI:"+b.getRateOfInterest());
		

	}

}
