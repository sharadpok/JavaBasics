package overridingRealTimeExamples;
class Animal
{
public void eat()
{
System.out.println("eating");	
}
}
class Dog extends Animal
{
public void eat()
{
System.out.println("eating bread");	
}
}
class Cat extends Animal
{
public void eat()
{
System.out.println("eating rat");	
}
}
class Lion extends Animal
{
public void eat()
{
System.out.println("Eating Meat");	
}
}
public class AnimalTest {

	public static void main(String[] args)
	{
		Animal a;
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a=new Lion();
		a.eat();

	}

}
