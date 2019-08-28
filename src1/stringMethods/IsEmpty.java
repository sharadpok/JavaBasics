package stringMethods;

public class IsEmpty {

	public static void main(String[] args)
	{
		String s="sharad";
		System.out.println(s.isEmpty());
		String s2="";
		System.out.println(s2.isEmpty());
		if(s.length()==0 || s.isEmpty())
		{
			System.out.println("String is empty");
		}else
		{
			System.out.println(s);
		}
		if(s2.length()==0 || s2.isEmpty())
		{
			System.out.println("String is empty");
		}else
		{
			System.out.println(s2);
		}

	}

}
