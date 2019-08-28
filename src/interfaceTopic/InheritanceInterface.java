package interfaceTopic;
interface Drawable3
{
void draw();	
}
interface Printable3 extends Drawable3
{
void print();	
}

public class InheritanceInterface implements Printable3
{
public void draw()
{
System.out.println("Drawaing");	
}
public void print()
{
System.out.println("Printinh hello");	
}
	public static void main(String[] args)
	{
		InheritanceInterface ref=new InheritanceInterface();
		ref.draw();
		ref.print();

	}

}
