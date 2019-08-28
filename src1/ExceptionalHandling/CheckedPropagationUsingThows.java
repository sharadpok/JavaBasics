package ExceptionalHandling;

import java.io.IOException;

public class CheckedPropagationUsingThows
{
void m1() throws IOException
{
throw new IOException("Device Error");	
}
public void m2() throws IOException
{
m1();	
}
public void m3()
{
try
{
m2();	
}catch(IOException e)
{
System.out.println("Exception handled");	
}
}
	public static void main(String[] args)
	{
		CheckedPropagationUsingThows ref=new CheckedPropagationUsingThows();
		ref.m3();
		System.out.println("Normal flow");

	}

}
