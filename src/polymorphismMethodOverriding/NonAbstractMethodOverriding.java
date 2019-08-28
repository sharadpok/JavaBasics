package polymorphismMethodOverriding;
class Fruit
{
public void ripe()
{
System.out.println("Fruit is riping");	
}
}
abstract class Mango extends Fruit
{
public abstract void ripe();	
}
public class NonAbstractMethodOverriding
{

	public static void main(String[] args)
	{
		Fruit f=new Fruit();
		f.ripe();
		//Mango m=new Mango();  Cannot create the object
		//Fruit f1=new Mango(); Cannot create the object
		}
}

/*Conclusion: This approach indicates that if we have to stop the 
availability of the parent method implementation to the next level
child class then it is used.*/
