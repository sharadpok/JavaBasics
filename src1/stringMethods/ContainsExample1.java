package stringMethods;

public class ContainsExample1
{

	public static void main(String[] args)
	{
		String s1="What do you know about me";
		System.out.println(s1.contains("do you know"));// true
		System.out.println(s1.contains("about"));  // true
		System.out.println(s1.contains("hello")); //false
		
		boolean b=s1.contains("me");
		System.out.println(b);  // true
		boolean b1=s1.contains("Me"); 
		System.out.println(b1);   // false
		 

	}

}
