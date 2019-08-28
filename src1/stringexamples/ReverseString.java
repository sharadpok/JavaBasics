package stringexamples;

public class ReverseString
{

	public static void main(String[] args)
	{
       String name="sharad kalyan pokale is my full name	";
       int length=name.length();
       System.out.println(length);
       for(int i=length-1;i>=0;i--)
       {
    	   System.out.print(name.charAt(i));
       }
	}
}
