package stringMethods;

public class Length {

	public static void main(String[] args)
	{
		String s="sharad";
		System.out.println(s.length());
		if(s.length()>0)
		{
			System.out.println("String is not empty and lengh is: "+s.length());
			String s1="";
			if(s1.length()==0)
			{
				System.out.println("String is empty and length is: "+s.length());
			}
		}

	}

}
