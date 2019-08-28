package stringMethods;

public class EqualsExample {

	public static void main(String[] args)
	{
		String s1="javatpoint";
		String s2="javatpoint";
		String s3="JAVATPOINT";
		String s4="python";
		System.out.println(s1.equals(s2));   // true
		System.out.println(s1.equals(s3)); //false
		boolean b=s1.equals(s4);
		System.out.println(b); // false
		
		if(s1.equals(s2))
		{
			System.out.println("Both Strings are equal");
		}else
		{
			System.out.println("String are not equal");
		}
		

	}

}
