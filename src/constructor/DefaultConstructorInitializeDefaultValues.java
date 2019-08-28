package constructor;
class Bike1
{
int id;
String s;
public void display()
{
System.out.println(id+" "+s);	
}
}
public class DefaultConstructorInitializeDefaultValues {

	public static void main(String[] args)
	{
		Bike1 s=new Bike1();
		s.display();

	}

}
