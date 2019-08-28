package stringMethods;

public class StartsWith {

	public static void main(String[] args)
	{
		String str="Sharad";
		System.out.println(str.startsWith("s"));// false
		System.out.println(str.startsWith("h"));// false
		System.out.println(str.startsWith("h", 1));// true

	}

}
