package ExceptionalHandling;

import java.io.IOException;

public class ThrowsExample2
{
public void m1()throws IOException
{
throw new IOException("Device Error");	
}
	public static void main(String[] args) throws IOException
	{
		ThrowsExample2 obj=new ThrowsExample2();
		obj.m1();
		System.out.println("Normal flow");

	}

}
