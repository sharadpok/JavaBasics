package overridingRealTimeExamples;
class Shape1
{
	public void draw()
	{
		System.out.println("drwaing");
		
	}
}
class Circle extends Shape1
{
public void draw()
{
	System.out.println("Drawing the circle");}
}
class Rectangle extends Shape1
{
public void draw()
{
System.out.println("Drawing the rectagle");	
}
}
class Traingle extends Shape1
{
	public void draw()
	{
		System.out.println("Drawing traingle");
		
	}
}
public class Shape
{

	public static void main(String[] args)
	{
	 Shape1 s;
	 s=new Circle();
	 s.draw();
	 s=new Rectangle();
	 s.draw();
	 s=new Traingle();
	 s.draw();
	 
	 

	}

}
