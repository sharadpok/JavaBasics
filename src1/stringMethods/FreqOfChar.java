package stringMethods;

public class FreqOfChar {

	public static void main(String[] args)
	{
		String s="Welcome to javatpoint portal";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='t')
			{
				count++;
				
			}
		}
		System.out.println("Frequency of character t is: "+count);
	}

}
