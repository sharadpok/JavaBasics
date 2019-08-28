package stringMethods;

public class CompareToBlankString
{

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="";
		System.out.println(s1.compareTo(s2));  //+ve
		System.out.println(s2.compareTo(s1));  //-ve

	}

}
