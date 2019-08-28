package stringBuffer;

public class Capacity 
{

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.append("sharad"));
		System.out.println(sb.capacity());
		System.out.println(sb.append("java is my favorite language"));
		System.out.println(sb.capacity());
		
		

	}

}
