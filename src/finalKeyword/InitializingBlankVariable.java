package finalKeyword;
/*if final variable is not initialized at the time of the declaration
then such a variable is called as a blank or uninitialized variable
In such a case we only assign the value to it from constructor only*/
class Bike4
{
final int speedLimit;	
Bike4(int speedLimit)
{
this.speedLimit=speedLimit;
System.out.println("speed limit is:"+speedLimit);
}
}
public class InitializingBlankVariable
{

	public static void main(String[] args)
	{
		Bike4 b=new Bike4(56);
		

	}

}
