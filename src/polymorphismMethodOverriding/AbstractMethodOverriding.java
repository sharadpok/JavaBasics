package polymorphismMethodOverriding;
abstract class Animal
{
abstract void eat();
}
class Dog extends Animal
{
public void eat()
{
System.out.println("eating bread");	
}
}
public class AbstractMethodOverriding {

	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.eat();
		
		//Animal a=new Animal(); we caanot create the object of abstract class
		/* Animal a=new Dog();
		 a.eat(); // Here output will come because though the type oa
		 a is animal but runtime it is executig method from the 
		 Dog class so no any error.*/

	}

}
