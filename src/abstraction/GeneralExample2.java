package abstraction;
abstract class Shape
{
abstract public void draw();	
}
class Rectangle extends Shape
{
public void draw()
{
System.out.println("Draw the rectangle");	
}
}
class Circle extends Shape
{
public void draw()
{
System.out.println("Drawing the circle");	
}
}
public class GeneralExample2 {

	public static void main(String[] args)
	{
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();

	}

}
