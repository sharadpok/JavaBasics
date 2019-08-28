package dataTypes;

public class Upcasting
{

	public static void main(String[] args)
	{
		// Upcasting: Converting the data from the lower data type to the bigger data type.
		// byte-->short-->int-->long-->float-->double
		
		byte rollNumber=120;
		System.out.println("Byte Value: "+rollNumber);
		short s=rollNumber;
		System.out.println("short value: "+s);
		int i=s;
		System.out.println("int value: "+i);
		long l=i;
		System.out.println("Long value: "+l);
		float f=l;
		System.out.println("Float value: "+f);
		double d=f;
		System.out.println("Double value: "+d);
		
		//Note: we can directly assign the value to the char from 0 to 65535, but if this value is in the another data
		// we have to do the explicit type casting.
		
		char c=0;
		char c1=65535;
		//char c2=-1;  getting error.
		//char c3=65536;  it will treat it as a int and say convert it from int to char

	}

}
