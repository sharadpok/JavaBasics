package stringexamples;

public class PalindromeString {

	public static void main(String[] args)
	{
		String org="madam";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);	
		}
		if(org.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}else
		{
			System.out.println("Given String is not palindrome");
		}

	}

}
