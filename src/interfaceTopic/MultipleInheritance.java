package interfaceTopic;
interface Printable1
{
void print();	
}
interface Drawable1
{
void draw();	
}

public class MultipleInheritance implements Printable,Drawable

{
	public void print()
	{
		System.out.println("Hello");
		
	}
	public void draw()
	{
		System.out.println("Welcome");
		
	}

	public static void main(String[] args)
	{
		MultipleInheritance ref=new MultipleInheritance();
		ref.print();
		ref.draw();

	}

}
