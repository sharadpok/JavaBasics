package polymorphismMethodOverriding;
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
return 7;	
}
}
class SBI extends Bank
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
public class RealTimeExampleOfMethodOverriding {

	public static void main(String[] args) {
		ICICI i=new ICICI();
		System.out.println("ICICI rate of Interest: "+i.getRateOfInterest());
		SBI s=new SBI();
		System.out.println("SBI rate of Interest: "+s.getRateOfInterest());
		AXIS a=new AXIS();
		System.out.println("AXIS rate of Interest: "+a.getRateOfInterest());

	}

}
