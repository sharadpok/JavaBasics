package ExceptionalHandling;

import java.io.IOException;

public class ThrowsExample1 
{
public void m1()throws IOException
{
System.out.println("Device Operation performed");	
}
	public static void main(String[] args)throws IOException
	{
		ThrowsExample1 ref=new ThrowsExample1();
		ref.m1();
		System.out.println("Normal flow");

	}

}
