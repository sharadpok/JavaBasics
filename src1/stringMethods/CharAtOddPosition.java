package stringMethods;

public class CharAtOddPosition {

	public static void main(String[] args)
	{
		String s="Welcome to the java world";
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("Char At "+i+" place is:"+s.charAt(i));
			}
			
		}

	}

}
