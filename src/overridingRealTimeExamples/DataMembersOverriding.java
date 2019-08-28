package overridingRealTimeExamples;
class Bike
{
int speedLimit=90;	
}
class Splendor extends Bike
{
int speedLimit=100;	
}
public class DataMembersOverriding
{

	public static void main(String[] args)
	{
		Bike b=new Splendor();
	    System.out.println(b.speedLimit);
	    
	    Splendor s=new Splendor();
	    System.out.println(s.speedLimit);

	}

}
