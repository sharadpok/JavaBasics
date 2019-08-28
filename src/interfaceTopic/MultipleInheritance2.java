package interfaceTopic;
interface Drawable2
{
void print();	
}
interface Printable2
{
void print();	
}
public class MultipleInheritance2 implements Drawable2,Printable2
{

	public void print()
	{
		System.out.println("Hello");
		
	}
	public static void main(String[] args)
	{
		MultipleInheritance2 ref=new MultipleInheritance2();
		ref.print();

	}

}
