package dataTypes;

public class AllDataType
{
static byte b;
static short s;
static int i;
static long l;
static float f;
static double d;
static char c;
static boolean B;
	public static void main(String[] args)
	{
		//1. byte 
		byte roll_Number=127;
		System.out.println(roll_Number);
		byte b2=(byte)-129;     // type mismatch, cannot convert from int to byte
		System.out.println(b2); // circular pattern hence output will be= 127
		System.out.println("Byte deafault value: "+b);
		
		//2. short
		
		short s1=-32768;
		System.out.println(s1);
		short s2=(short) -32769;
	    System.out.println(s2);
	    System.out.println("short deafault value: "+s);
	    
	    // 3. int
	    
	    int i1=777232444;
	    System.out.println(i1);
	   // int i2=23448557522;  -- As this is the defalt type so it will not convert to any other data types but will give
	    //error like out of range.
	    System.out.println("integer default value is: "+i);
	    
	    // 4. long
	    
	    long l1=12324334343L;  // If L is not give, it will consider as int value and ll give out of range error.
	    System.out.println(l1);
	    System.out.println("Long default value is: "+l);
	    
	    // 5. float
	    
	    float f1=23.454F;  // If "F" is not written then it will treat as double, while double to float is downcasting,
	    // so explicitly we have to convert from double to the float.
	    System.out.println(f1);
	    float f2=(float)34344.5656;
	    System.out.println(f2);
	    System.out.println("Bt deafualt value for the float is: "+f);
	    
	    // 6. double
	    
	    double d1=23444554456784.34545433567866544;
	    System.out.println(d1);
	    System.out.println("Default value for the double is: "+d);
	    
	    // 7. char
	    char c1= 'A';
	    System.out.println(c1);
	    System.out.println("By default value of the char is: "+c);
	    
	    
	    // 8. boolean 
	    boolean B1=true;
	    boolean B2=false;
	    System.out.println(B1+" "+B2);
	    System.out.println("By deafault value is: "+B);;
	    

	}

}
