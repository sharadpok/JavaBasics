package stringMethods;

public class ConcatExample1 {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="JavatPoint";
		String s3="Reader";
		String s4=s1.concat(s2);
		System.out.println(s4);
		// concating multiple Strings
		
		String s5=s1.concat(s2).concat(s3);
		System.out.println(s5);
		String s6=s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s6);
		String s7=s1.concat("!!!");
		System.out.println(s7);
		System.out.println(s1.concat("@").concat(s2));
		
		

	}

}
