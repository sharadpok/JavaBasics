package polymorphismMethodOverriding;
class Vehicle
{
public void run()
{
System.out.println("Vehicle is running");	
}
}
class Bike extends Vehicle
{
public void run()
{
System.out.println("Bike is running safely");	
}
}
public class GeneralExample
{

	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.run();
		
		Vehicle v=new Vehicle();
		v.run();
		
		Vehicle v1=new Bike();
		v1.run();
		/*Here v1 is type of Vehicle so it will take 
		method from the vehicle class, but runtime it will execute
		it from the child class i.e. bike class.*/

	}

}
