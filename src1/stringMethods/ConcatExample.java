package stringMethods;

public class ConcatExample {

	public static void main(String[] args)
	{
		String s1="Java String";
		String s2="is immutable";
		s1.concat(s2);
		System.out.println(s1);   // java String
		s1=s1.concat("is immutable so assign it explicitly");
		System.out.println(s1);

	}

}
