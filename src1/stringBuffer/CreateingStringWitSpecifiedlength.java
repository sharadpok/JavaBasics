package stringBuffer;

public class CreateingStringWitSpecifiedlength
{

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer(20);
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		

	}

}
