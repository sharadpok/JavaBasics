package interfaceTopic;
interface Printable
{
void print();	
}
class A6 implements Printable
{
public void print()
{
	System.out.println("Hello");
}
}
public class Example1 
{
	public static void main(String[] args)
	{
		A6 a=new A6();
		a.print();	

	}

}
