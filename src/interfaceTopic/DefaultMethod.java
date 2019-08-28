package interfaceTopic;
interface Drawable4
{
void draw();
default void msg()
{
System.out.println("This is default method");	
}
}
class Square implements Drawable4
{
public void draw()
{
System.out.println("Drawing square");	
}
}
public class DefaultMethod {

	public static void main(String[] args)
	{
         
		Square ref=new Square();
		ref.draw();
		ref.msg();
	}

}
