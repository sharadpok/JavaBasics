package interfaceTopic;
interface Drawable
{
void draw();	
}
class 	Rectangle implements Drawable
{
public void draw()
{
System.out.println("Draw Rectangle");	
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("Draw Circle");	
}
}
public class DrawExample2
{

	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.draw();
	    Rectangle re=new Rectangle();
	    re.draw();
	    

	}

}
