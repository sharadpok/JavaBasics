package array;

public class LengthVsLengthMethod {

	public static void main(String[] args)
	{
		/*length is the final variable which is used to calculate size
		of the array where as length() is the string method used to
		calculate size of the string objects.*/
		
		String[] s= {"A","AA","AAA","AAAA"};
		System.out.println(s.length); // 4
		//System.out.println(s.length()); CE:
		//System.out.println(s[0].length); CE:
		System.out.println(s[0].length()); //1

	}

}
