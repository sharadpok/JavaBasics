package dataTypes;

public class Downcasting
{

	public static void main(String[] args)
	{
		// Down-casting: convert the data from bigger data type to the smaller data type in terms of the size.
        // double-->float-->long-->int-->short-->byte
		
		double d=123.345;
		System.out.println("double: "+d);
		float f=(float) d;
		System.out.println("float: "+f);
		long l=(long)f;                      // converting from float to long--> decimal point numbers are lost
		System.out.println("Long: "+l);
		int i=(int)l;
		System.out.println("int: "+i);
		short s=(short)i;
		System.out.println("short: "+s);
		byte b=(byte)s;
		System.out.println("byte: "+b);
	}

}
