package stringMethods;

public class CompareToExample
{

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); // -ve
		System.out.println(s1.compareTo(s4)); // -ve
		System.out.println(s1.compareTo(s5)); // +ve

	}

}
