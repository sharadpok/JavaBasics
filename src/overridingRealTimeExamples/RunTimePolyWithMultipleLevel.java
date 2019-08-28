package overridingRealTimeExamples;
class Animal1
{
public void eat()
{
System.out.println("eating");	
}
}
class Dog1 extends Animal1
{
public void eat()
{
System.out.println("eating fruits");	
}
}
class BabyDog extends Animal1
{
public void eat()
{
System.out.println("drinking milk");	
}
}
public class RunTimePolyWithMultipleLevel {

	public static void main(String[] args)
	{
		Animal1 a1,a2;
		a1=new Dog1();
		a1.eat();
		a2=new BabyDog();
		a2.eat();

	}

}
