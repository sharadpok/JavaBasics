package SuperKeyword;
class Animal
{
String color="White";	
}
class Dog extends Animal
{
String color="Black";	

public void PrintColor()
{
	System.out.println(super.color);
	System.out.println(color);

}}
public class ReferInstanceVariable
{

	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.PrintColor();

	}

}
