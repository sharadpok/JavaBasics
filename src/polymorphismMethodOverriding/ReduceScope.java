package polymorphismMethodOverriding;
class Animal1
{
	public void eat()
	{
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1
{
	//private  void eat() cannot reduce the scope
	//void eat()
	//protected void eat()
	public void eat()
	 {
		 System.out.println("eating by the animal");
	 }	
}
public class ReduceScope extends Animal1
{

	public static void main(String[] args)
	{
		Dog1 d=new Dog1();
		d.eat();

	}

}
