package inheritance;
class Animal2
{
public void eat()
{
System.out.println("Eating");	
}
}
class Dog3 extends Animal2
{
public void bark()
{
System.out.println("Barking");	
}
}
class Cat extends Animal2
{
public void mew()
{
System.out.println("mewwing");	
}
}
public class HierarchicalInheritance
{

	public static void main(String[] args)
	{
		Dog3 d=new Dog3();
		d.eat();d.bark();
		Cat c=new Cat();
		c.eat();
		c.mew();

	}

}
