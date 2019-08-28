package stringexamples;

public class RemoveAllWhiteSpaces
{

	public static void main(String[] args)
	{
		String sen="India  is       my      country       ";
		System.out.println(sen.replaceAll("\\s", ""));  // \\s to remove the spaces

	}

}
