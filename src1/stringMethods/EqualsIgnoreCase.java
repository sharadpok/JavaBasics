package stringMethods;

public class EqualsIgnoreCase {

	public static void main(String[] args)
	{
		String s1="sharad";
		String s2="sharad";
		String s3="SHARAD";
		String s4="Pokale";
		System.out.println(s1.equalsIgnoreCase(s2)); //rtue
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println(s1.equalsIgnoreCase(s4)); // false

	}

}
