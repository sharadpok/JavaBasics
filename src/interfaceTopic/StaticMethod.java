package interfaceTopic;
interface Drawable5
{
void draw();
public static void staticMethod()
{
	System.out.println("Static Methods");	
}
}
class Rectabgle5 implements Drawable5
{
public void draw()
{
System.out.println("Drawaing Rectangle");	
}
}
public class StaticMethod {

	public static void main(String[] args)
	{
		Rectabgle5 ref=new Rectabgle5();
		ref.draw();
		
		Drawable5.staticMethod();

	}

}
