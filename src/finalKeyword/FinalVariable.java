package finalKeyword;
/*If we declared any variable as a final then it is called as a final
variable and we cannot change the value of such variable*/
class Bike
{
	 public  final int speedLimit=40;
public void run()
{
//speedLimit=200;	 // C.E.--We cannot re-assign
}
}
public class FinalVariable
{

	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.run();

	}

}
