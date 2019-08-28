package inheritance;
class Animal1
{
public void eat()
{
System.out.println("Eating");	
}
}
class Dog1 extends Animal1
{
public void bark()
{
System.out.println("Barking");	
}
}
class BabyDog extends Dog1
{
public void weep()
{
System.out.println("Weeping");	
}
}
public class MultiLevelInheritance
{

	public static void main(String[] args)
	{
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();

	}

}
