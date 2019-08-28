package stringMethods;

public class GetChars {

	public static void main(String[] args)
	{
		String s1="sharad pokale";
		char[] name=new char[6];
		s1.getChars(7, 13, name, 0);
		System.out.println(name);

	}

}
