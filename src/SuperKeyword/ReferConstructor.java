package SuperKeyword;
class Animal2
{
Animal2()
{
System.out.println("Animal is present");	
}
}
class Dog2 extends Animal2
{
Dog2()
{
	super();
System.out.println("Dog is present");	
}
}
public class ReferConstructor {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		

	}

}
