package finalKeyword;
class Bike6
{
public final void run()
{
System.out.println("Bike is running");	
}
}

public class InheritedFinalMethod extends Bike6
{

	public static void main(String[] args) {
		new InheritedFinalMethod().run();

	}

}
