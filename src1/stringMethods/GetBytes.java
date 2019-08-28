package stringMethods;

public class GetBytes {

	public static void main(String[] args)
	{
		String s1="ABCDE";
		byte[] brr=s1.getBytes();
		for(int i=0;i<brr.length;i++)
		{
			System.out.println(brr[i]);
			
		}
		// getting back bytes to the string
		String s3=new String(brr);
		System.out.println(s3);

	}

}
