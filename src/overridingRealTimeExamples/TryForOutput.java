package overridingRealTimeExamples;
class Animal2
{
public void eat()
{
System.out.println("eating");	
}
}
class Dog2 extends Animal2
{
public void eat()
{
System.out.println("dog is eating");	
}
}
public class TryForOutput extends Dog2
{

	public static void main(String[] args)
	{
		Animal2 aa=new TryForOutput();
		aa.eat();
}

}
/*Note: Since, TryForOutput is not overriding the eat() method, so eat() method of 
Dog class is invoked.*/
