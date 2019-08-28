package SuperKeyword;
class Animal1
{
public void eat()
{
System.out.println("Eating");	
}
}
class Dog1 extends Animal1
{
public void eat()
{
System.out.println("Eating Bread");	
}
public void callingBothMethods()
{
super.eat();
eat();
}
}
public class ReferInstanceMethod
{

	public static void main(String[] args)
	{
		Dog1 d=new Dog1();
		d.callingBothMethods();

	}

}
