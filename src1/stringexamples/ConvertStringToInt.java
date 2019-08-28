package stringexamples;

public class ConvertStringToInt {

	public static void main(String[] args)
	{
		//1. String to int
		String num1="200";// we cannot put here sharad as string format is differnet.
		int i=Integer.parseInt(num1);
		System.out.println("Integer: "+i);
		
		//2.String to byte
		String num2="100";
		byte b=Byte.parseByte(num2);
		System.out.println("Byte: "+b);
		
		//3.String to short
		String num3="120";
		short s=Short.parseShort(num3);
		System.out.println("Short: "+s);
		
		//4.String to double;
		String num4="12.56";
		double d=Double.parseDouble(num4);
		System.out.println("Double:"+d);
		
		//5.String to float
		String num5="124.65";// Even if we do not write f at the end, still its accepting because, implicit down casting.
		float f=Float.parseFloat(num5);
		System.out.println("Float: "+f);
		
		//6.String to long
		String num6="1234";
		long l=Long.parseLong(num6);
		System.out.println("long: "+l);
		
		//7. String to boolean
		String boolean1="TRue";  // Here It is case insensitive and if it is other than true it will treat as a false.
		boolean b1=Boolean.parseBoolean(boolean1);
		System.out.println("Boolean: "+b1);
		
		//8.String to char Here we cannot convert String to char using ParseChar method because Character class does not
		//contain this method. Hence we can conver String to char by using getChars method as follows:
		String str="sharadpokale";
		char[] charArray=new char[9];
		str.getChars(0, 5, charArray, 0);
		System.out.println(charArray);
		
		
		
		
	}

}
