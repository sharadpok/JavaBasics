package stringexamples;

public class CapitilizeFirstCharInWord
{

	public static void main(String[] args)
	{
	/*	String name="horse";
		char ch=name.charAt(0);
		String onlyChar=String.valueOf(ch);
		System.out.print(onlyChar.toUpperCase());
		System.out.println(name.substring(1));*/
		
		String name="capitilize";
		System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
		
	}

}
